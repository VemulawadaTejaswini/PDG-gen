import java.nio.Buffer;
import java.util.*;
import java.io.*;

public class Main {
    static int [][]map=new int[100001][3];
    static int [][]ans=new int[100001][3];
    static int dp(int N,int position){
        if(N<=0||position<0) return 0;
        if(ans[N][position]!=0) return ans[N][position];
        ans[N][position]=Math.max(ans[N][position],map[N][position]+dp(N-1,((position+1)%3)));
        ans[N][position]=Math.max(ans[N][position],map[N][position]+dp(N-1,((position+2)%3)));

        return ans[N][position];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=0;j<3;j++){
                map[i][j]=sc.nextInt();
            }
        }
        int k=0;
        for(int i=0;i<3;i++){
            k=Math.max(k,dp(N,i));
        }
        System.out.println(k);

    }
}