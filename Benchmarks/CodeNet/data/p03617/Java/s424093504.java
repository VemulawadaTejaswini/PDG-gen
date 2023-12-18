import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long n = sc.nextLong();
		
		b = Math.min(b,2*a);
		c = Math.min(c,2*b);
		
		if (2*c <= d) {System.out.println(n*c);}
		else {
			long d_num = n/2;
			long c_num = 0;
			if (n%2==1) {c_num++;}
			System.out.println(c_num*c+d_num*d);
		}
	}
