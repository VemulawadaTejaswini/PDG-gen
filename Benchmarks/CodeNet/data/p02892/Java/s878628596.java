import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        // graph list
        LinkedList<ArrayList<Integer>> edge_2 = new LinkedList<ArrayList<Integer>>();
        for (int i=0;i<N;i++) {
            ArrayList<Integer> add = new ArrayList<Integer>();
            edge_2.add(add);
        }
        ArrayList<ArrayList<Integer>> edge = new ArrayList<ArrayList<Integer>>(edge_2);
      

        //graph matrix
        char[][] graph = new char[N][N];
        for (int i=0;i<N;i++) {
            String S = sc.next();
            for (int j=0;j<N;j++) {
                char flag = S.charAt(j);
                graph[i][j] = flag;

                // graph list add
                if (flag=='1') {
                    edge.get(i).add(j);
                }
            }
        }
        int flag = 0;
        int tmp_depth = 0;

        loop:for (int j=0;j<N;j++) {
            int[] used = new int[N];
            for (int i=0;i<N;i++) {
                used[i] = -1;
            }
            int root = j;
            ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
            int[] add = {root, 0};
            queue.add(add);
            while (!queue.isEmpty()) {
                int[] rem = queue.remove();int index = rem[0];int depth = rem[1];
                // System.out.println("rem : " + Arrays.toString(rem));
                tmp_depth = Math.max(tmp_depth, depth);
                used[index] = depth;
                LinkedList<Integer> edge_list = edge.get(index);
                for (Integer i : edge_list) {
                    if (used[i]==-1) {
                        int[] add_q = {i, depth+1};
                        queue.add(add_q);
                    } else if (used[i]!=depth-1) {
                        flag=1;
                        break loop;
                    }
                }
            }
        }
        if (flag==1) {
            System.out.println(-1);
        } else {
            System.out.println(tmp_depth+1);
        }

        // for (ArrayList<Integer> aaa : edge) {
            // System.out.println(aaa);
        // }
        // System.out.println("used " + Arrays.toString(used));
    }
}
