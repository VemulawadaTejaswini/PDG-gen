
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;


public class Main {
    
         
    static FastReader in;
    static StringBuilder out;
    static int[][]dist;
    public  static void main(String[] args) {
        
        in = new FastReader();
        out=new StringBuilder();
        int n=in.nextInt(),x=in.nextInt(),y=in.nextInt();
        dist=new int[n+1][n+1];
        for(int i=0;i<n+1;i++)Arrays.fill(dist[i], Integer.MAX_VALUE);
        boolean []visited=new boolean[n+1];
        for(int i=1;i<n+1;i++){
            Queue<Integer> s=new LinkedList<>();
            Queue<Integer> height=new LinkedList<>();
            s.add(i);height.add(0);
            int j=0,h;
            Arrays.fill(visited, false);
            while(!s.isEmpty()){
                j=s.remove();
                h=height.remove();
                visited[j]=true;
                dist[i][j]=Math.min(dist[i][j],h);
                // System.out.println(i+" "+j+">>"+h);
                if(j==x && !visited[y]){
                    s.add(y);
                    height.add(h+1);
                }
                if(j==y && !visited[x]){
                    s.add(x);
                    height.add(h+1);
                }
                if(j!=1 && !visited[j-1]){
                    s.add(j-1);
                    height.add(h+1);
                }
                if(j!=n && !visited[j+1]){
                    s.add(j+1);
                    height.add(h+1);
                }
            }
        }
        // int [][]dist2=new int[n+1][n+1];
        // for(int i=0;i<n+1;i++)Arrays.fill(dist2[i], Integer.MAX_VALUE);
        // for(int i=1;i<n+1;i++){
        //     Stack<Integer> s=new Stack<>();
        //     Stack<Integer> height=new Stack<>();
        //     s.push(i);height.push(0);
        //     int j=0,h;
        //     Arrays.fill(visited, false);
        //     while(!s.isEmpty()){
        //         j=s.pop();
        //         h=height.pop();
        //         visited[j]=true;
        //         dist2[i][j]=Math.min(dist2[i][j],h);
        //         // System.out.println(i+" "+j+">>"+h);
        //         if(j==x && !visited[y]){
        //             s.push(y);
        //             height.push(h+1);
        //         }
        //         if(j==y && !visited[x]){
        //             s.push(x);
        //             height.push(h+1);
        //         }
        //         if(j!=1 && !visited[j-1]){
        //             s.push(j-1);
        //             height.push(h+1);
        //         }
        //         if(j!=n && !visited[j+1]){
        //             s.push(j+1);
        //             height.push(h+1);
        //         }
        //     }
        // }
        // boolean dec=true;
        // for(int i=1;i<n+1;i++){
        //     for(int j=1;j<n+1;j++){
        //         System.out.print(dist[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        int []ans=new int[n];
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                ans[dist[i][j]]++;
            }
        }
        for(int i=1;i<n;i++){
            out.append(ans[i]).append('\n');
        }
        System.out.println(out);
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
 
        double nextDouble() {
            return Double.parseDouble(next());
        }
 
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
 
     
    
}