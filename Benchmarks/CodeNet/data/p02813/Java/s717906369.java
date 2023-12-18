import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            int[] P = new int[N];
            int[] Q = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                Q[i] = sc.nextInt();
            }

            int a = 0;
            {
                List<Integer> list = new ArrayList<>();
                for (int i = 1; i <= N; i++) {
                    list.add(i);
                }

                for (int i = 0; i < N - 1; i++) {
                    int index = list.indexOf(P[i]);
                    a += index * factorial(N - 1 - i);
                    list.remove(index);
                }
            }

            int b = 0;
            {
                List<Integer> list = new ArrayList<>();
                for (int i = 1; i <= N; i++) {
                    list.add(i);
                }

                for (int i = 0; i < N - 1; i++) {
                    int index = list.indexOf(Q[i]);
                    b += index * factorial(N - 1 - i);
                    list.remove(index);
                }
            }

            System.out.println(Math.abs(a - b));
        }
    }

    public static long factorial(long N) {
        if (N == 1) {
            return 1;
        }
        return N * factorial(N - 1);
    }

}
