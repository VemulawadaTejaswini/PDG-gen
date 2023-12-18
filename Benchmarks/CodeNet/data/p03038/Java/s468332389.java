import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
            out.flush();
        }
    }

    void solve(InputReader in, PrintWriter out) {
        int N = in.nextInt();
        int M = in.nextInt();

        int[] as = new int[N];
        for (int i = 0; i < N; i++) {
            as[i] = in.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> index = new HashSet<>();
        for (int i = 0; i < M; i++) {
            int B = in.nextInt();
            int C = in.nextInt();

            map.compute(C, (key, old) -> (old == null) ? B : B + old);
            index.add(C);
        }

        ArrayList<Integer> inxdexList = new ArrayList<>(index);
        inxdexList.sort(Collections.reverseOrder());
        Arrays.sort(as);
        int aaa = 0;
        int value = inxdexList.get(aaa);
        Integer count = map.get(value);
        for (int i = 0; i < N; i++) {
            if (count == 0) {
                aaa++;
                if (aaa == inxdexList.size()) {
                    break;
                }
                value = inxdexList.get(aaa);
                count = map.get(value);
            }

            if (as[i] < value) {
                as[i] = value;
                count--;
            }
        }

        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += as[i];
        }

        out.println(ans);
    }
}

class InputReader implements AutoCloseable {
    private final Scanner sc = new Scanner(System.in);

    String next() {
        return this.sc.next();
    }

    int nextInt() {
        return Integer.parseInt(this.sc.next());
    }

    long nextLong() {
        return Long.parseLong(this.sc.next());
    }

    double nextDouble() {
        return Double.parseDouble(this.sc.next());
    }

    @Override
    public void close() {
        this.sc.close();
    }
}
