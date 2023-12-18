import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static long gcd(long a, long b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    public static long lcm(long a, long b){
        return (a/gcd(a,b))*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		String S = sc.next();
		String T = sc.next();
		long L = lcm(M,N);
		
		boolean ok = true;
		for(int n=0;n<N;n++){
			long l = L/N * n;
			if(l%(L/M)!=0) continue;
			int m = (int) (l/(L/M));
			//System.out.println(l+" "+S.charAt(n)+" "+T.charAt(m));
			if(S.charAt(n)!=T.charAt(m)) ok = false;
		}
		System.out.println(ok ? L : -1);
		
    }
}
