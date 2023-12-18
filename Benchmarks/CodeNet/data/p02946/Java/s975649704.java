import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int K = scan.nextInt();
        int X = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = X - K + 1; i < X + K; i++) {
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb.substring(0, sb.length()-1));
    }
}
