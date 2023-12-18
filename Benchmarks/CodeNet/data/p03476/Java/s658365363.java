import java.util.*;


public class Main {
    static private ArrayList<Integer> primes = new ArrayList<Integer>();

    static void initPrimes(){
        primes.add(2);
        for(int i = 3; i < Math.sqrt(100000); i++){
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

            if(primes.contains(i) && primes.contains(ip)){
                count++;
                continue;
            }

            boolean ipIsPrime = true;

            int border = (int)Math.sqrt(ip);
            for(int p : primes){
                if(p > border){
                    break;
                }
                else if(ip % p == 0){
                    ipIsPrime = false;
                    break;
                }
            }
            if(ipIsPrime){
                if(!primes.contains(ip)){
                    primes.add(ip);
                }
                boolean iIsPrime = true;

                border = (int)Math.sqrt(i);
                for(int p : primes){
                    if(p > border){
                        break;
                    }
                    else if(i % p == 0){
                        iIsPrime = false;
                        break;
                    }
                }
                if(iIsPrime){
                    if(!primes.contains(i)){
                        primes.add(i);
                    }
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