import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long T = scanner.nextLong();
        long[] t = new long[N];
        long x = 0;
        t[0] = scanner.nextLong();
        for (int i = 1; i < N; i++) {
            t[i] = scanner.nextLong();
            if (t[i-1] + T < t[i]) {
                x += T;
            }else{
                x += t[i] - t[i-1];
            }
        }
        x += T;

        System.out.println(x);

    }

}