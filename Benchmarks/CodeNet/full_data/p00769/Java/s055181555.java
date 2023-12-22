import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        for (int i = 0; i < numCases; i++) {
            String input = sc.next();
            new Main(input).solve();
        }
        sc.close();
    }

    String input;

    char[] cs;
    int ind;

    public Main(String input) {
        this.input = input;
    }

    void solve() {
        cs = (input + "$").toCharArray();
        int ans = readNode();
        System.out.println(ans);
    }

    int readNode() {
        if (cs[ind] == '[') {
            ind++;
            if (cs[ind] == '[') {
                List<Integer> values = new ArrayList<Integer>();
                while (cs[ind] == '[') {
                    values.add(readNode());
                }

                Collections.sort(values);

                int ret = 0;
                for (int i = 0; i < values.size() / 2 + 1; ++i) {
                    ret += values.get(i);
                }

                assert cs[ind] == ']';
                ind++;
                return ret;
            } else if (isNum(cs[ind])) {
                int ret = readNum() / 2 + 1;

                assert cs[ind] == ']';
                ind++;
                return ret;
            } else throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    int readNum() {
        int acc = 0;
        while (isNum(cs[ind])) {
            acc *= 10;
            acc += cs[ind] - '0';
            ind++;
        }
        return acc;
    }

    private static boolean isNum(char c) {
        return '0' <= c && c <= '9';
    }
}