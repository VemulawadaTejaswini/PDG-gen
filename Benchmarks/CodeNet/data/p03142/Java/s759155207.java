import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<HashSet<Integer>> edge = new ArrayList<HashSet<Integer>>();
        for (int i=0;i<N;i++) {
            HashSet<Integer> add = new HashSet<Integer>();
            edge.add(add);
        }
        int[] in = new int[N];
        int[] A = new int[N+M-1];
        int[] B = new int[N+M-1];
        for (int i=0;i<N+M-1;i++) {
            A[i] = sc.nextInt()-1;
            B[i] = sc.nextInt()-1;
            edge.get(A[i]).add(B[i]);
            in[B[i]]++;
        }

        int index = -1;
        for (int i=0;i<N;i++) {
            if (in[i]==0) {
                index = i;
                break;
            }
        }

        ArrayList<Integer> topo = new ArrayList<Integer>();
        ArrayDeque<Integer> q = new ArrayDeque<Integer>();
        q.add(index);
        while (!q.isEmpty()) {
            Integer rem = q.poll();
            topo.add(rem);
            for (Integer to : edge.get(rem)) {
                in[to]--;
                if (in[to]==0) q.add(to);
            }
        }

        int[] inv = new int[N];
        for (int i=0;i<N;i++) {
            inv[topo.get(i)] = i;
        }

        ArrayList<TreeSet<Integer>> edge_reverse = new ArrayList<TreeSet<Integer>>();
        for (int i=0;i<N;i++) {
            TreeSet<Integer> add = new TreeSet<Integer>();
            edge_reverse.add(add);
        }
        for (int i=0;i<N+M-1;i++) {
            edge_reverse.get(inv[B[i]]).add(inv[A[i]]);
        }

        for (int i=0;i<N;i++) {
            int root = 0;
            if (inv[i]!=0) root=topo.get(edge_reverse.get(inv[i]).last())+1;
            System.out.println(root);
        }
    }
}
