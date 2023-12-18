import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static long gcd(long m,long n){
        if(m<n)return gcd(n,m);
        if(n==0)return m;
        return gcd(n,m%n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long T[]=new long[N];
        for(int i=0;i<N;i++){
            T[i]=sc.nextLong();
        }
        Arrays.sort(T);
        long a=T[N-1];
        for(int i=N-2;i<=0;i--){
            a=(a*T[i])/gcd(a,T[i]);
        }
        System.out.println(a);
    }
}