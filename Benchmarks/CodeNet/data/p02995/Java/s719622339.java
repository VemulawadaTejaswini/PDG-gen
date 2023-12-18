


import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long A=sc.nextLong(),B=sc.nextLong(),C=sc.nextLong(),D=sc.nextLong();
		long count=0;
	
		long temp=0;
		long countA = B/C-((A-1)/C);
		long countB = B/D-(A-1)/D;
		long countC=B/(C*D)-(A-1)/(C*D);
		
		
		
		count = B-A+1-(countA+countB-countC);
	
		
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
	
		
		
}
}
