
import java.util.*;

public class Main{

    BitSet primes;
    private void primesOfEratosthenes(int n){
        int rn = (int)Math.sqrt(n);

        primes = new BitSet(n+1);
        primes.flip(0,n+1);

        primes.set(0,false);
        primes.set(1,false);
        for(int i=4;i<primes.size();i+=2){
            primes.set(i,false);
        }

        int i=3;
        while(true){
            for(int j=i;i*j<primes.size();j+=2){
                primes.set(i*j,false);
            }

            i = primes.nextSetBit(i+1);
            if(i>rn){
                break;
            }
        }
    }

    BitSet like2017s;
    private void precalc(){
        like2017s = (BitSet)primes.clone();

        for(int i=like2017s.nextSetBit(2); i!=-1 ; i=like2017s.nextSetBit(i+1)){
            int n = (int)((i+1)/2);
            like2017s.set(i,primes.get(n));
        }
    }

    private int solve(int l, int r){
        return like2017s.get(l,r+1).cardinality();
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
        precalc();

        for(int i=0;i<q;i++){
            System.out.println(solve(l[i], r[i]));
        }

        sc.close();
    }

    public static void main(String[] args){
            (new Main())._main(args);
    }
}
