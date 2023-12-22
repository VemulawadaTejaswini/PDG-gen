import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.math.*;
import java.io.*;


public class Main {
    static long divCeil(long a, long b){
        return (a+b-1)/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();

        long digitSum = 0;
        for(int i=0; i<N.length(); i++) digitSum += (N.charAt(i)-'0');

        System.out.println(digitSum%9==0 ? "Yes" : "No");
        
    }
}
