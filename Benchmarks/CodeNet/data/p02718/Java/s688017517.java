import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
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
        int M = scan.nextInt();
        List<Integer> A = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int a = scan.nextInt();
            sum += a;
            A.add(a);
        }
        A.sort(Comparator.reverseOrder());
        int limit = sum / (4 * M);
        int count = 0;
        for (int i = 0; i < M; i++) {
            if (limit <= A.get(i)) {
                count += 1;
            }
        }
        System.out.println(count == M ? "Yes" : "No");
    }
}
