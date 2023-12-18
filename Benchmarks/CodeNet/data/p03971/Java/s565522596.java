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
        int A = scan.nextInt();
        int B = scan.nextInt();
        String S = scan.next();
        char[] data = S.toCharArray();
        boolean[] results = new boolean[N];
        int national = 0;
        int international = 0;
        int total = 0;
        for (int i = 0; i < N; i++) {
            if (data[i] == 'c') {
                continue;
            }
            if (data[i] == 'a') {
                national += 1;
                total += 1;
                if (total <= A + B) {
                    results[i] = true;
                }
                continue;
            }
            if (total < A + B && international < B) {
                international += 1;
                total += 1;
                results[i] = true;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(results[i] ? "Yes" : "No");
        }
    }
}
