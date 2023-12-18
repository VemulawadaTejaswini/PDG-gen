import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class c {
    public static long dp(int[]w,int []v,int max){
        long[][] memo=new long[w.length+1][max+1];
        long ans=0;
        for(int i=w.length-1;i>=0;i--){
            for(int j=0;j<=max;j++){
                long take=0;
                long leave=0;
                if(j+w[i]<=max&&i!=w.length)take=memo[i+1][j+w[i]]+v[i];
                if(i!=w.length-1)leave=memo[i+1][j];
                memo[i][j]=Math.max(take,leave);
                ans=Math.max(memo[i][j],ans);
            }
        }

    return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        //StringBuilder sb=new StringBuilder();
        //StringTokenizer st=new StringTokenizer(br.readLine());
        //PriorityQueue<Integer> pq=new PriorityQueue<>();
        //HashSet<Integer> hs=new HashSet<>();
        //int q = Integer.parseInt(br.readLine());
        int kk =1;
        while (kk-- > 0) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n =Integer.parseInt(st.nextToken());
            int max =Integer.parseInt(st.nextToken());

            int w[]=new int[n];
            int v[]=new int[n];
            for(int i=0;i<n;i++){
                st=new StringTokenizer(br.readLine());
                w[i]=Integer.parseInt(st.nextToken());
                v[i]=Integer.parseInt(st.nextToken());
            }

            out.println(dp(w,v,max));
            // for(int i=0;i<a.length;i++){
            //  out.println(Arrays.toString(a[i]));
            //}
            //out.println();
            //out.println(Arrays.toString(b));
        }//out.println();
        out.close();
    }
}