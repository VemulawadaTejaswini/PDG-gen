import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			double a = sc.nextDouble();
			int b = sc.nextInt();
			
			//calc range for a
			int minA = (int)Math.floor(a * 100 / 8);
			int maxA = (int)Math.ceil((a+1) * 100 / 8);
			
			int originB = b * 10;
			
			if ( minA <= originB && originB < maxA ) {
				System.out.println(originB);
			}
			else {
				System.out.println("-1");
			}
			
		}
	}
}