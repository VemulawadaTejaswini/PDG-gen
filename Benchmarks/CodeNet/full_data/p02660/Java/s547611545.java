
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static Set<Integer> primes = new HashSet<>();
    private static final int MAX = 1000000;
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        process();
        long num = Long.parseLong(br.readLine());
        System.out.println(solve(num));
    }

    private static int solve(long num){
        if(num==1)
            return 0;
        if(isPrime(num))
            return 1;
        int count = 0;
        for(Integer prime : primeFactors(num)){
            long curr = prime;
            while(num%curr==0){
                count++;
                num/=curr;
                curr*=prime;
            }
            while(num%prime==0){
                num/=prime;
            }
        }
        count+=solve(num,MAX+1);
        return count;
    }

    private static final int solve(long num,long start){
        if(num==1)
            return 0;
        int count=0;
        while(start<=num){
            long temp = start;
            while(num%temp==0){
                count++;
                num/=temp;
                temp*=start;
            }
            while(num%start==0)
                num/=start;
            start++;
        }
        return count;
    }

    public static void process(){
        boolean[] prime = new boolean[MAX+1];
        Arrays.fill(prime,true);
        prime[0] = prime[1]  =false;
        for(int i=2;i<=MAX;){
            for(int j=2*i;j<=MAX;j+=i)
                prime[j]=false;
            i++;
            while(i<=MAX && !prime[i])
                i++;
        }
        for(int i=2;i<=MAX;i++){
            if(prime[i])
                primes.add(i);
        }

    }

    private static Set<Integer> primeFactors(long num){
        Set<Integer> factors = new HashSet<>();
        for(Integer n : primes){
            if(num%n==0)
                factors.add(n);
        }
        return factors;
    }

    private static boolean isPrime(long num){
        for(long n = 2;n*n<=num;n++){
            if(num%n==0)
                return false;
        }
        return true;
    }

}