//扫雷
import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        BigInteger a=sc.nextBigInteger();
        BigInteger n=new BigInteger("9");
        if((a.mod(n)).compareTo(BigInteger.ZERO)==0)
            System.out.println("Yes");
        else System.out.println("No");
    }
}

