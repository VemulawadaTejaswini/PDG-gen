import java.util.Scanner;

// C - Sentou
// https://atcoder.jp/contests/arc073/tasks/arc073_a
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int T = Integer.parseInt(scanner.next());
        int[] t = new int[N];
        for (int i = 0; i < N; i++) {
            t[i] = Integer.parseInt(scanner.next());
        }
        scanner.close();

        int seconds = 0;
        int oldTime = t[0];
        for (int i = 1; i < N; i++) {
            seconds += Math.min(t[i] - oldTime, T);
            oldTime = t[i];
        }

        seconds += T;

        System.out.println(seconds);
    }
}
