import java.util.*;

public class Main {

    private static int N, M;
    private static PriorityQueue<Integer> A;
    private static int[] B, C;

    private static void read() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new PriorityQueue<>();
        B = new int[M];
        C = new int[M];
        for (int i = 0; i < N; i += 1) {
            A.add(Integer.parseInt(sc.next()));
        }
        for (int i = 0; i < M; i += 1) {
            B[i] = Integer.parseInt(sc.next());
            C[i] = Integer.parseInt(sc.next());
        }
    }

    public static void main(String[] args) {
        read();

        for (int i = 0; i < M; i += 1) {
            for (int j = 0; j < B[i]; j += 1) {
                if (C[i] > A.peek()) {
                    A.poll();
                    A.add(C[i]);
                } else {
                    break;
                }
            }
        }

        long ret = 0;
        for (int Ai : A) {
            ret += Ai;
        }
        System.out.println(ret);
    }
}
