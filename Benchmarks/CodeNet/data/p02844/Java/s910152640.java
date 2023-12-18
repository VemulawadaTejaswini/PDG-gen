import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String S = scan.next();
        char[] data = S.toCharArray();
        List<Integer>[] list = new List[10];
        for (int i = 0; i < 10; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < data.length; i++) {
            list[data[i]-'0'].add(i);
        }
        HashSet<String> counted = new HashSet<>();
        int ans = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for(int x : list[i]) {
                        for (int y : list[j]) {
                            for (int z : list[k]) {
                                if (x < y && y < z) {
                                    String key = String.format("%d%d%d", i, j, k);
                                    if (counted.contains(key)) {
                                        continue;
                                    }
                                    ans += 1;
                                    counted.add(key);
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
