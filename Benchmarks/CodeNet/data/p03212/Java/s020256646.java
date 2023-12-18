import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    private static int[] d = new int[3];
    static {
        d[0] = 3;
        d[1] = 5;
        d[2] = 7;
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String s = Integer.toString(N);
        System.out.println(dfs(N, s.length(), new StringBuilder()));
    }
    private int dfs(int N, int len, StringBuilder sb) {
        if (len < sb.length()) {
            return 0;
        }
        if (sb.length() != 0 && N < Integer.parseInt(sb.toString())) {
            return 0;
        }
        int ans = 0;
        if (3 <= sb.length()) {
            boolean found3 = false;
            boolean found5 = false;
            boolean found7 = false;
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == '3') {
                    found3 = true;
                }
                if (sb.charAt(i) == '5') {
                    found5 = true;
                }
                if (sb.charAt(i) == '7') {
                    found7 = true;
                }
            }
            if (found3 && found5 && found7) {
                ans += 1;
            }
        }
        for (int i : d) {
            sb.append(i);
            ans += dfs(N, len, sb);
            sb.delete(sb.length()-1, sb.length());
        }
        return ans;
    }

}
