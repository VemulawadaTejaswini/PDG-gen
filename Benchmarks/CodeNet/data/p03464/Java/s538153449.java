import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] a = new int[k];
        for(int i=0; i<k; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        
        BigInteger[] range = new BigInteger[2];
        range[0] = new BigInteger("2");
        range[1] = new BigInteger("3");


        for(int i=k-2; i>=0; i--){
            range = step(range, BigInteger.valueOf(a[i]));
            if(range[0].compareTo(BigInteger.valueOf(-1)) == 0){
                System.out.println("-1");
                return;
            }
        }
        
        System.out.println(range[0] + " " + range[1]);
    }

    public static BigInteger[] step(BigInteger[] range, BigInteger n){
        BigInteger[] ans = new BigInteger[2];
        ans[0] = new BigInteger("-1");
        ans[1] = new BigInteger("-1");
        BigInteger al = range[0].divide(n);
        BigInteger bl = range[0].mod(n);
        BigInteger ar = range[1].divide(n);
        BigInteger br = range[1].mod(n);

        if(ar.compareTo(al) == 0 && bl.compareTo(BigInteger.ZERO) != 0){
            return ans;
        }

        if(bl.compareTo(BigInteger.ZERO) == 0){
            ans[0] = range[0];
            ans[1] = ar.multiply(n).add(n).subtract(BigInteger.ONE);
        }else{
            ans[0] = al.multiply(n).add(n);
            ans[1] = ar.multiply(n).add(n).subtract(BigInteger.ONE);
        }

        return ans;
    }
}