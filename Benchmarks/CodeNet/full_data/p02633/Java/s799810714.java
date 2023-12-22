import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;

class MathLib{
    static long gcd(long a, long b){
        if(a<0) a = -a;
        if(b<0) b = -b;
        if(a>b){
            long t = a;
            a = b;
            b = t;
        }
        while(a>0){
            long r = b%a;
            b = a;
            a = r;            
        }
        return b;
    }
    static long lcm(long a, long b){
        return a / gcd(a,b) * b;
    }
    static boolean isPrime(long N){
        if(N%2==0) return false;
        for(long i=3; i*i<=N; i+=2){
            if(N%i==0) return false;
        }
        return true;
    }

    static List<Integer> primeList(int max){
        boolean[] prime = new boolean[max+1];
        Arrays.fill(prime, true); prime[0]=false; prime[1]=false;
        ArrayList<Integer> list = new ArrayList<>();
        for(int n=2; n<=max; n++) if(prime[n]){
            list.add(n);
            if(n*n<=max) for(int m=2*n; m<=max; m+=n) prime[m]=false;
        }
        return list;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(MathLib.lcm(N, 360) / N);
    }
}

