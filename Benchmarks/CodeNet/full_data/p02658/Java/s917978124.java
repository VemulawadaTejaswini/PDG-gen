import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        BigInteger total = new BigInteger("1");
        for (int i = 0; i < n; i++) {
            BigInteger a = new BigInteger(sc.next());
            total = total.multiply(a);
        }
        if (total.toString().length() >= 19) {
            System.out.println("-1");
        }
        else {
            System.out.println(total);
        }
       
    }
}
