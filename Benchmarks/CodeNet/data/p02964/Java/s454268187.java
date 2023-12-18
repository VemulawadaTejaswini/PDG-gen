import java.util.*;

public class Main {
    static int maxA = 2 * 100000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) A[i] = sc.nextInt();

        int[] toNext = new int[N];
        int[] first = new int[maxA + 1];
        int[] last = new int[maxA + 1];
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        for (int i = 0; i < N; i++) {
            if (first[A[i]] == -1) {
                first[A[i]] = i;
                last[A[i]] = i;
            } else {
                toNext[last[A[i]]] = i - last[A[i]] + 1;
                last[A[i]] = i;
            }
        }

        for (int i = 0; i < N; i++) {
            if (first[A[i]] != -1) {
                toNext[last[A[i]]] = N - last[A[i]] + first[A[i]] + 1;
            }
        }

        int pos = 0;
        long ops = 0;
        long[] firstVisit = new long[N];
        Arrays.fill(firstVisit, -1);

        while (firstVisit[pos] == -1 && ops + toNext[pos] < N * K) {
            firstVisit[pos] = ops;
            ops += toNext[pos];
            pos = (pos + toNext[pos]) % N;
        }

        long remainingOps = N * K - ops;

        if (firstVisit[pos] != -1) {
            remainingOps = (N * K - ops) % (ops - firstVisit[pos]);
        }

        LinkedList<Integer> sol = new LinkedList<>();
        boolean[] contains = new boolean[maxA + 1];

        for (int i = 0; i < remainingOps; i++) {
            int a = A[(pos + i) % N];
            if (contains[a]) {
                int x = sol.pollLast();
                while (x != a) {
                    contains[x] = false;
                    x = sol.pollLast();
                }
                contains[x] = false;
            } else {
                contains[a] = true;
                sol.addLast(a);
            }
        }

        for (int s : sol) {
            System.out.print(s + " ");
        }
    }
}
