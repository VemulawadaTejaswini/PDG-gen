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
        char[] d = S.toCharArray();
        int answer = 100000;
        for (int i = 0; i < d.length - 2; i++) {
            int x = (d[i]-'0')*100+(d[i+1]-'0')*10+(d[i+2]-'0');
            if (Math.abs(x-753) < answer) {
                answer = Math.abs(x-753);
            }
        }
        System.out.println(answer);
    }
}
