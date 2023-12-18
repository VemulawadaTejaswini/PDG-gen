import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            g.add(new ArrayList<>());
        }
        int[] B = new int[N];
        for (int i = 0; i < N-1; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            g.get(a).add(b);
            B[i] = b;
        }

        int K = 0;
        int[] color = new int[N];
        // BFS
        LinkedList<Vtx> q = new LinkedList<>();
        q.offer(new Vtx(0, 0));
        while (!q.isEmpty()) {
            Vtx v = q.poll();
            List<Integer> list = g.get(v.idx);
            int childColor = 1;
            for (int i : list) {
                if (childColor == v.color) {
                    childColor++;
                }
                q.offer(new Vtx(i, childColor));
                color[i] = childColor;
                K = Math.max(K, childColor);
                childColor++;
            }
        }

        System.out.println(K);
        for (int i = 0; i < N-1; i++) {
            System.out.println(color[B[i]]);
        }
    }

    private static class Vtx {
        final int color;
        final int idx;
        Vtx(int idx, int color) {
            this.idx = idx;
            this.color = color;
        }
    }
}
