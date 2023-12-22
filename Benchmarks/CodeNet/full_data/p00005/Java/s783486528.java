import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(new BufferedInputStream(System.in));
		int a,b,c;
		while(cin.hasNext()) {
			a = cin.nextInt();
			b = cin.nextInt();
			c= GCD(a,b);
			System.out.printf("%d %d", c, a / c * b);
		}
		cin.close();
	}
	
	private static int GCD(int a, int b) {
		int c;
		while(a != b) {
			if(a < b) {
				c = a;
				a = b - a;
				b = c;
			} else {
				c = b;
				b = a - b;
				a = c;
			}
		}
		return a;
	}
}