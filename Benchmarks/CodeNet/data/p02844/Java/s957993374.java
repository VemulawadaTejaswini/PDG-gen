import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

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
            for (int k = 0; k < 10; k++) {
                for (int j = 0; j < 10; j++) {
                    if (list[i].size() == 0 || list[j].size() == 0 || list[k].size() == 0) {
                        continue;
                    }
                    int x = list[i].get(0);
                    int z = list[k].get(list[k].size()-1);
                    for (int y : list[j]) {
                        if (x < y && y < z) {
                            ans += 1;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
