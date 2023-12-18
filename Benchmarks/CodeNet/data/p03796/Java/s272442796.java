import java.util.*;
import java.util.Arrays;
import java.lang.Math; 
import java.math.BigInteger;

public class B055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigInteger sum = BigInteger.ONE;
        BigInteger kekka = BigInteger.ZERO;

        for(int i = 1 ; i <= N; i++){
            sum = sum.multiply(new BigInteger(String.valueOf(i)));
        }
        int b = 1000000007;
        kekka = sum.remainder(BigInteger.valueOf(b));

        System.out.println(kekka);
    }
}