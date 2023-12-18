import java.util.*;
 
public class Main {
    static long mod = (long)Math.pow(10,9)+7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println(solve(N,M));
    }
    static long solve(int N, int M){
        if(Math.abs(N-M)>=2){
            return 0;
        }
        if(Math.abs(N-M)==1){
            return factorial(N)*factorial(M)%mod;
        }
        return 2*factorial(N)*factorial(M)%mod;
    }
    static long factorial(int X){
        long r = 1;
        for(int i=2; i<=X; i++){
            r*=i;
            r%=mod;
        }
        return r;
    }
}