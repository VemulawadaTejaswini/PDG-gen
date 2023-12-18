import java.util.*;


public class Main {
    static private ArrayList<Integer> primes = new ArrayList<Integer>();

    static void initPrimes(){
        primes.add(2);
        for(int i = 2; i < Math.sqrt(100000); i++){
            boolean isPrime = true;
            for(int p : primes){
                if(i % p == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                primes.add(i);
            }
        }
    }

    static void count2017ish(int l, int r){
        int count = 0;
        for(int i = l; i <= r; i+=2){
            if(i == 1){
                continue;
            }

            int ip = (i+1)/2;
            boolean ipIsPrime = true;

            for(int p : primes){
                if(ip % p == 0){
                    ipIsPrime = false;
                    break;
                }
            }
            if(ipIsPrime){
                boolean iIsPrime = true;

                for(int p : primes){
                    if(i % p == 0){
                        iIsPrime = false;
                        break;
                    }
                }
                if(iIsPrime){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            count2017ish(l, r);
        }
    }

    public static void main(String[] args){
        initPrimes();
        solve();
    }
}