import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static long dp(int[]w,int []v,int c,int i){
        long ans=0;
        if(i==-1||c==0)ans= 0;
        else if(w[i]>c)ans =dp(w, v, c, i-1);
        else ans=Math.max(dp(w, v, c-w[i], i-1)+v[i],dp(w, v, c, i-1));
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

            out.println(dp(w,v,max,w.length-1));
            // for(int i=0;i<a.length;i++){
            //  out.println(Arrays.toString(a[i]));
            //}
            //out.println();
            //out.println(Arrays.toString(b));
        }//out.println();
        out.close();
    }
}