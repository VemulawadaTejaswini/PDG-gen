import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long N=sc.nextLong();
        long K=sc.nextLong();
        long ans=0;
        lavel:for(long i=K;i<=N;i++){
            for(long j=K+1;j<=N;j++){
                if(i%j>=K){
                    if(i<j){
                    ans+=N-(j-1);
               continue lavel;
                    }else{
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }

}