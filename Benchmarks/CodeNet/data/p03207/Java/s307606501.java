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
        int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            p[i] = scan.nextInt();
        }
        Arrays.sort(p);
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += p[i];
        }
        sum -= p[N-1]/2;
        System.out.println(sum);
    }
}
