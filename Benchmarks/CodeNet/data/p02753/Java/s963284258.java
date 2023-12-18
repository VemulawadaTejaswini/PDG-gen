import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        char[] d = S.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            set.add(d[i]);
        }
        if (1 < set.size()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
