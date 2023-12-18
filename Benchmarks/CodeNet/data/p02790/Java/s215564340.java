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
        int a = scan.nextInt();
        int b = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        if (a == b) {
            for (int i = 0; i < Math.min(a,b); i++) {
                sb.append(a);
            }
        } else {
            int min = Math.min(a, b);
            int max = Math.max(a, b);
            for (int i = 0; i < max; i++) {
                sb.append(min);
            }
        }
        System.out.println(sb.toString());
    }
}
