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
        if (!is_kaibun(data, 1, len)) {
            System.out.println("No");
            return;
        }
        if (!is_kaibun(data, 1, (len-1)/2)) {
            System.out.println("No");
            return;
        }
        if (!is_kaibun(data, (len+3)/2, len)) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }

    private boolean is_kaibun(char[] data, int start, int end) {
        int len = end - start;
        for (int i = 0; i < len; i++) {
            if (data[start+i-1] != data[end-i-1]) {
                return false;
            }
        }
        return true;
    }
}
