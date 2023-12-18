import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.setIn(Main.class.getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        int[] a = toArray(sc.nextLine());
        Arrays.sort(a);
        int barrier = a[n-1-b];
        int result=0;
        for (int i = n-1-b; i >= 0; i--) {
            boolean isCandidate = true;
            int larger = n-i-1;
            if(a[i]+m < barrier) break;

            else if(v <= i + b - 1 && a[i]+m >= barrier) {
                isCandidate = true;
            }

            else {
                int remainder = v - i - b + 1;
                int concurrent = n - i - b + 1;
                long total = ((long)remainder)*m;
                for (int j = 0; j < concurrent; j++) {
                    total -= (a[i]+m-a[j+i+1]);
                }
                isCandidate = (total <= 0);
            }
            if(isCandidate) result++;
        }
        System.out.println(result+b);
    }
    private static int nextInt(Scanner sc) {
        return Integer.valueOf(sc.nextLine());
    }
    private static int[] toArray(String text) {
        return Arrays.stream(text.split("\\s")).mapToInt(Integer::valueOf).toArray();
    }

}