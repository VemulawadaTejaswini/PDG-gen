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
        String S = scan.next();
        char[] data = S.toCharArray();
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = data[i] - '0';
        }
        int i = 0;
        int j = 0;
        int k = 0;
        boolean found = false;
        for (i = 0; i <= 1; i++) {
            for (j = 0; j <= 1; j++) {
                for (k = 0; k <= 1; k++) {
                    int answer = digits[0];
                    answer += (i == 0 ? 1 : -1) * digits[1];
                    answer += (j == 0 ? 1 : -1) * digits[2];
                    answer += (k == 0 ? 1 : -1) * digits[3];
                    if (answer == 7) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(digits[0]);
        sb.append(i == 0 ? '+' : '-');
        sb.append(digits[1]);
        sb.append(j == 0 ? '+' : '-');
        sb.append(digits[2]);
        sb.append(k == 0 ? '+' : '-');
        sb.append(digits[3]);
        sb.append("=7");
        System.out.println(sb.toString());
    }
}
