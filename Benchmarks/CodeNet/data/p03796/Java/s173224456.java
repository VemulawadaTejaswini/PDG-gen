import java.io.InputStreamReader;
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in); 
        String n = scan.next();
        BigInteger N = new BigInteger(n);
        long c = Long.parseLong(n);
        BigInteger one = new BigInteger("1");
        BigInteger x = new BigInteger("1");
        while(c > 0){
            x = x.multiply(N);
            N = N.subtract(one);
            c = c - 1;
        }
        BigInteger num = new BigInteger("1000000007");
        BigInteger y = x.remainder(num);
        System.out.println(y);
    }
}