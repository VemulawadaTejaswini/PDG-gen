import java.util.*;

public class Main {    
    
    static int MOD = (int) (Math.pow(10,9) + 7);
    
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       
       int N = sc.nextInt();
       int M = sc.nextInt();
       
       if(N > M + 1 || M > N + 1){
           System.out.println(0);
       }else if(N == M + 1 || M == N + 1){
           System.out.println(((Fact(M,MOD)%MOD)*(Fact(N,MOD)%MOD))%MOD);
       }else if(N == M){
           System.out.println((long)(2*(Fact(M,MOD)%MOD)*(Fact(N,MOD)%MOD)%MOD));
       }
              
    }  
    
    static long Fact(int n,int mod){
        long fact = 1;        
        for(int i = 1;i <= n;i++){
            fact *= i;
            fact %= MOD;
        }        
        return fact;
    }
    
}        
        
        
        
        