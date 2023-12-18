import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static LinkedList<Integer> divisors(int M){
    	LinkedList<Integer> d = new LinkedList<>();
    	for(int m= (int)(1+Math.sqrt(M)); m>0;m--){
    		if(m*m==M) d.add(m);
    		else if(M%m==0){
    			d.addFirst(M/m);
    			d.addLast(m);
    		}
    	}
    	return d;
    }
    public static long gcd(long a, long b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        LinkedList<Integer> d = divisors(M);
        for(int m:d){
        	if(M/m>=N){
        		System.out.println(m);
        		break;
        	}
        }
    }
}
