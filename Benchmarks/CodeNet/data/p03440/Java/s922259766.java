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
        int[] a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = sc.nextInt();
        }
        UnionFind uf = new UnionFind(N);
        for (int i=0;i<M;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            uf.connect(x, y);
        }

        int[] root_tmp = new int[N];
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i=0;i<N;i++) {
            root_tmp[i] = uf.root(i);
            set.add(root_tmp[i]);
        }
        ArrayList<Integer> list = new ArrayList<Integer>(set);
        if (list.size()==1) {
            System.out.println(0);
            return;
        }
        int[] root = new int[N];
        for (int i=0;i<N;i++) {
            root[i] = Collections.binarySearch(list, root_tmp[i]);
        }
        // System.out.println(Arrays.toString(root));

        ArrayList<ArrayList<Integer>> cost = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<list.size();i++) {
            ArrayList<Integer> add = new ArrayList<Integer>();
            cost.add(add);
        }

        for (int i=0;i<N;i++) {
            cost.get(root[i]).add(a[i]);
        }
        for (int i=0;i<list.size();i++) {
            Collections.sort(cost.get(i));
        }

        ArrayList<Integer> cost_1 = new ArrayList<Integer>();
        ArrayList<Integer> cost_2 = new ArrayList<Integer>();
        for (int i=0;i<list.size();i++) {
            cost_1.add(cost.get(i).get(0));
        }
        int cnt = 0;
        for (int i=0;i<list.size();i++) {
            if (cost.get(i).size()>1) {
                cost_2.add(cost.get(i).get(1));
            } else {
                cnt++;
                if (cnt>=3) {
                    System.out.println("Impossible");
                    return;
                }
            }
        }

        long ans = 0L;
        for (int i=0;i<list.size();i++) {
            ans = ans+Long.valueOf(cost_1.get(i));
        }
        Collections.sort(cost_2);
        for (int i=0;i<list.size()-2;i++) {
            ans = ans+Long.valueOf(cost_2.get(i));
        }
        System.out.println(ans);
        // System.out.println(cost_1);
        // System.out.println(cost_2);
    }
}