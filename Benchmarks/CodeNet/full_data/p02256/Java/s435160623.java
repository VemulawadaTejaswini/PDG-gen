import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        System.out.println(gcd(a, b));
    }   
    
    static int gcd(int x, int y) {
        while (x > 0 && y > 0) {
            if (x > y) x %= y; else y %= x;
        }
        return x + y;
    }
}