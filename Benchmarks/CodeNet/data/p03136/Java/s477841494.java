import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            int n = s.nextInt();
            if (n == 0) break;
            int[] a = new int[n];
            for(int i=0;i<n;i++) {
                a[i] = s.nextInt();
            }

            int max = 0;
            int total = 0;
            for(int i=0;i<n;i++) {

                int v = a[i];
                if (v > max) {
                    max = v;
                }

                total += v;

            }

            total -= max;

            if(max < total) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}