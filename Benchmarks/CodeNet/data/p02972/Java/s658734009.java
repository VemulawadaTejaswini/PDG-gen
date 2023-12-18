import java.util.BitSet;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        BitSet a = new BitSet(N);
        for (int i = 0; i < N; i++) {
            a.set(i, sc.nextInt() == 1);
        }

        BitSet box = new BitSet(N);
        for (int n = N; n > 0; n--) {
            int sum = 0;
            for (int i = n; i <= N; i += n) {
                if (box.get(i - 1)) {
                    sum++;
                }
            }
            if ((sum % 2 == 1) != a.get(n - 1)) {
                box.set(n - 1);
            }
        }
        System.out.println(box.cardinality());
        System.out.println(box.stream().map(i -> i + 1).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}