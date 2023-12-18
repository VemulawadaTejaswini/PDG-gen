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
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String s = scan.next();
            char c = s.toCharArray()[0];
            set.add(c);
        }
        if (set.size() == 3) {
            System.out.println("Three");
        } else {
            System.out.println("Four");
        }
    }
}
