import java.io.PrintWriter;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Solver {
    <T> T getOrElsePut(T[] arr, int idx, Supplier<? extends T> sup) {
        T result = arr[idx];
        if (result == null) result = arr[idx] = sup.get();
        return result;
    }

    void sum(BitSet[] sets, int v, int[] result) {
        BitSet bs = sets[v];
        for (int j = bs.nextSetBit(v); j >= 0; j = bs.nextSetBit(j + 1)) {
            result[j] += result[v];
            sum(sets, j, result);
        }
    }

    void solve(Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int Q = in.nextInt();
        BitSet[] sets = new BitSet[N];
        for (int i = 1; i < N; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;

            getOrElsePut(sets, a, BitSet::new).set(b);
            getOrElsePut(sets, b, BitSet::new).set(a);
        }
        int[] result = new int[N];
        for (int i = 0; i < Q; i++) {
            int p = in.nextInt() - 1;
            int x = in.nextInt();
            result[p] += x;
        }
        sum(sets, 0, result);
        out.println(Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        new Solver().solve(in, out);

        in.close();
        out.flush();
    }
}