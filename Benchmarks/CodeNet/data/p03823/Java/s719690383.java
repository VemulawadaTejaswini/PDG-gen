import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long A = scan.nextLong();
        long B = scan.nextLong();
        long[] S = new long[N+1];
        long[] sum=new long[N+1];
        sum[0]=1;
        S[0] = -B;
        for(int i=1;i<=N;++i)S[i]=scan.nextLong();
        int lindex=-1;
        long mod = (long)1e9+7;
        if(A>B){
            long a = A;
            A=B;
            B=a;
        }
        for(int i=2;i<=N;++i)if(S[i]-S[i-2]<A){
            System.out.println(0);
            return;
        }

        for(int i=1;i<=N;++i){
            if(S[i]-S[i-1]<A){
                int index=Math.max(lindex,0);
                while(S[i]-S[index]>=B)++index;
                long dp = (index==0 ? 0: (sum[index-1] - (lindex>=0 ? sum[lindex]:0)+mod)%mod);
                sum[i]=(sum[i-1]+dp)%mod;
                lindex=i-2;
            }else if(S[i]-S[i-1]<B){
                int index=Math.max(lindex,0);
                while(S[i]-S[index]>=B)++index;
                long dp = (index==0 ? 0: (sum[index-1]-(lindex>=0 ? sum[lindex]:0)+mod)%mod);
                sum[i]=(sum[i-1]+dp)%mod;
            }else{
                long dp = (sum[i-1] - (lindex>=0 ? sum[lindex]:0)+mod)%mod;
                sum[i]=(sum[i-1]+dp)%mod;
            }
        }
        System.out.println(((sum[N]-sum[lindex]+mod)%mod));
    }
}