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
        String A = scan.next();
        long len = A.length();
        char[] d = A.toCharArray();
        int[] count = new int[26];
        for (int i = 0; i < len; i++) {
            count[(int) (d[i]-'a')] += 1;
        }
        long ans = len * (len - 1) / 2 + 1;
        for (int i = 0; i < 26; i++) {
            if (1 < count[i]) {
                ans -= count[i] * (count[i]-1) / 2;
            }
        }
        System.out.println(ans);
    }
}
