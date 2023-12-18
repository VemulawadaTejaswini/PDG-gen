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
        boolean flg = true;
        StringBuilder sb = new StringBuilder();
        if (cs.length >= 3) {
            if (cs[0] == 'A' && cs[1] == 'K' && cs[2] == 'I') {
                sb.append("AKI");
                for (int i = 3; i < cs.length; i++) {
                    char c = cs[i];
                    switch (c) {
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
            }
            if (cs[0] == 'K' && cs[1] == 'I') {
                sb.append("AKI");
                for (int i = 2; i < cs.length; i++) {
                    char c = cs[i];
                    switch (c) {
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
            }
            for (int i = 0; i < cs.length - 1; i++) {
                flg &= cs[i] != cs[i + 1];
            }
        }
        if (flg && sb.toString().equals(AKIBA) && cs.length <= AKIBA.length())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
