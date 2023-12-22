import java.util.*;
public class Main{
    public static int find(int cur_v, int cur_t, int[] time, int[] parent){
        if(time[cur_v] < cur_t) return cur_v;
        if(parent[cur_v] == cur_v) return cur_v;
        return parent[cur_v] = find(parent[cur_v], cur_t, time, parent);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            if (n == 0 && q == 0) return;
            int[] parent = new int[n+1];
            int[] time = new int[n+1];
            Arrays.fill(time, Integer.MAX_VALUE);
            List<Integer> qt = new ArrayList<Integer>();
            List<Integer> vt = new ArrayList<Integer>();
            for (int i = 2; i <= n; i++) {
                int v = sc.nextInt();
                parent[i] = v;
            }
            parent[1] = 1;
            long sum = 0;
            for (int i = 1; i <= q; i++) {
                String s = sc.next();
                int v = sc.nextInt();
                if (s.equals("M"))
                    time[v] = Math.min(time[v], i);
                else
                {
                    qt.add(i);
                    vt.add(v);
                }
            }
            int q_ct = qt.size();
            for(int i=q_ct-1; i>=0; i--){
                int cur_v = vt.get(i);
                int cur_t = qt.get(i);
                sum += find(cur_v, cur_t, time, parent);
            }
            System.out.println(sum);
        }
    }
}
