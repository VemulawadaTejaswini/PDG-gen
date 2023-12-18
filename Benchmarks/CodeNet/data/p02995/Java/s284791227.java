import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
	    long B = sc.nextLong();
	    long C = sc.nextLong();
	    long D = sc.nextLong();
	    long CD = LCM(C,D);
	    
	    long count = 0;
	 
	    	long a_max = B/C;
	    	long a_min = A/C;
	    	long a_c=0;
	    	
	    	if (a_min==0) {
	    		a_c=a_max;
	    	}
	    	
	    	
	    	else if (A%C==0) {
	    		a_c=a_max-a_min+1;
	    	}
	    	
	    	else {
	    		a_c=a_max-a_min;
	    	}
	    		
	    	
	    	long b_max = B/D;
	    	long b_min = A/D;
	    	long b_c=0;
	    	
	    	if (b_min==0) {
	    		b_c=b_max;
	    	}
	    	
	    	
	    	else if (A%D==0) {
	    		b_c=b_max-b_min+1;
	    	}
	    	
	    	else {
	    		b_c=b_max-b_min;
	    	}
	    	
	    	long c_max = B/CD;
	    	long c_min = A/CD;
	    	long c_c=0;
	    	
	    	if (c_min==0) {
	    		c_c=c_max;
	    	}
	    	
	    	
	    	else if (A%CD==0) {
	    		c_c=c_max-c_min+1;
	    	}
	    	
	    	else {
	    		c_c=c_max-c_min;
	    	}
	    	
	    	count = a_c+b_c-c_c;
	    	
	    
	    System.out.println(B-A-count+1);
	}
	static public long GCF(long a, long b) {
	    if (b == 0) return a;
	    else return (GCF (b, a % b));
	}
	public static long LCM(long a, long b) { 
		return (a * b) / GCF(a, b); 
		}

	
}