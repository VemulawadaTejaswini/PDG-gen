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
        int A = scan.nextInt();
        int B = scan.nextInt();
        String s = scan.next();
        char[] x = s.toCharArray();
        boolean answer = true;
        for (int i = 0; i < A; i++) {
            if (!(0 <= x[i] - '0' && x[i] - '0' <= 9)) {
                answer = false;
                break;
            }
        }
        if (x[A] != '-') {
            answer = false;
        }
        for (int i = 0; i < B; i++) {
            if (!(0 <= x[A+1+i] - '0' && x[A+1+i]-'0' <= 9)) {
                answer = false;
                break;
            }
        }
        System.out.println(answer ? "Yes" : "No");
    }
}
