import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N-1];
        ArrayList<ArrayList<Integer>> up = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> down = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<N;i++) {
            ArrayList<Integer> add_1 = new ArrayList<Integer>();
            ArrayList<Integer> add_2 = new ArrayList<Integer>();
            up.add(add_1);
            down.add(add_2);
        }
        for (int i=0;i<N-1;i++) {
            a[i] = Integer.parseInt(sc.next());
            up.get(i+1).add(a[i]-1);
            down.get(a[i]-1).add(i+1);
        }

        int max_depth = 0;
        int[] depth = new int[N];
        int[] cnt = new int[N];
        ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
        int[] init = {0, 0};
        queue.add(init);
        while (!queue.isEmpty()) {
            int[] rem = queue.remove();
            int index = rem[0];
            int dpt = rem[1];
            depth[index] = dpt;
            max_depth = Math.max(max_depth, dpt);
            cnt[index] = down.get(index).size();
            for (Integer i : down.get(index)) {
                int[] add = {i, dpt+1};
                queue.add(add);
            }
        }

        ArrayList<Integer> max_dpt_index = new ArrayList<Integer>();
        for (int i=0;i<N;i++) {
            if (depth[i]==max_depth) max_dpt_index.add(i);
        }

        int min = 1_000_000_000;
        for (Integer i : max_dpt_index) {
            int tmp = 0;
            ArrayDeque<Integer> q = new ArrayDeque<Integer>();
            q.add(i);
            while (!q.isEmpty()) {
                Integer rem = q.remove();
                if (up.get(rem).size()>0) {
                    q.add(up.get(rem).get(0));
                    tmp++;
                }
            }
            min = Math.min(min, tmp);
        }

        System.out.println(min);
    }
}