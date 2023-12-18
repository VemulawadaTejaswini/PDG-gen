import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = scan.nextInt();
        }
        int[] count = new int[N+1];
        for (int i = 0; i < N; i++) {
            count[P[i]] += count[P[i]-1] + 1;
        }

        System.out.println(N - Arrays.stream(count).max().getAsInt());
    }
}
