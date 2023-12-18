import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String s = scan.next();
        char[] s_d = s.toCharArray();
        String t = scan.next();
        char[] t_d = t.toCharArray();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < N; i++) {
            ans.append(s_d[i]);
            ans.append(t_d[i]);
        }
        System.out.println(ans.toString());
    }
}
