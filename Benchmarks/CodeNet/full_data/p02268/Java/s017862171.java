import java.util.*;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[];
        int ans=0;
        A=new int[N+2];
        for(int i=0;i<N;i++) A[i+1]=sc.nextInt();
        A[0]=-2000000000;
        A[N+1]=2000000000;
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int key1=sc.nextInt();
            int key2=key1+1;
            int hi=N+1;
            int lo=-1;
            while(hi-lo>1){
                int mid=(hi+lo)/2;
                if(A[mid]>=key1) hi=mid;
                else lo=mid;
            }
            int res1=hi;
            hi=N+1;
            lo=-1;
            while(hi-lo>1){
                int mid=(hi+lo)/2;
                if(A[mid]>=key2) hi=mid;
                else lo=mid;
            }
            int res2=hi;
            if(res2-res1>0) ans++;
        }
        System.out.println(ans);
    }
}
