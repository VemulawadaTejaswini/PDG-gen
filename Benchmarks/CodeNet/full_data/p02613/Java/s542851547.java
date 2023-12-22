import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        HashMap<String, Integer> ans = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String t = scan.next();
            ans.merge(t, 1, Integer::sum);
        }
        // AC, WA, TLE, RE
        System.out.println("AC x " + ans.getOrDefault("AC", 0));
        System.out.println("WA x " + ans.getOrDefault("WA", 0));
        System.out.println("TLE x " + ans.getOrDefault("TLE", 0));
        System.out.println("RE x " + ans.getOrDefault("RE", 0));
    }
}
