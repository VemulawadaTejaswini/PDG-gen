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
        String S = scan.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : S.toCharArray()) {
            if (!map.containsKey(x)) {
                map.put(x, 0);
            }
            int y = map.get(x);
            map.put(x, y+1);
        }
        boolean answer = true;
        for (char x : map.keySet()) {
            if (map.get(x) != 2) {
                answer = false;
            }
        }
        System.out.println(answer ? "Yes" : "No");
    }
}
