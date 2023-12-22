import javax.swing.text.TabableView;
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int minCost=Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        InputReader in=new InputReader(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int x=in.nextInt();
        int cost[]=new int[n];
        int [][]val=new int[n][m];
        for(int i=0;i<n;i++){
            cost[i]=in.nextInt();
            for(int j=0;j<m;j++)
                val[i][j]=in.nextInt();
        }
        boolean []visit=new boolean[n];
        solve(0,visit,cost,val,x);
        if(minCost==Integer.MAX_VALUE)
            out.println(-1);
        else out.println(minCost);
        out.flush();
    }
    public static void solve(int n,boolean []visit,int cost[],int val[][],int x){
        if(n==visit.length){
            int totalval[]=new int[val[0].length];
            int spend=0;
            for(int i=0;i<n;i++){
                if(visit[i]){
                    spend+=cost[i];
                    for(int j=0;j<val[0].length;j++)
                        totalval[j]+=val[i][j];
                }
            }
            for(int i=0;i<val[0].length;i++)
                if(totalval[i]<x)
                    return;
            minCost=Math.min(spend,minCost);
            return;
        }
        solve(n+1,visit,cost,val,x);
        visit[n]=true;
        solve(n+1,visit,cost,val,x);
        visit[n]=false;
    }
    static class InputReader{
        private BufferedReader in;
        private StringTokenizer tokenizer;
        public InputReader(InputStream stream){
            in = new BufferedReader(new InputStreamReader(stream),32768);
            tokenizer = null;
        }
        public String next() throws IOException{
            while(tokenizer==null || !tokenizer.hasMoreTokens()){
                tokenizer = new StringTokenizer(in.readLine());
            }
            return tokenizer.nextToken();
        }
        public Long nextLong() throws IOException {
            String next = next();
            return Long.valueOf(next);
        }
        public int nextInt() throws IOException{
            return Integer.valueOf(next());
        }
    }
}