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
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        long answer = 1;
        for (int i = 0; i < N; i++) {
            answer *= 3;
        }
        long odd = 1;
        for (int i = 0; i < N; i++) {
            if (A[i] % 2 == 1) {
                odd *= 1;
            } else {
                odd *= 2;
            }
        }
        System.out.println(answer - odd);
    }
}
