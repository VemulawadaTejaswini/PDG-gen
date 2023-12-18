import java.util.Scanner;
import java.util.Arrays;

class ABC102C{
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int N = scan.nextInt();
                long a[] = new long[N];

                for (int i = 0; i < N; i++) {
                        a[i] = scan.nextInt();
                }

                sunukeSad(a, N);
        }

        private static void sunukeSad(long a[], int N){
                long b[] = new long[N];
                long c = 0;
                long result = 0;

                for (int i = 0; i < N; i++) {
                        b[i] = a[i] - i;
                }

                Arrays.sort(b);
                c = b[(N/2)];
                System.out.println(c);

                for (int i = 0; i < N; i++) {
                        result = result + Math.abs(b[i] - c);
                }

                System.out.println(result);
        }
}
