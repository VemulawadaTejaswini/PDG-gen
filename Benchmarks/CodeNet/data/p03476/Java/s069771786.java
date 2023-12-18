import java.util.*;

public class Main{

    BitSet primes;
    private void primesOfEratosthenes(int n){
        primes = new BitSet(n+1);
        primes.flip(0,n+1);

        primes.set(0,false);
        primes.set(1,false);
        for(int i=4;i<primes.size();i+=2){
            primes.set(i,false);
        }

        int i=3;
        int rn = (int)Math.sqrt(n);
        while(true){
            for(int j=i;i*j<primes.size();j+=2){
                primes.set(i*j,false);
            }

            i = primes.nextSetBit(i+1);
            if(i>rn){
                break;
            }
        }
        for(int j=primes.length(); (j = primes.previousSetBit(j-1)) >= 0;){
            primes.set(j, primes.get((int)((j+1)/2)));
        }

    }

    private int solve(int l, int r){
        return primes.get(l,r+1).cardinality();
    }

    private void _main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] l = new int[q];
        int[] r = new int[q];

        for(int i=0;i<q;i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        int max=0;
        for(int i=0;i<q;i++){
            max = Math.max(r[i], max);
        }
        primesOfEratosthenes(max);

        for(int i=0;i<q;i++){
            System.out.println(solve(l[i], r[i]));
        }

        sc.close();
    }

    public static void main(String[] args){
            (new Main())._main(args);
    }
}
