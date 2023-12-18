import java.util.Scanner;

public class Main {
    static int N;
    static long[] a;
    static long[] b;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        a = new long[N + 1];
        b = new long[N];
        for(int i = 0; i <= N; i++) {
            a[i] = scanner.nextLong();
        }
        for(int i = 0; i < N; i++) {
            b[i] = scanner.nextLong();
        }
        scanner.close();
    }


    public static void main(String[] args) {
        init();

        long kill = 0;
        for(int i = 0; i < N; i++) {
            long remainPowser = 0;
            if(b[i] > a[i]) {
                remainPowser = Math.min(b[i] - a[i], a[i + 1]);
                if(a[i + 1] > remainPowser) {
                    a[i + 1] = a[i + 1] - remainPowser;
                } else {
                    a[i + 1] = Math.max(a[i + 1] - (b[i] - a[i]), 0);
                }
            }
            kill += Math.min(a[i], b[i]) + remainPowser;
        }

        System.out.println(kill);
    }
}