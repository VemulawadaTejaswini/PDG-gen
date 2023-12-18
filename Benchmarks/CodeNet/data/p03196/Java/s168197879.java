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
        long N = scan.nextLong();
        long P = scan.nextLong();
        if (N == 1) {
            System.out.println(P);
            return;
        }
        List<Pair> list = this.solve(P);
        long answer = 1;
        for (Pair p : list) {
            if (p.count < N) {
                continue;
            }
            answer = answer * (p.count / N) * p.value;
        }
        System.out.println(answer);
    }
    private List<Pair> solve(long P) {
        List<Pair> list = new ArrayList<>();
        Pair p = new Pair(P, 1);
        list.add(p);
        long current = P;
        for (long i = 2; i * i <= P ; i++) {
            if (current % i != 0) {
                continue;
            }
            long count = 0;
            while (current % i == 0) {
                current /= i;
                count += 1;
            }
            p = new Pair(i, count);
            list.add(p);
        }
        return list;
    }
    class Pair {
        long value;
        long count;
        Pair(long value, long count) {
            this.value = value;
            this.count = count;
        }
    }
}
