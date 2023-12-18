
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long m=sc.nextInt();
        long mod=1000000007;
        long[] sum=new long[n+1];
        sum[0]=sc.nextInt()%m;
        for(int i=1;i<n;i++){
            sum[i]=(sc.nextInt()+sum[i-1])%m;
        }
        Arrays.sort(sum);
        long count=1;
        long ans=0;
        for(int i=1;i<n+1;i++){
            if(sum[i-1]==sum[i]){
                count++;
            }else{
                ans=(ans+count*(count-1)/2)%mod;
                count=1;
            }
            if(i==n){
                ans=(ans+count*(count-1)/2)%mod;
            }
        }
        System.out.println(ans);

    }
}
