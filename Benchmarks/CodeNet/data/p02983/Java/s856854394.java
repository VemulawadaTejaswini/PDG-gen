import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // SOLUTION A
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int answer = solutionA(n, a, b);
//        System.out.println(answer);
//    }
//
//    public static int solutionA (int n, int a, int b) {
//        if ((n * a) < b) {
//            return (n * a);
//        } else {
//            return b;
//        }
//    }

        // SOLUTION B
        Scanner scanner = new Scanner(System.in);
        long i = scanner.nextLong();
        long j = scanner.nextLong();
        System.out.println(solutionB(i, j));
    }

    // james wuz here lul
    public static long solutionB(long l, long r) {
        if (l + 2019 <= r) {
            return 0;
        } else {
            long min = 2019;
            for (long i = l; i <= r; i++) {
                for (long j = i + 1; j <= r; j++) {
                    long x = (i * j) % 2019;
                    if (x < min) {
                        min = x;
                    }
                }
            }
            return min;
        }
    }
}
