import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=0;
        if(scan.hasNext())
            n=scan.nextInt();
        BigInteger[] arr=new BigInteger[n];
        for(int i=0;i<n;i++){
            String str="";
            if(scan.hasNext())
                str=scan.next();
            arr[i]=new BigInteger(str);
        }
        BigInteger lcm=lcm(arr);
        long l=Long.parseLong(String.valueOf(lcm));
        /*BigInteger p=new BigInteger("0");
        for(int i=0;i<n;i++){
            p= p.add((lcm.divide(arr[i])).mod(new BigInteger("1000000007")));
            p=p.mod(new BigInteger("1000000007"));
        }*/
        long p=0;
        for(int i=0;i<n;i++){
            int k=Integer.parseInt(String.valueOf(arr[i]));
            p+=((l/k)%1000000007);
            p=p%1000000007;
        }
        System.out.println(p);
    }
    static BigInteger gcd(BigInteger a, BigInteger b)
    {
        if (b.equals(new BigInteger("0")))
            return a;
        return gcd(b, a.mod(b));
    }

    static BigInteger lcm(BigInteger arr[])
    {
        BigInteger ans = arr[0];
        for (int i = 1; i < arr.length; i++)
            ans = (((arr[i].multiply(ans))).divide(
                    (gcd(arr[i], ans))));

        return ans;
    }
}
