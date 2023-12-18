import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solver {

    private final int H;
    private final int W;
    private final int[] A;

    Solver(Scanner in) {
        H = in.nextInt();
        W = in.nextInt();
        int N = in.nextInt();
        A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = in.nextInt();
        }
    }

    void solve() {
        String[] arr = new String[H * W];
        for (int i = 0, idx = 0; i < A.length; i++) {
            Arrays.fill(arr, idx, idx += A[i], String.valueOf(i + 1));
        }
        System.out.println(
                IntStream.iterate(0, i -> i + 1).limit(H)
                        .mapToObj(i -> i % 2 == 0 ? IntStream.iterate(W * i, j -> j + 1) : IntStream.iterate(W * i + W - 1, j -> j - 1))
                        .map(s -> s.limit(W))
                        .map(s -> s.mapToObj(j -> arr[j])
                                .collect(Collectors.joining(" "))
                        )
                        .collect(Collectors.joining("\n"))
        );
    }
}

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}