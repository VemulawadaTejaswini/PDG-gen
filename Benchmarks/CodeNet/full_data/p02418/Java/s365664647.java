import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    Scanner sc = new Scanner(System.in);

    void solve() {
        String s = sc.nextLine();
        String p = sc.nextLine();
        String[] ring = (s + s).split("");
        String[] pArr = p.split("");
        for (int i = 0; i < ring.length; ++i) {
            boolean f = true;
            int cnt = 0;
            for (int j = 0; j < pArr.length && i + j < ring.length; ++j) {
                if (!ring[i + j].equals(pArr[j])) {
                    f = false;
                    break;
                }
                cnt++;
            }
            if (f && cnt == p.length()) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}




