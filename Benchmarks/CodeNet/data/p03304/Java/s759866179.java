import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        
        double beautypos;
        if (d==0) beautypos = 1.0 * (n-d)/(n*n);
        else beautypos = 2.0*(n-d)/(n*n);
        System.out.println((m-1) * beautypos);
    }
}