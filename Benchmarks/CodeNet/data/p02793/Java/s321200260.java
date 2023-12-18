import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int v=sc.nextInt();
        int a[]=new int[v];
        BigInteger all=BigInteger.ONE;
        BigInteger m;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            m=all.gcd(BigInteger.valueOf(a[i]));
            all=all.multiply(BigInteger.valueOf(a[i])).divide(m);
        }
        BigInteger b=BigInteger.ZERO;
        BigInteger u=new BigInteger("1000000007");
        for(int i=0;i<a.length;i++){
            BigInteger c=all.divide(BigInteger.valueOf(a[i]));
            b=b.add(c);
            b=b.mod(u);
        }
        System.out.println(b);
    }
}
