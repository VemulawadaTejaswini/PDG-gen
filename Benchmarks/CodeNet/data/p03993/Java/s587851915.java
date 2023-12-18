import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt()-1;
        }
        int answer = 0;
        for (int i = 0; i < N; i++) {
            if (a[a[i]] == i) {
                answer += 1;
            }
        }
        System.out.println(answer/2);
    }
}
