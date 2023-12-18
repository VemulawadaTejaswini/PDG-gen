import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int k = scan.nextInt();
        
        System.out.println(reminder(n,0,k,k+1));
    }
    
    private static long reminder(int n, long val, int k, int cur){
        if(cur > n) return val;
        if(k == 0) return n*n;
        
        while(cur <= n){
            int volume = cur - k;
            int cycle = n/cur;
            val += cycle * volume;
        
            int rest = n % cur;
            val += rest - k >= 0 ? rest - k + 1 : 0;
            
            cur++;
        }
        
        return val;
    }
}
