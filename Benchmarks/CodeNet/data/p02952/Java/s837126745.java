import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String d = Integer.toString(N);
        int length = d.length();
        long answer = 0;
        if (length % 2 == 0) {
            long base = 1;
            for (int i = 1; i < length; i += 2) {
                answer += 9 * base;
                base *= 100;
            }
        } else {
            long base = 1;
            for (int i = 1; i < length - 1; i += 2) {
                answer += 9 * base;
                base *= 100;
            }
            answer += N - (long) Math.pow(10, length-1) + 1;
        }
        System.out.println(answer);
    }
}
