import java.util.*;
import java.io.*;

public class Main {
    public static long divNum(long a, long x){
        return 1 + a/x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        System.out.println(divNum(b,x)-divNum(a-1,x));
    }
}