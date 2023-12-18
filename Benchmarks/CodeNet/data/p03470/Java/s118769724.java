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
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < N; i++) {
            int d = scan.nextInt();
            s.add(d);
        }
        System.out.println(s.size());
    }
}
