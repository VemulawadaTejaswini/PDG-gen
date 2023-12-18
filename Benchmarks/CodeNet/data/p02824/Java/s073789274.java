import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.setIn(Main.class.getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();
        int p = sc.nextInt();
        sc.nextLine();
        int[] a = toArray(sc.nextLine());
        Arrays.sort(a);
        int barrier = a[n-p];
        int result = 0;
        for (int i = n-1-p; i >= 0; i--) {
            boolean isCandidate;
            if(a[i]+m < barrier) break;

            else if(v <= i + p && a[i]+m >= barrier) {
                isCandidate = true;
            }

            else {
                int remainder = v - i - p;
                int concurrent = n - i - p;
                // 10 4 7
                long total = ((long)remainder)*m;
                for (int j = 0; j < concurrent; j++) {
                    total -= (a[i]+m-a[j+i+1]);
                    if(total <= 0) break;
                }
                isCandidate = (total <= 0);
            }
            if(isCandidate) result++;
            else break;
        }
        System.out.println(result+p);
    }

    private static int[] toArray(String text) {
        return Arrays.stream(text.split("\\s")).mapToInt(Integer::valueOf).toArray();
    }

}