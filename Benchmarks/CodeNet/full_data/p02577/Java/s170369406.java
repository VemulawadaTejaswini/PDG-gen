import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger sum=BigInteger.ZERO;
        BigInteger div = new BigInteger("10");
        BigInteger a = new BigInteger("9");
        while(!BigInteger.ZERO.equals(n)){
            sum = sum.add(n.mod(div));
            n = n.divide(div);
        }
        if(sum.mod(a).equals(BigInteger.ZERO)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}