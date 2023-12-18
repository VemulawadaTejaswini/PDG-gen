    import java.util.Arrays;
    import java.util.Scanner;
     
    public class Main {
     
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            long a[] = new long[N];
            long all = 0;
            long x = 0;
            long ans;
            ans = 1000000000L;
            for (int i = 0; N > i; i++) {
                a[i] = sc.nextInt();
                all += a[i];
            }
            for (int j = 0; N > j; j++) {
                x += a[j];
                if (j + 1 < N) {
                    ans = Math.min(ans, Math.abs(all - 2 * x));
                }
            }
            System.out.println(ans);
        }
    }