import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        long K=sc.nextLong();
        long ans=0;
        
        if(K%2==0){
            long num=(N+K/2)/K;
            ans+=(num*num*num);
        }
        
        
        long num=N/K;
        ans+=(num*num*num);
        
        System.out.println(ans);
    }
}
