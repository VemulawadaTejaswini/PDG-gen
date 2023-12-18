import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        long h = stdIn.nextLong();
        long w = stdIn.nextLong();

        BigInteger hB = BigInteger.valueOf(h);
        BigInteger wB = BigInteger.valueOf(w);

        BigInteger one = BigInteger.valueOf(1);
        BigInteger two = BigInteger.valueOf(2);

        if(h%2!=0 && w%2!=0){
            System.out.println(hB.multiply(wB).add(one).divide(two));
        }else{
            System.out.println(hB.multiply(wB).divide(two));
        }
    }
}