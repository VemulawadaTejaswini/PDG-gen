import java.util.*;

public class Main {

    static class Node {
        int parent;
        HashSet<Integer> neighbors;
        HashSet<Integer> children;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<HashSet<Integer>> edge = new ArrayList<HashSet<Integer>>();
        for (int i=0;i<N;i++) {
            HashSet<Integer> add = new HashSet<Integer>();
            edge.add(add);
        }
        boolean[] root_find = new boolean[N];
        for (int i=0;i<N-1+M;i++) {
            int A = sc.nextInt()-1;
            int B = sc.nextInt()-1;
            root_find[B] = true;
            edge.get(A).add(B);
        }
        int root = -1;
        for (int i=0;i<N;i++) if (!root_find[i]) root=i;

        // ArrayList<Node> list = new ArrayList<Node>();
        int[] parent = new int[N];
        Arrays.fill(parent, -2);
        parent[root] = -1;
        ArrayDeque<Integer> q = new ArrayDeque<Integer>();
        q.add(root);
        while (!q.isEmpty()) {
            int rem = q.poll();
            // if (parent[root]>=0) {
            // }
            for (Integer i : edge.get(rem)) {
                if (parent[i]<0) q.add(i);
                parent[i] = rem;
            }
        }
        for (int i=0;i<N;i++) {
            System.out.println(parent[i]+1);
        }
    }
}