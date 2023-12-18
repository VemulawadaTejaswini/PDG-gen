import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = scan.nextInt();
        }
        long answer = Long.MAX_VALUE;
        for(int i = 1; i <= N-K+1; i++) {
            answer = Math.min(answer, Math.abs(x[i-1])+x[i+K-2]-x[i-1]);
            answer = Math.min(answer, Math.abs(x[i+K-2])+Math.abs(x[i+K-2]-x[i-1]));
        }
        System.out.println(answer);
    }
}
