import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = 100000;
        Sieve sieve = new Sieve(N);
        int[] likes = new int[N+1];
        for (int i = 0; i < likes.length; i++) {
            if(i%2==1 && sieve.isPrime(i) && sieve.isPrime((i+1)/2)){
                likes[i] = 1;
            }
        } 
        int[] sump = new int[N+1];
        for (int i = 1; i < sump.length; i++) {
            sump[i] = sump[i-1] + likes[i];
        }
        // for (int i = 0; i < 15; i++) {
        //     System.out.print(prime.get(i));
        // }
        int Q = scanner.nextInt();
        int[] ls = new int[Q];
        int[] rs = new int[Q];
        for (int i = 0; i < Q; i++) {
            ls[i] = scanner.nextInt();
            rs[i] = scanner.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            int left = ls[i]-1;
            int right = rs[i];
            System.out.println(sump[right] - sump[left]);
        }
    }
    public static class Sieve {
        private int n;
        private int[] f;
        public ArrayList<Integer> primes = new ArrayList<>();
        public Sieve(int N){
            n = N;
            f = new int[n+1];
            f[0] = -1; // 0 is not prime
            f[1] = -1; // 1 is not prime
            for(int i = 2; i <= N; i++){
                if(f[i]!=0) continue;
                primes.add(i);
                f[i] = i;
                for(int j = i+i; j<=n; j+=i){
                    if(f[j]==0) f[j] = i;
                }
            }
        }
        public boolean isPrime(int i){
            return (f[i]==i);
        } 
        public ArrayList<Integer> factorList(int i){
            ArrayList<Integer> res = new ArrayList<>();
            while(i != 1){
                res.add(f[i]);
                i /= f[i];
            }
            return res;
        }
        public HashMap<Integer, Integer> factorCount(int i){
            HashMap<Integer, Integer> res = new HashMap<>();
            while(i != 1){
                res.putIfAbsent(f[i], 0);
                res.put(f[i], res.get(f[i]) + 1);
                i /= f[i];
            }
            return res;
        }
    }
}

