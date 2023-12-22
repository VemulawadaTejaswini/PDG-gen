import java.util.Scanner;

public class Main {
	
	public static int gcd(int x, int y) {
		if(y == 0) {
			return x;
		}
		return gcd(y, x%y);
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int x = Integer.parseInt(in.next());
		int y = Integer.parseInt(in.next());
		
		System.out.println(gcd(x,y));
		
		in.close();
	}
}


