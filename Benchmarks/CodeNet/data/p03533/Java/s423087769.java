import java.util.Arrays;
import java.util.Scanner;

public class Main {
    char[] cs;
    final String AKIBA = "AKIHABARA";
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        cs = sc.nextLine().toCharArray();
    }

    private void solve() {
        StringBuilder sb = new StringBuilder();
        for (char c: cs) {
            switch (c) {
                case 'K':
                    sb.append("AK");
                    break;
                case 'H':
                    sb.append("HA");
                    break;
                case 'B':
                    sb.append("BA");
                    break;
                case 'R':
                    sb.append("RA");
                    break;
                case 'A':
                    break;
                default:
                    sb.append(c);
            }
        }
        boolean flg = true;
        for (int i = 0; i < cs.length-1; i++) {
            flg &= cs[i] != cs[i+1];
        }
        if (flg && sb.toString().equals(AKIBA) && cs.length <= AKIBA.length())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
