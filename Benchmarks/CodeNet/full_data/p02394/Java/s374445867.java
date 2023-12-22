import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		int w = scan.nextInt();
		int h = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();

		double rHalf = r / 2.0;
		
		double x1 = x - rHalf;
		double x2 = x + rHalf;
		double y1 = y - rHalf;
		double y2 = y + rHalf;

		if (0 <= y1 && y2 <= h && 0 <= x1 && x2 <= w) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
			
		scan.close();

	}

}