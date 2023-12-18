import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        BigInteger power = new BigInteger("1");
        BigInteger check = new BigInteger("1000000007");
        power.remainder(check);
        for(int i=1; i<=n;i++)power =
                power.multiply(BigInteger.valueOf(i)).remainder(check);
        System.out.println(power);
    }
}
