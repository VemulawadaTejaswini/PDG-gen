import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    private int pow(int x, int y) {
        if (y == 0) {
            return 1;
        }
        if (y % 2 == 1) {
            return x * pow(x, y - 1);
        }
        int t = pow(x, y / 2);
        return t * t;
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int A = scan.nextInt();
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = scan.nextInt();
        }
        Arrays.sort(x);
        long answer = 0;
        int limit = pow(2, N);
        for (int i = 1; i  < limit; i++) {
            long sum = 0;
            int index = 1;
            int current = i;
            int count = 0;
            while (0 < current) {
                if (current % 2 == 1) {
                    sum += x[index-1];
                    count += 1;
                }
                current /= 2;
                index += 1;
            }
            if (sum == A * count) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
