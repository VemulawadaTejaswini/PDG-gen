import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n % 2 != 0 || n < 10){
            System.out.println(0);
            return;
        }
        long ans = 0;
        int digit = (int)(Math.log10(n))+1;
        int i=0;
        while(10*Math.pow(5,i) <= n){
            long def = 10*(long)Math.pow(5,i);
            ans += n/def;
            i++;
        }
        System.out.println(ans);
    }
}

