import java.util.*;

public class Main {

    static final int MOD=1000000007;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a = sc.nextInt();
        int b=sc.nextInt();
        long ans = 1;

        for(int i=0;i<n;i++){
            ans*=2;
            ans%=MOD;
        }
        ans-=1;
        ans-=(com(n,a)+com(n,b));
        System.out.println(ans);


    }
    static int fact(int n){
        int ans =1;
        for(int i=n;i>0;i--){
            ans*=i;
            ans=ans%MOD;
        }
        return ans;
    }

    static long com(int n,int k){
        long ans=1;
        k= Math.min(n-k,k);
        for(int i=0;i<k;i++){
            ans*=(n-i)%MOD/(i+1)%MOD;
            ans = ans%MOD;

        }
        return ans;
    }


}


