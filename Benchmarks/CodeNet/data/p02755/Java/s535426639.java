// No sorceries shall prevail. //           
import java.util.*;
import java.io.*;
public class Main {
	
	static long gcd(long a, long b) { 
	      if (b == 0) 
	        return a; 
	      return gcd(b, a % b);  
	    }
	static int gcd(int a, int b) { 
	      if (b == 0) 
	        return a; 
	      return gcd(b, a % b);  
	    }
	
	static long mod = 1000000007;
	public static void main(String args[]) {
		Scanner inp=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		
		long a=inp.nextLong();
		long b=inp.nextLong();
		for(int i=1;i<=2000;i++) {
			double gg1=i*0.08;
			double gg2= i*0.1;
			if((int)gg1==a && (int)gg2==b) {
				System.out.println(i);
				return;
			}
		}
		out.println(-1);
		out.close();
		inp.close();
	}
}