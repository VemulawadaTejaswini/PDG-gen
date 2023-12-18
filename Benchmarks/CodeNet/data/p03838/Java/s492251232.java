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
        int x = scan.nextInt();
        int y = scan.nextInt();
        int answer = Integer.MAX_VALUE;
        if (x * y < 0) {
            int ax = Math.abs(x);
            int ay = Math.abs(y);
            answer = Math.abs(ay - ax) + 1;
            if (ax < ay && x < y) {
                answer = Math.min(y-x, answer);
            }
        } else if (x < y) {
            answer = y - x;
        } else {
            answer = Math.abs(y - x) + 2;
        }
        System.out.println(answer);
    }
}
