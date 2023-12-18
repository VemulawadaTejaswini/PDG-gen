import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong(), b=sc.nextLong();
        sc.close();
        long r=euclidean_gcd(a, b);
        HashSet<Long> primes=new HashSet<>();
        add(primes,r);
        primes.add(1l);
        System.out.println(primes.size());
    }
    public static void add(HashSet<Long> set, long k){
        for(long i=2;i*i<=k;i++){
            if(k%i==0) set.add(i);
            while(k%i==0) k/=i;
        }
        set.add(k);
    }
    public static long euclidean_gcd(long a, long b) {
        if(a < b) return euclidean_gcd(b, a);
        long r=a%b;
        while (r!=0) {
          a = b;
          b = r;
          r=a%b;
        }
        return b;
    }
}