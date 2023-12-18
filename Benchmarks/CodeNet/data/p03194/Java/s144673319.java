import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] np = br.readLine().split(" ");
        long n = Long.parseLong(np[0]);
        long p = Long.parseLong(np[1]);
        //System.out.println(p);
        //System.out.println(Math.pow(8, (1.0/2)));
        if (n == 1) {
            System.out.println(p);
            return;
        }
        aaa(n, p);
        
        
        System.out.println(max);
    }
    static long max = 1;
    static long cand;
    
    static long aaa (long n, long p) {
        //System.out.println("ddd");
        if (n == 1) {
            //System.out.println("eee");
            cand = gcd(1, p);
            if (cand > max) {
                max = cand;
            }
            return p;
        }
        else {
            //System.out.println("ggg");
            for (int i = 1; i <= Math.pow(p, 1.0/n); i++) {
                //System.out.println("ccc");
                if (p % i == 0) {
                    //System.out.println("aaa");
                    cand = gcd(i, aaa(n-1, p/i));
                    if (cand > max) {
                        max = cand;
                    }
                }
                else {
                    //System.out.println("bbb");
                    continue;
                }
                //System.out.println(cand);
                
            }
            //System.out.println("fff");
            return 1;
        }
    }
    
    static long gcd (long a, long b) {
    	long temp;
    	while((temp = a%b)!=0) {
    		a = b;
    		b = temp;
    	}
    	return b;
    }
    
    
    
}
