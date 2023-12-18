import java.util.*;

public class Main {
    static int n;
    static int k;
    static ArrayList<Integer>[] edge;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        edge = new ArrayList[n];
        for(int i=0; i<n; i++) edge[i] = new ArrayList<Integer>();
        for(int i=0; i<n-1; i++){
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            edge[a].add(b);
            edge[b].add(a);
        }
        sc.close();

        int ans = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            ans = Math.min(ans, countDelNum(i));
        }
        if(k%2==1 && ans > 0) ans--;
        System.out.println(ans);
    }

    public static int countDelNum(int root){
        int count = n;
        ArrayDeque<Integer[]> que = new ArrayDeque<Integer[]>();
        boolean[] use = new boolean[n];
        que.add(new Integer[]{root, 0});
        use[root] = true;
        while(que.size()>0){
            Integer[] cur = que.poll();
            if(cur[1] > k/2) break;
            for(int i=0; i<edge[cur[0]].size(); i++){
                Integer next = edge[cur[0]].get(i);
                if(!use[next]){
                    que.add(new Integer[]{next, cur[1]+1});
                    use[next] = true;
                }
            }
            count--;
        }
        return count;
    }
}