import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        char prev = ' ';
        HashSet<String> set = new HashSet<>();
        boolean answer = true;
        for (int i = 0; i < N; i++) {
            String s = scan.next();
            char[] d = s.toCharArray();
            if (prev != ' ') {
                if (d[0] != prev) {
                    answer = false;
                    break;
                }
            }
            if (set.contains(s)) {
                answer = false;
                break;
            }
            set.add(s);
            prev = d[d.length-1];
        }
        System.out.println(answer ? "Yes" : "No");
    }
}
