import java.nio.Buffer;
import java.util.*;
import java.io.*;

public class Main {
    static long [] map=new long[100001];
    static long [] ans=new long[100001];
    static int max2=987654321;
    static int K;
    static long dp(int N){
        if(N<=1) return 0;
        if(ans[N]!=max2) return ans[N];
        for(int i=1;i<=K;i++){
            if(N-i>=1){
                ans[N]=Math.min(ans[N],dp(N-i)+Math.abs(map[N-i]-map[N]));
            }
        }
        return ans[N];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        K=sc.nextInt();
        for(int i=1;i<=N;i++){
            map[i]=sc.nextLong();
            ans[i]=max2;
        }
        ans[1]=0;
        ans[2]=Math.abs(map[1]-map[2]);
        long k=dp(N);
        System.out.println(k);
    }
}