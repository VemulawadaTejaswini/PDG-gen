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
        long t[]=new long[N];
        long T[]=new long[N];
        int count=1;
        int c=0;
        for(int i=0;i<N;i++){
            t[i]=sc.nextLong();
        }
        Arrays.sort(t);
        for(int i=0;i<N-1;i++){
            if(t[N-1]%t[i]!=0){
                count++;
                T[c]=t[i];
                c++;
            }
        }
        T[c]=t[N-1];
        long a=T[c];
        for(int i=c-1;i>=0;i--){
            a=(a*T[i])/gcd(a,T[i]);
        }
        System.out.println(a);
    }
}