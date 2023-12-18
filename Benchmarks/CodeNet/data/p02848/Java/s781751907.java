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
        String s = scan.next();
        char[] data = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char x = data[i];
            int org = x - 'A';
            int next = (org + N) % 26;
            char n = (char)((int)next + 'A');
            sb.append(n);
        }
        System.out.println(sb.toString());
    }
}
