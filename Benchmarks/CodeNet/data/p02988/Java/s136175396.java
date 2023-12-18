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
        int n = scan.nextInt();
        int[] p = new int[n];
        for (int i = 0 ; i < n; i++) {
            p[i] = scan.nextInt();
        }
        long answer = 0;
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = j + 1;
            if (p[i] < p[j] && p[j] < p[k]) {
                answer +=1;
            }
            if (p[k] < p[j] && p[j] < p[i]) {
                answer +=1;
            }
        }
        System.out.println(answer);
    }
}
