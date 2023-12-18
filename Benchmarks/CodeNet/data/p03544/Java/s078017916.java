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
        long[] l = new long[N+1];
        l[0] = 2;
        l[1] = 1;
        for (int i = 2; i <= N; i++) {
            l[i] = l[i-1] + l[i-2];
        }
        System.out.println(l[N]);
    }
}
