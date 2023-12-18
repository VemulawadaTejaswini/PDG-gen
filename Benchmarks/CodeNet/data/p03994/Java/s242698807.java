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
        String S = scan.next();
        int K = scan.nextInt();
        char[] data = S.toCharArray();
        int N = data.length;
        for (int i = 0; i < N - 1; i++) {
            if (data[i] == 'a') {
                continue;
            }
            int step = 26 - (data[i] - 'a');
            if (step <= K) {
                K -= step;
                data[i] = 'a';
            }
        }
        int last = (data[N - 1] - 'a' + K) % 26;
        data[N - 1] = (char) (last + 'a');
        System.out.println(data);
    }
}
