import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static long combination(int n,int k){
        if(n==0)
            return 0;
        if(k==0)
            return 1;
        else
            return combination(n,k-1)*(n-k+1)/k;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[201001];
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[a[i]]++;
        }
        long m=0;
        for(int i=0;i<b.length;i++) {
            m += Main.combination(b[i],2);
        }
        for(int i=0;i<n;i++){
            long v=m-Main.combination(b[a[i]],2)+Main.combination(b[a[i]]-1,2);
            System.out.println(v);

        }

    }
}