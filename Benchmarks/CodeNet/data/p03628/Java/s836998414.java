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
        int N = scan.nextInt();
        String s1 = scan.next();
        String s2 = scan.next();
        int mode = 0;
        char[] d1 = s1.toCharArray();
        char[] d2 = s2.toCharArray();
        int current = 0;
        long answer = 1;
        long MOD = 1000000007;
        while (current < N) {
            if(d1[current] == d2[current]) {
                if (mode == 0) {
                    answer *= 3;
                } else if (mode == 1) {
                    answer *= 2;
                } else {
                    answer *= 1;
                }
                answer %= MOD;
                mode = 1;
                current += 1;
            } else {
                if (mode == 0) {
                    answer *= 6;
                } else if (mode == 1) {
                    answer *= 2;
                } else {
                    answer *= 3;
                }
                mode = 2;
                answer %= MOD;
                current += 2;
            }
        }
        System.out.println(answer);
    }
}
