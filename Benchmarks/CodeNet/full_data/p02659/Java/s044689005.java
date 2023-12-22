//package Contest169;


import java.util.*;
import java.io.*;
import java.math.*;


class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Start here:
        Scanner sc =new Scanner(System.in);
        
        long a=sc.nextLong();
        double b=sc.nextDouble();
        
        long c=(long) ((long)a*b);
        
        System.out.println((long)Math.floor(c));

    }
}