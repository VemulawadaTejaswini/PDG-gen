import java.util.*;
import java.io.*;
public class Main {
    
    static int n;
    static int miti_count=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int l=Integer.parseInt(st.nextToken());
        int[] p=new int[k];
        int[] q=new int[k];
        int[] r=new int[l];
        int[] s=new int[l];
        for(int i=0;i<k;i++){
            st=new StringTokenizer(br.readLine());
            p[i]=Integer.parseInt(st.nextToken()) - 1;
            q[i]=Integer.parseInt(st.nextToken()) - 1;
        }for(int i=0;i<l;i++){
            st=new StringTokenizer(br.readLine());
            r[i]=Integer.parseInt(st.nextToken()) - 1;
            s[i]=Integer.parseInt(st.nextToken()) - 1;
        }
        
        int[] miti_list=new int[n];
        for(int i=0;i<n;i++) dfs(i,p,q,miti_list,i+1);
        //System.out.println(Arrays.toString(miti_list));
        
        int[] tetu_list=new int[n];
        for(int i=0;i<n;i++) dfs(i,r,s,tetu_list,i+1);
        //System.out.println(Arrays.toString(tetu_list));
        
        int[] sum=new int[n];
        
        int[][] dp=new int[n+1][n+1];
        
        for(int i=0;i<n;i++){
            dp[miti_list[i]][tetu_list[i]]++;
        }for(int i=0;i<n;i++){
            if(i!=0) System.out.print(" ");
            System.out.print(dp[miti_list[i]][tetu_list[i]]);
        }System.out.println();
    }
    
    static void dfs(int index,int[] start,int[] end,int[] a,int number){
        if(index==n){ return; }
        if(a[index]!=0){ return; }
        a[index]=number;
        for(int i=0;i<start.length;i++){
            if(start[i]==index){
                dfs(end[i],start,end,a,number);
            }
        }
    }
}
