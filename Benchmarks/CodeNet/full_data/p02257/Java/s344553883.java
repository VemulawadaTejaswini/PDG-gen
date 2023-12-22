import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int res = 0;
        for (int i = 0; i < n; ++i) {
            int x = input.nextInt();
            if (isPrime(x)) ++res;
        }
        System.out.println(res);
    }       
    
    static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i <= Math.sqrt(x); ++i) {
            if (x % i == 0) return false;
        }
        return true;
    }
}