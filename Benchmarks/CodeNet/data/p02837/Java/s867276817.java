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
        int N  = scan.nextInt();
        List<Pair>[] list = new List[N];
        for (int i = 0; i < N; i++) {
            int A = scan.nextInt();
            list[i] = new ArrayList<Pair>();
            for (int j = 0; j < A; j++) {
                int x = scan.nextInt()-1;
                int y = scan.nextInt();
                Pair p = new Pair(x, y);
                list[i].add(p);
            }
        }
        int max = pow(N);
        int answer = 0;
        for (int pattern = 0; pattern < max; pattern++) {
            int current = 1;
            boolean[] judge = new boolean[N];
            Arrays.fill(judge, false);
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (0 < (pattern & current)) {
                    judge[i] = true;
                    count += 1;
                }
                current *= 2;
            }
            boolean contradiction = false;
            for (int j = 0; j < N; j++) {
                List<Pair> pair = list[j];
                for (Pair p : pair) {
                    // 正直者
                    if (judge[j]) {
                        if (!judge[p.x] && p.y == 1) {
                            contradiction = true;
                            break;
                        }
                        if (judge[p.x] && p.y == 0) {
                            contradiction = true;
                            break;
                        }
                    } else {
                        if (judge[p.x] && p.y == 1) {
                            contradiction = true;
                            break;
                        }
                        if (!judge[p.x] && p.y == 0) {
                            contradiction = true;
                            break;
                        }
                    }
                }
                if (contradiction) {
                    break;
                }
            }
            if (!contradiction) {
                answer = Math.max(answer, count);
            }
        }
        System.out.println(answer);
    }
    private int pow(int N) {
        int i = 0;
        int pow = 1;
        while (i < N) {
            pow *= 2;
            i += 1;
        }
        return pow;
    }
    class Pair {
        int x;
        int y;
        Pair (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
