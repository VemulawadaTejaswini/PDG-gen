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
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] p = new int[N];
        for (int i=0;i<N;i++) {
            p[i] = Integer.parseInt(sc.next());
        }
        UnionFind uf = new UnionFind(N);
        for (int i=0;i<M;i++) {
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            uf.connect(a, b);
        }
        int ans = 0;
        for (int i=0;i<N;i++) {
            if (uf.root(p[i]-1)==uf.root(i)) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static int kyotsu(ArrayList<Integer> a, ArrayList<Integer> b) {
        int ans = 0;
        int j=0;
        for (int i=0;i<a.size();i++) {
            if (a.get(i)==b.get(j)) {
                ans++;
                j++;
                if (j==b.size()) {
                    break;
                }
            } else if (a.get(i)<b.get(j)) {
                continue;
            } else if (a.get(i)>b.get(j)) {
                i--;
                j++;
                if (j==b.size()) {
                    break;
                }
            }
        }
        return ans;
    }
}