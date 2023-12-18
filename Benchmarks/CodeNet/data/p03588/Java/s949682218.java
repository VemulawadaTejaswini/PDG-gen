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
        int N = scan.nextInt();
        int ans = 0;
        int point = 0;
        for (int i = 0; i < N; i++) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            if (ans <= A) {
                ans = A;
                point = B;
            }
        }
        ans += point;
        System.out.println(ans);

    }
}
