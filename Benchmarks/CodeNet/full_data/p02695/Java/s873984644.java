import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        int[] a, b, c;
        a = new int[Q];
        b = new int[Q];
        c = new int[Q];
        long[] d = new long[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
            d[i] = scanner.nextLong();
        }

        if(Q == 1) {
            System.out.println(d[0]);
            return;
        }

        int[] aa = new int[11];

        long max = 0;
        int mm = (int)Math.pow(10, N);
        for (int i = 0; i < mm; i++) {
            int num = i;
            aa[1] = num % 10; num /= 10;
            aa[2] = num % 10; num /= 10;
            aa[3] = num % 10; num /= 10;
            aa[4] = num % 10; num /= 10;
            aa[5] = num % 10; num /= 10;
            aa[6] = num % 10; num /= 10;
            aa[7] = num % 10; num /= 10;
            aa[8] = num % 10; num /= 10;
            aa[9] = num % 10;
            long tmp = 0;
            for (int q = 0; q < Q; q++) {
                if(aa[b[q]] - aa[a[q]] == c[q]){
                    tmp += d[q];
                }
            }
            max = Math.max(max, tmp);
        }

        System.out.println(max);
    }
}
