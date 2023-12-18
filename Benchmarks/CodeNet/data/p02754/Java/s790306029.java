import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger N = BigInteger.valueOf(Long.parseLong(sc.next()));
        BigInteger A = BigInteger.valueOf(Long.parseLong(sc.next()));
        BigInteger B = BigInteger.valueOf(Long.parseLong(sc.next()));
        if((A.add(B)).equals(N)){
            System.out.println(A);
        }else{
            System.out.println(N.subtract(B));
        }
    }
}