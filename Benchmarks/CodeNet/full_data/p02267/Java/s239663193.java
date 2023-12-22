import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Scanner in;

    void solve() {
        int n = in.nextInt();
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i < n; i++) {
            s.add(in.nextInt());
        }
        int q = in.nextInt();
        Set<Integer> t = new HashSet<>();
        for(int i = 0; i < q; i++) {
            t.add(in.nextInt());
        }
        int sum = 0;
        for(int i : s) {
            for(int j : t) {
                sum += i == j ? 1 : 0;
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        new Main().solve();
    }
}