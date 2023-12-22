import java.util.Scanner;

public class Main {
	
	public static int gcd(int x, int y) {
		
		if(y == 0) {
			
			return x;
			
		} else {
			
			return gcd(y, x%y);
			
		}
		
	}
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		int result = gcd(x, y);
		System.out.println(result);
		
		in.close();

	}

}
