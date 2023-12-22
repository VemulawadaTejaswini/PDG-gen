import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        var a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        boolean b = true;
        int[] spf = smallestPrimeFactor(1000000);
        var set = new HashSet<Integer>();
        label:for(int i = 0; i < n; i++){
            Set<Integer> set2 = primeFactorization(a[i], spf);
            for(Integer x : set2){
                if(!set.add(x)){
                    b = false;
                    break label;
                }
            }
        }
        
        if(b){
            System.out.println("pairwise coprime");
        }else{
            long gcd = gcd(a[0], a[1]);
            for(int i = 2; i < n; i++){
                gcd = gcd(gcd, a[i]);
            }
            if(gcd == 1){
                System.out.println("setwise coprime");
            }else{
                System.out.println("not coprime");
            }
        }
    }
    
    static Set<Integer> primeFactorization(int n, int[] spf){
        
        var set = new HashSet<Integer>();
        while(n != 1){
            set.add(spf[n]);
            n /= spf[n];
        }
        return set;
    }
    
    static int[] smallestPrimeFactor(int maxN){
        
        var spf = new int[maxN+1];
        for(int i = 1; i <= maxN; i++){
            spf[i] = i;
        }
        for(int i = 2; i*i <= maxN; i++){
            if(spf[i] < i) continue;
            for(int j = i*i; j <= maxN; j += i){
                if(spf[j] == j) spf[j] = i;
            }
        }
        return spf;
    }
    
    static long gcd(long a, long b){
        return b == 0 ? a : gcd(b, a%b);
    }
}