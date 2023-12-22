import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.math.*;
import java.io.*;


public class Main {
    static int popcount(int X){
        int p = 0;
        for(int i=0; i<30; i++) if((X & (1<<i)) != 0) p++;
        return p;
    }
    static int popCount(String X){
        int p=0;
        for(int i=0; i<X.length(); i++) if(X.charAt(i)=='1') p++;
        return p;
    }
    static int powmod(int a, int n, int m){
        if(n==0) return 1;
        if(n==1) return a%m;
        if(n%2==0) {
            long half = powmod(a, n/2, m);
            return (int)(half * half % m);
        }
        return (int)((a * powmod(a, n-1, m))%m);
    }

    static int calc(int X, Map<Integer,Integer> result){
        //if(X==0) return 0;
        if(result.containsKey(X)) return result.get(X);
        else{
            int next = X % popcount(X);
            int less = calc(next, result);
            result.put(X, 1+less);
            return 1+less;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String X = sc.next();

        int p = popCount(X);

        int mm = p-1<=0 ? 0 : new BigInteger(X,2).mod(new BigInteger(Integer.toString(p-1))).intValue();
        int mp = new BigInteger(X,2).mod(new BigInteger(Integer.toString(p+1))).intValue();
        Map<Integer, Integer> result = new HashMap<>();
        result.put(0, 0);

        for(int n=0; n<N; n++){
            if(X.charAt(n)=='1'){
                int pi = p-1;
                if(pi==0){
                    System.out.println(0);
                    continue;
                }
                int first = (mm + pi - powmod(2, N-1-n, pi)) % pi;
                //System.out.printf("first: %d - 2^%d = %d\n", mm, N-1-n, first);
                System.out.println(1 + calc(first, result));
            }else{
                int pi = p+1;
                int first = (mp + pi + powmod(2, N-1-n, pi)) % pi;
                //System.out.printf("first: %d + 2^%d = %d\n", mp, N-1-n, first);
                System.out.println(1 + calc(first, result));
            }
        }
        
    }
}
