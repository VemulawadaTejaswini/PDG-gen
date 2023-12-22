import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final int m = 998244353;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long t = n,rem=0,a=0,b=0;
        do {
            double r = (-1 + Math.sqrt(1 + 4 * (2 * t))) / 2;
            a = (long) Math.ceil(r);
            b = (a * (a + 1)) / 2;
            rem = b%n;
            t = b+(n-rem);
        }while(rem>0);
        System.out.println(a);

    }
}
