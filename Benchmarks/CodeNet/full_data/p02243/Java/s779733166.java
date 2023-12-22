import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] Args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        final vec[][] mat = new vec[n][];
        for(int i = 0; i<n; i++){
            final StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            final int u = Integer.parseInt(st.nextToken());
            final int k = Integer.parseInt(st.nextToken());
            mat[u] = new vec[k];
            for(int j = 0; j<k; j++){
                mat[u][j] = new vec(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }
        }
        final int[] cost = new int[n];
        for(int i = 0; i<n; i++)
            cost[i] = Integer.MAX_VALUE;
        final PriorityQueue<vec> pq = new PriorityQueue<vec>();
        pq.add(new vec(0, 0));
        while(!pq.isEmpty()){
            final int t = pq.peek().t;
            final int c = pq.poll().c;
            if(c>=cost[t]) continue;
            cost[t] = c;
            for(final vec v:mat[t]){
                pq.add(new vec(v.t, c+v.c));
            }
        }
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++){
            sb.append(i).append(' ').append(cost[i]).append('\n');
        }
        System.out.print(sb);
    }
}

class vec implements Comparable<vec>{
    final int t;
    final int c;
    vec(int to, int cost){
        t = to;
        c = cost;
    }
    @Override
    public int compareTo(vec other){
        return c-other.c;
    }

}