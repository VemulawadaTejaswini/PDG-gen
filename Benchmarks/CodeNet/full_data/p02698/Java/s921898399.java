import java.util.*;

public class Main {
    static int[] len;
    static Set<Integer> visited = new HashSet<>();
    static Map<Integer, List<Integer>> g = new HashMap<>();
    static long[] a;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        a = new long[N];
        len = new int[N];
        for(int i=0;i<N;i++){
            a[i] = sc.nextLong();
        }
        for(int i=0;i<N-1;i++){
            int u=sc.nextInt()-1;
            int v=sc.nextInt()-1;
            g.putIfAbsent(u, new ArrayList<>());
            g.putIfAbsent(v, new ArrayList<>());
            g.get(u).add(v);
            g.get(v).add(u);
        }
        List<Long> st = new ArrayList<>();
        st.add(a[0]);
        dfs(0, st);
        for(int i=0;i<N;i++){
            System.out.println(len[i]);
        }
    }

    private static void dfs(int now,final List<Long> nowSt){
        visited.add(now);
        //List<Long> newSt = new ArrayList<>(nowSt);
        int nowLength = nowSt.size();
        while(!nowSt.isEmpty() && nowSt.get(nowSt.size()-1) >= a[now]){
            nowSt.remove(nowSt.size()-1);
        }
        nowSt.add(a[now]);
        len[now] = nowSt.size();
        List<Integer> neighbors = g.get(now);
        Collections.sort(neighbors, Comparator.comparingLong(p->-a[p]));
        for(Integer nei:neighbors){
            if(visited.contains(nei)){continue;}
            dfs(nei, nowSt);
            while(nowSt.size() > nowLength) {
                nowSt.remove(nowSt.size()-1);
            }
        }
    }

}
