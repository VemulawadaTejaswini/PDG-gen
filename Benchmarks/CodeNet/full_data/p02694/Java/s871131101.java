
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger a=BigInteger.valueOf(100);
        BigInteger x=sc.nextBigInteger();
        int count=0;
        while (a.compareTo(x)<0){
            a= a.add(a.divide(BigInteger.valueOf(100)));
            count++;
        }
        System.out.println(count);
    }
}
