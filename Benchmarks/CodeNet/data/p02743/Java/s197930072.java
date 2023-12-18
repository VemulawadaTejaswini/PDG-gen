import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        BigInteger ab4 = new BigInteger(Long.toString(a)).multiply(new BigInteger(Long.toString(b))).multiply(new BigInteger("4"));
        BigInteger cab = new BigInteger((c-a-b)+"").multiply(new BigInteger((c-a-b)+""));
        if (ab4.compareTo(cab)<0)System.out.println("Yes");
        else System.out.println("No");
    }
}
