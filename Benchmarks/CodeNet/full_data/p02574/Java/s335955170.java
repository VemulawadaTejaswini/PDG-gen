import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        Map<Long, Integer> map = new HashMap<>();
        boolean flag = true;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if(flag){
                Map<Long, Integer> prime = primeFactorization(a[i]);
                for(Long l : prime.keySet()){
                    if(map.containsKey(l)){
                        flag = false;
                    }else{
                        map.put(l, 1);
                    }
                }
            }
        }

        System.out.println(flag ? "pairwise coprime" : gcd(a) == 1 ? "setwise coprime" : "not coprime");

    }
    
    static Map<Long, Integer> primeFactorization(long n){
        Map<Long, Integer> result = new TreeMap<>();
        if(isPrime(n)){
            result.put(n, 1);
            return result;
        }
        for(long i = 2; i * i <= n; i++){
            if(n % i != 0){
                continue;
            }
            int p = 0;
            while(n % i == 0){
                p++;
                n /= i;
            }
            result.put(i, p);
        }
        if(n != 1){
            result.put(n, 1);
        }
        return result;
    }

    static boolean isPrime(long n){
        if(n == 2){
            return true;
        }
        if(n < 2 || n % 2 == 0){
            return false;
        }
        long sqrt = (long)Math.sqrt(n);
        for(long i = 3; i <= sqrt; i += 2){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


    static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }

    static int gcd(int[] a){
        int result = 0;
        for(int i : a){
            result = gcd(result, i);
        }
        return result;
    }
}
