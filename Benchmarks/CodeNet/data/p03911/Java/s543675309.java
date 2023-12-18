import java.util.*;

public class Main {

    static class UnionFind {
        List<Integer> Parent;
        UnionFind(int N) {
            Parent = new ArrayList<Integer>();
            Integer[] values = new Integer[N];
            Arrays.fill(values, -1);
            Parent.addAll(Arrays.asList(values));
        }
        int root(int A) {
            if (Parent.get(A) < 0)
                return A;
            int root = root(Parent.get(A));
            Parent.set(A, root);
            return root;
        }
        int size(int A) {
            return -Parent.get(root(A));
        }

        boolean connect(int A, int B) {
            A = root(A);
            B = root(B);
            if (A == B) {
                return false;
            }

            if (size(A) < size(B)) {
                int temp = A;
                A = B;
                B = temp;
            }

            Parent.set(A, Parent.get(A) + Parent.get(B));
            Parent.set(B, A);

            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<M;i++) {
            ArrayList<Integer> add = new ArrayList<Integer>();
            list.add(add);
        }
        for (int i=0;i<N;i++) {
            int K = sc.nextInt();
            for (int j=0;j<K;j++) {
                int L = sc.nextInt()-1;
                list.get(L).add(i);
            }
        }
        UnionFind uf = new UnionFind(N);
        for (ArrayList<Integer> l : list) {
            for (int i=0;i<l.size()-1;i++) {
                uf.connect(l.get(i), l.get(i+1));
            }
        }
        if (uf.size(0)==N) System.out.println("YES");
        else System.out.println("NO");
    }
}