import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[]) throws Exception {
        int n = Integer.parseInt(br.readLine());
        int[] v = new int[n+1];
        int[] w = new int[n+1];
        String[] tokens = null;
        for(int i=1;i<=n;i++){
            tokens = br.readLine().split(" ");
            v[i] = Integer.parseInt(tokens[0]);
            w[i] = Integer.parseInt(tokens[1]);
        }
        int q = Integer.parseInt(br.readLine());;
        while(q-->0){
            tokens = br.readLine().split(" ");
            int vertex = Integer.parseInt(tokens[0]);
            int l  = Integer.parseInt(tokens[1]);
            System.out.println(solve(v,w,vertex,l));
        }
    }

    private static long solve(int[] v,int w[],int vertex,int l){
        List<Integer> vals = new ArrayList<>();
        List<Integer> wts = new ArrayList<>();
        int vert = vertex;
        while(vert>=1){
            vals.add(v[vert]);
            wts.add(w[vert]);
            vert>>=1;
        }
        Map<Pair,Long> dp = new HashMap<>();
        return knapsack(vals,wts,vals.size()-1,l,dp);
    }



    private static long knapsack(List<Integer> vals,List<Integer> wts,int vertex,int l,Map<Pair,Long> dp){
        if(vertex<0)
            return 0;
        Pair p = new Pair(vertex,l);
        if(dp.containsKey(p))
            return dp.get(p);
        long ans = knapsack(vals,wts,vertex-1,l,dp);
        if(wts.get(vertex)<=l)
            ans = Math.max(ans,knapsack(vals,wts,vertex-1,l-wts.get(vertex),dp)+vals.get(vertex));
        dp.put(p,ans);
        return ans;
    }


    private static class Pair{
        int vertex,l;

        public Pair(int vertex,int l){
            this.vertex = vertex;
            this.l = l;
        }

        public int hashCode(){
            return Objects.hash(vertex,l);
        }

        public boolean equals(Object obj){
            return vertex == ((Pair)obj).vertex && l == ((Pair)obj).l;
        }
    }

}