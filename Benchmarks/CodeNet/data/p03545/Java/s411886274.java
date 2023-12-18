import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static long[] dp;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] s = scan.nextLine().toCharArray();
        int a = Integer.parseInt(s[0] + "");
        int b = Integer.parseInt(s[1] + "");
        int c = Integer.parseInt(s[2] + "");
        int d = Integer.parseInt(s[3] + "");
        char[] ops = new char[]{'+', '-'};
        int ans = 7;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    int sum = a;
                    sum += op(b, ops[i]);
                    sum += op(c, ops[j]);
                    sum += op(d, ops[k]);
                    if (sum == ans) {
                        System.out.println(a + "" + ops[i] + "" + b + "" + ops[j] + "" + c + "" + ops[k] + "" + d + "=7");
                        return;
                    }
                }
            }
        }
    }

    static int op(int num, int op) {
        if (op == '+') {
            return num;
        } else {
            return -num;
        }
    }
}