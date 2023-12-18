import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            Work[] W = new Work[N];

            for (int i = 0; i < N; i++) {
                Work w = new Work();
                w.A = sc.nextInt();
                w.B = sc.nextInt();
                W[i] = w;
            }

            Arrays.sort(W, new Comparator<Work>() {
                @Override
                public int compare(Work o1, Work o2) {
                    int d = o2.B - o1.B;
                    if (d != 0) {
                        return d;
                    }

                    d = o2.A - o1.A;
                    return d;
                }
            });

            int[] C = new int[M];

            for (Work w : W) {
                for (int i = M - w.A; i >= 0; i--) {
                    if (C[i] == 0) {
                        C[i] = w.B;
                        break;
                    }
                }
            }

            int sum = Arrays.stream(C).sum();

            System.out.println(sum);
        }
    }

    public static class Work {
        int A;

        int B;
    }

}
