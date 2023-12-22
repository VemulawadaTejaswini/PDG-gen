/*
 * @author Raj Sharma
 * Date 20160306
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        long a,b;
 
 
        while((str=br.readLine()) != null){
            a = Long.parseLong(str.substring(0, str.indexOf(" ")));
            b = Long.parseLong(str.substring(str.indexOf(" ")+1, str.length()));
 
            System.out.println(gcd(a, b) + " " + lcm(a,b));
 
        }
    }
 
    static long gcd(long a,long b){
        return b == 0 ? a : gcd(b,a%b);
    }
 
    static long lcm(long a, long b){
        return b*a/gcd(a,b);
    }
}