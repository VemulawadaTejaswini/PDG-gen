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
        int K = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < K; i++) {
            sb.append("ACL");
        }
        System.out.println(sb.toString());
    }
}
