import java.util.*;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        int[] C = new int[M];

        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i=0; i<M; i++) {
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }

        System.out.println(solve(N, M, A, B, C));
    }

    private static long solve(int N, int M, int[] A, int[] B, int[] C) {
        long sum = 0;
        Arrays.sort(A);

        List<Pair> list = new ArrayList<>();
        for (int i=0; i<M; i++) {
            list.add(new Pair(C[i], i));
        }
        Collections.sort(list);

        int count = 0;
        int idxA = N-1;
        while (count < N) {
            if (list.size() == 0 || A[idxA] >= list.get(0).a) {
                sum += A[idxA];
                count++;
                idxA--;
//                System.err.println("use A " + A[idxA+1]);
            } else {

                Pair p = list.get(0);
                int v = p.a;
                int idx = p.b;
                int c = B[idx];

                if (count + c > N) {
                    c = N - count;
                }
                sum += (long)v * c;
                count += c;
                list.remove(0);

//                System.err.println("use C " + v + ", " + idx + ", " + c);
            }

//            System.err.println("sum = " + sum);
        }

        return sum;
    }

    static class Pair implements Comparable<Pair> {
        public int a;
        public int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Pair p) {
            return p.a - a;
        }
    }
}
