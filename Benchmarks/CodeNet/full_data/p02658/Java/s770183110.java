import java.util.Scanner;

public class Main {
    static final long INF = (long)Math.pow(10, 18);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long res = 1;
        for (int i = 0; i < N; i++) {
            long A = sc.nextLong();
            if (A == 0) {
                res = 0;
                break;
            }
            if (res == -1) {
                continue;
            }
            if (A > INF / res) {
                res = -1;
            } else {
                res *= A;
            }
        }
        System.out.println(res);
        sc.close();
    }
}