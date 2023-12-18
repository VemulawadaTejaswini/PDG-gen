import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solver {

    private final int[][] A;
    private final int[] P;

    Solver(Scanner in) {
        int N = in.nextInt();
        int Q = in.nextInt();
        IntStream.Builder[] builder = new IntStream.Builder[N];
        Arrays.setAll(builder, i -> IntStream.builder());
        for (int i = 0; i < N - 1; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            builder[a].accept(b);
            builder[b].accept(a);
        }
        A = new int[N][];
        for (int i = 0; i < N; i++) {
            A[i] = builder[i].build().toArray();
        }
        P = new int[N];
        for (int i = 0; i < Q; i++) {
            P[in.nextInt() - 1] += in.nextInt();
        }
        result = new int[N];
    }

    void solve() {
        dfs(-1, 0, 0);
        System.out.println(Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }

    int[] result;

    void dfs(int root, int pos, int sum) {
        if (root == pos) return;
        sum += P[pos];
        result[pos] = sum;
        for (int b : A[pos]) {
            if (b == root) continue;
            dfs(pos, b, sum);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}