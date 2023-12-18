import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int temp1 = in.nextInt();
            int temp2 = in.nextInt();
            graph.get(temp1 - 1).add(temp2-1);
        }
        int max = 0;
        //  System.out.println(go(mat,0,0));
        boolean vis[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                int temp = go(graph, i, 0, vis);
                //System.out.println(i+" "+temp+" ");
                max = Math.max(max, temp);
            }
        }
        System.out.println(max);

    }

    static int go(List<List<Integer>> graph, int curr, int level, boolean vis[]) {
        // System.out.println("Curr = "+curr+" "+level);
        int currL = level;
        for (int i = 0; i < graph.get(curr).size(); i++) {
            level = Math.max(level, go(graph, graph.get(curr).get(i), currL, vis) + 1);
        }
        vis[curr] = true;
        return level;
    }

}