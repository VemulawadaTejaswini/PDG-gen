


import java.io.*;
import java.util.*;
import java.math.BigInteger;





class Solution {
   
    public static void main(String[] args)
    {
        int days = 0;
        BigInteger x = new BigInteger("100");
        long n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        BigInteger N = BigInteger.valueOf(n);
        while(N.compareTo(x)==1)
        {
            x = x.multiply(BigInteger.valueOf(101));
            x = x.divide(BigInteger.valueOf(100));
            days++;
        }
        System.out.println(days);
    }
}
   
    