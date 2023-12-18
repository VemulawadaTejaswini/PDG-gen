import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        Set<Integer> orig = new HashSet<>();
        for (int i = 0; i < N / 2; i++) {
            orig.add(A[2 * i+1]);
        }
        Arrays.sort(A);
        for (int i = 0; i < N / 2; i++) {
            if (orig.contains(A[2 * i+1])) {
                orig.remove(A[2 * i+1]);
            }
        }
        System.out.println(orig.size());
    }
}
