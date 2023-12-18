import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = 1;
        int a = 1000000007;
        
        if(Math.abs(N-M)>1){
            System.out.println(0);
        }
        else if(N==1 && M==1){
            System.out.println(1);
        }
        else{
            if(N==M){
                for(int i=1; i<=N; i++){
                    K = K * i % a;
                }
                System.out.println((K * K * 2) % a);
            }
            else if(N<M){
                for(int i=1; i<=M; i++){
                    K = K * i % a;
                }
                System.out.println((K * (K / M)) % a);
            }
            else{
                for(int i=1; i<=N; i++){
                    K = K * i % a;
                }
                System.out.println(K * ((K / N) % a));
            }
        }
    }
}