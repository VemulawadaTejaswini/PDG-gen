import java.io.*;
import java.util.*;

public class Main{

    static int n;
    static int[] hu=new int[15];

    static int[][] a=new int[15][15];

    static boolean dfs(int i){
        for(int j=0;j<n;j++){
            if(a[i][j]>-1&&hu[j]<0){
                hu[j]=a[i][j];
                if(i!=j&&a[i][j]==1&&!dfs(j)){
                    return false;
                }
            }else if(hu[j]>-1&&hu[j]!=a[i][j]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int inp=0;
        for(int i=0;i<n;i++){
            Arrays.fill(a[i],-1);
            a[i][i]=1;
            inp=sc.nextInt();
            for(int j=0;j<inp;j++){
                a[i][sc.nextInt()-1]=sc.nextInt();
            }
        }
        Queue<Integer> q=new ArrayDeque<>();
        int ans=0,count=0;
        boolean flag=true;
        for(int bit=0;bit<(1<<n);bit++){
            Arrays.fill(hu,-1);
            count=0;
            flag=true;
            for(int i=0;i<n;i++){
                if((bit&(1<<i))>0){
                    q.add(i);
                }
            }
            while(q.peek()!=null){
                int l=q.remove();
                if((flag=dfs(l))==false){
                    q.clear();
                    break;
                }
            }
            if(flag){
                for(int j=0;j<n;j++){
                    if(hu[j]==1)count++;
                }
            }
            ans=Math.max(ans,count);
        }
        System.out.println(ans);
    }
}