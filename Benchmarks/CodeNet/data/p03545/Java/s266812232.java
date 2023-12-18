import java.util.Scanner;

public class Main {
    int[] as;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        as = new int[4];
        String s = sc.nextLine();
        char[] cs = s.toCharArray();
        for (int i = 0; i < 4; i++) {
            as[i] = cs[i] - '0';
        }
    }

    private void solve() {
        StringBuilder sb = new StringBuilder();
        char[][] ops = {
                {'+', '+', '+'},
                {'+', '+', '-'},
                {'+', '-', '+'},
                {'+', '-', '-'},
                {'-', '+', '+'},
                {'-', '+', '-'},
                {'-', '-', '+'},
                {'-', '-', '-'}
        };
        int[] ans = new int[8];
        for (int i = 0; i < 8; i++) {
            char[] op = ops[i];
            int ret = as[0];
            for (int j = 1; j < 4; j++) {
                if (op[j-1] == '+') {
                    ret += as[j];
                }
                else {
                    ret -= as[j];
                }
            }
            if (ret == 7) {
                sb.append(as[0]);
                for (int j = 1; j < 4; j++) {
                    sb.append(op[j-1]);
                    sb.append(as[j]);
                }
                sb.append("=7");
                break;
            }
        }
        System.out.println(sb.toString());
    }
}
