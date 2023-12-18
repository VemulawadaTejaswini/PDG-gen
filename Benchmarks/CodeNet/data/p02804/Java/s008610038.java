import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int p = (int)Math.pow(10,9)+7;
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n];
        long max = 0;
        long min = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        //Σmax
        for(int i = k; i <= n; i++){
            max += nCk(i-1,k-1,p)*a[i-1];
            max %= p;
        }
        //Σmin
        for(int i = k; i <= n; i++){
            min += nCk(i-1,k-1,p)*a[n-i];
            min %= p;
        }
        if(max-min >= 0){
            System.out.println((max-min)%p);
        }else{
            System.out.println((max-min+p)%p);
        }
    }
    
    //return nCk mod M (M must be prime number) O(min(k,n-k)*logM)
    public static long nCk(int n,int k, int M) {
        long ret = 1;
        int min = Math.min(k, n-k);
        for(int i=1;i<=min;i++) {
            ret = (ret * pow(i,M-2,M)) % M;
        }
        for(int i=n-min+1;i<=n;i++) {
            ret = (ret * i) % M;
        }
        return ret;
    }
    
        //return a^b mod M O(logB)
    public static long pow(long a,long b,int M) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1){
                ret = (ret * tmp) % M;
            }
            tmp = (tmp * tmp) % M;
            b = b>>1;
        }
        return ret;
    }
}