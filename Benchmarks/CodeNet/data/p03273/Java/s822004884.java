import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < H; i++) {
            String s = scan.next();
            if (0 <= s.indexOf("#")) {
                list.add(s);
            }
        }
        boolean[] f = new boolean[W];
        for (int i = 0; i < W; i++) {
            boolean feasible = true;
            for(String s : list) {
                char[] d = s.toCharArray();
                if (d[i] == '#') {
                    feasible = false;
                    break;
                }
            }
            f[i] = feasible;
        }
        List<String> answer = new ArrayList<>();
        for(String s : list) {
            char[] d = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < W; i++) {
                if (!f[i]) {
                    sb.append(d[i]);
                }
            }
            answer.add(sb.toString());
        }
        for(String s: answer) {
            System.out.println(s);
        }
    }
}
