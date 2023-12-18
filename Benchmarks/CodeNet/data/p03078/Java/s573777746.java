//package abc123.D;

import java.util.*;

public class Main {

    private static Long[] A;
    private static Long[] B;
    private static Long[] C;
    private static int K;
    private PriorityQueue<Sum2Indices> pq;
    private Set<Sum2Indices> set;

    private class Sum2Indices {
        long sum;
        int[] indices;

        Sum2Indices(int a, int b, int c) {
            sum = Main.A[a] + Main.B[b] + Main.C[c];
            indices = new int[]{a, b, c};
        }

        long getSum() {
            return sum;
        }

        int[] getIndices() {
            return indices;
        }

        @Override
        public int hashCode() {
            int hash = 0;
            hash += indices[0] * 1001;
            hash += indices[1] * 1001;
            hash += indices[2] * 1001;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            } else if (obj.getClass() != this.getClass()) {
                return false;
            }

            Sum2Indices other = (Sum2Indices) obj;
            int[] otherIndices = other.getIndices();
            return indices[0] == otherIndices[0]
                    && indices[1] == otherIndices[1]
                    && indices[2] == otherIndices[2];
        }
    }

    private class Sum2IndicesComparator implements Comparator<Sum2Indices> {
        @Override
        public int compare(Sum2Indices left, Sum2Indices right) {
            long leftSum = left.getSum();
            long rightSum = right.getSum();
            if (leftSum < rightSum) {
                return 1;
            } else if (leftSum > rightSum) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public Main() {
        Scanner sc = new Scanner(System.in);
        int X, Y, Z;
        X = sc.nextInt();
        Y = sc.nextInt();
        Z = sc.nextInt();
        K = sc.nextInt();
        A = new Long[X];
        B = new Long[Y];
        C = new Long[Z];
        for (int x = 0; x < X; x += 1) {
            A[x] = Long.parseLong(sc.next());
        }
        for (int y = 0; y < Y; y += 1) {
            B[y] = Long.parseLong(sc.next());
        }
        for (int z = 0; z < Z; z += 1) {
            C[z] = Long.parseLong(sc.next());
        }

        // Sort the arrays
        Arrays.sort(A, Collections.reverseOrder());
        Arrays.sort(B, Collections.reverseOrder());
        Arrays.sort(C, Collections.reverseOrder());
    }

    private void solve() {
        pq = new PriorityQueue<>(new Sum2IndicesComparator());
        set = new HashSet<>();
        Sum2Indices min = new Sum2Indices(0, 0, 0);
        pq.add(min);
        set.add(min);
        solveHelper(K);
    }

    private void solveHelper(int k) {
        if (k == 0) {
            return;
        }

        Sum2Indices curMax = pq.poll();
        System.out.println(curMax.getSum());

        int[] indices = curMax.getIndices();
        int a = indices[0];
        int b = indices[1];
        int c = indices[2];

        if (a + 1 < A.length) {
            Sum2Indices sumA = new Sum2Indices(a + 1, b, c);
            if (!set.contains(sumA)) {
                pq.add(sumA);
                set.add(sumA);
            }
        }
        if (b + 1 < B.length) {
            Sum2Indices sumB = new Sum2Indices(a, b + 1, c);
            if (!set.contains(sumB)) {
                pq.add(sumB);
                set.add(sumB);
            }
        }
        if (c + 1 < C.length) {
            Sum2Indices sumC = new Sum2Indices(a, b, c + 1);
            if (!set.contains(sumC)) {
                pq.add(sumC);
                set.add(sumC);
            }
        }

        solveHelper(k - 1);
    }

    public static void main (String[]args){
        Main main = new Main();
        main.solve();
    }

}
