import java.util.*;

public class Main{

    BitSet sieve;
    private void sieveOfEratosthenes(int n){
        int rn = (int)Math.sqrt(n);

        sieve = new BitSet(n+1);
        sieve.flip(0,n+1);

        sieve.set(0,false);
        sieve.set(1,false);
        for(int i=4;i<sieve.size();i+=2){
            sieve.set(i,false);
        }

        int i=3;
        while(true){
            if(sieve.get(i)){
                for(int j=i;i*j<sieve.size();j+=2){
                    sieve.set(i*j,false);
                }
            }
            i+=2;
            if(i>rn){
                break;
            }
        }
    }

    private boolean nIsPrime(int n){
        return sieve.get(n);
    }

    private boolean nIsLike2017(int n){
        float f = (n+1)/2;
        int n2 = (int)f;
        if(f != n2){
            return false;
        }
        return nIsPrime(n) && nIsPrime(n2);        
    }

    private int solve(int l, int r){
        int result = 0;
        for(int i=l;i<=r;i++){
            if(nIsLike2017(i)){
                result ++;
            }
        }
        return result;
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
        sieveOfEratosthenes(max);

        for(int i=0;i<q;i++){
            System.out.println(solve(l[i], r[i]));
        }

        sc.close();
    }

    public static void main(String[] args){
            (new Main())._main(args);
    }
}
