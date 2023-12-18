import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        char[] steps = s.toCharArray();
        if (even(steps)&&odd(steps)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    private boolean even(char[] steps) {
        for (int i = 1; i <= steps.length; i++) {
            if (i % 2 == 1) {
                continue;
            }
            if (steps[i-1] == 'L') {
                continue;
            }
            if (steps[i-1] == 'U') {
                continue;
            }
            if (steps[i-1] == 'D') {
                continue;
            }
            return false;
        }
        return true;
    }
    private boolean odd(char[] steps) {
        for (int i = 1; i <= steps.length; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (steps[i-1] == 'R') {
                continue;
            }
            if (steps[i-1] == 'U') {
                continue;
            }
            if (steps[i-1] == 'D') {
                continue;
            }
            return false;
        }
        return true;
    }
}
