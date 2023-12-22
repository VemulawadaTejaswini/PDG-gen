import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	static int counter;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			counter = 0;
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			
			if(a == 0 && b == 0) {
				break;
			}
			if(a < b) {
				int tmp = a;
				a = b;
				b = tmp;
			}
			
			int gcd = ua(a,b);
			
			System.out.println(gcd + " " + counter);
		}
	}
	
	public static int ua(int a, int b) {
		if(b == 0) return a;
		counter++;
		return ua(b,a%b);
	}
}