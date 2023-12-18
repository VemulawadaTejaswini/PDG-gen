import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] d = new long[N];
        for (int i = 0; i < N; i++) {
            d[i] = scan.nextInt();
        }
        long answer = 0;
        long remain = 0;
        for (int i = 0; i < N; i++) {
            answer += (remain + d[i]) / 2;
            remain = (remain + d[i]) - ((remain + d[i]) / 2) * 2;
            if (d[i] == 0) {
                remain = 0;
            }
        }
        System.out.println(answer);
    }
}
