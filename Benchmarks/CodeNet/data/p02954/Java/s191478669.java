import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    private static char[] map;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        Main.map = S.toCharArray();
        int length = S.length();
        int[] data = new int[length];
        Arrays.fill(data, 1);
        Stage first = new Stage(0, data);
        HashMap<String, Stage> map = new HashMap<>();
        Stage current = first;
        for (int i = 1; i <= 150000; i++) {
            current = current.next();
        }
        StringBuilder sb = new StringBuilder();
        for (long i : current.data) {
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb.substring(0, sb.length()-1));
    }
    class Stage {
        long step;
        int[] data;
        public Stage(long step, int[] data) {
            this.step = step;
            this.data = data;
        }

        public Stage next() {
            int[] next_data = new int[data.length];
            for (int i = 0; i < data.length; i++) {
                if (Main.map[i] == 'L') {
                    next_data[i-1] += this.data[i];
                } else {
                    next_data[i+1] += this.data[i];
                }
            }
            Stage next = new Stage(this.step + 1, next_data);
            return next;
        }

    }
}
