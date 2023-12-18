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
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int[] l = new int[N];
        for (int i = 0; i < N; i++) {
            l[i] = scan.nextInt();
        }
        Arrays.sort(l);
        int answer = Integer.MAX_VALUE;
        int[] three = new int[3];
        for (int i = 1; i < 1 << N; i++) {
            for (int j = 1; j < 1 << N; j++) {
                if (0 < (i & j)) {
                    continue;
                }
                for (int k = 1; k < 1 << N; k++) {
                    if (0 < (i & k) || 0 < (j & k)) {
                        continue;
                    }
                    three[0] = total(l, i);
                    three[1] = total(l, j);
                    three[2] = total(l, k);
                    int count = count(l, i) + count(l, j) + count(l, k);
                    answer = Math.min(answer, (count - 3) * 10 + Math.abs(A-three[0]) + Math.abs(B-three[1]) + Math.abs(C-three[2]));
                }
            }
        }
        System.out.println(answer);
    }
    private int total(int[] l, int pairs) {
        int current = 0;
        int total = 0;
        while(0 < pairs) {
            if ((pairs & 1) == 1) {
                total += l[current];
            }
            pairs >>= 1;
            current += 1;
        }
        return total;
    }
    private int count(int[] l, int pairs) {
        int total = 0;
        while(0 < pairs) {
            if ((pairs & 1) == 1) {
                total += 1;
            }
            pairs >>= 1;
        }
        return total;
    }
}
