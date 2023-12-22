import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int tc = scan.nextInt();
		int rd = 1;
		while(scan.hasNextInt()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int lcd = 0;
			int gcd = 0;
			lcd = LCD(a, b);
			gcd = GCD(a, b);
			System.out.println(lcd + " " + gcd);
		}
	}
	public static int LCD(int a, int b) {
		int z = Integer.min(a, b);
		
		for(int i = z; i >= 1; i--) {
			if(a%i == 0 && b%i == 0)
				return i;
		}
		return 1;
	}
	
	public static int GCD(int a, int b) {
		int c = a;
		int d = b;
		while(a != b) {
			if(a < b)
				a+=c;
			else
				b+=d;
		}
		return a;
	}
}