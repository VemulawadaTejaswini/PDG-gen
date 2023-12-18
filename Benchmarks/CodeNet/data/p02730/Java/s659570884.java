import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();

        char[] data = S.toCharArray();
        int len = data.length;
        if (!is_kaibun(S, 1, len)) {
            System.out.println("No");
            return;
        }
        if (!is_kaibun(S, 1, (len-1)/2)) {
            System.out.println("No");
            return;
        }
        if (!is_kaibun(S, (len+3)/2, len)) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }

    private boolean is_kaibun(String S, int start, int end) {
        String org = S.substring(start-1, end);
        StringBuilder sb = new StringBuilder(org);
        String tran = sb.reverse().toString();
        return org.equals(tran);
    }
}
