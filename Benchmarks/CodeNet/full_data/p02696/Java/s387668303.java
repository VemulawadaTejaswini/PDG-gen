import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		long b = scan.nextLong();
		long n = scan.nextLong();
		
		if(n<b) {
			double x = Math.floor(a*n/b)-5* Math.floor(n/b);
			System.out.println((int)x);
			
		}else {
			long y = b-1;
			double x = Math.floor(a*y/b)-5* Math.floor(y/b);
			System.out.println((int)x);
		}
		
	}	
	
	
	//最小公約数
	/*
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
	*/
	
}