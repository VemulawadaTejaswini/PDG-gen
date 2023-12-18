import java.util.*;

public class Main {    
    
    static int MOD = (int) (Math.pow(10,9) + 7);
    
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       
       long N = sc.nextLong();
       long M = sc.nextLong();
       
       if(N > M + 1 || M > N + 1){
           System.out.println(0);
       }else if(N == M + 1 || M == N + 1){
           System.out.println(((fact(M)%MOD)*(fact(N)%MOD))%MOD);
       }else if(N == M){
           System.out.println(2*(((fact(M)%MOD)*(fact(N)%MOD))%MOD));
       }
              
    }  
    
    static long fact(long n){
        long fact = 1;        
        for(int i = 1;i <= n;i++){
            fact *= i;
            fact%= MOD;
        }        
        return fact%MOD;
    }
    
}        
        