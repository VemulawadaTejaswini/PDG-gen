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
        int M = scan.nextInt();
        String S = scan.next();
        char[] data = S.toCharArray();
        List<Integer> list = new ArrayList<>();
        int current = N;
        while (0 < current) {
            boolean possible = false;
            for (int i = Math.max(current - M, 0); i < current; i++) {
                if (data[i] == '1') {
                    continue;
                }
                list.add(current - i);
                possible = true;
                current = i;
                break;
            }
            if (!possible) {
                System.out.println(-1);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = list.size()-1; 0 <= i; i--) {
            sb.append(list.get(i)) ;
            sb.append(" ");
        }
        System.out.println(sb.substring(0, sb.length()-1));
    }
}
