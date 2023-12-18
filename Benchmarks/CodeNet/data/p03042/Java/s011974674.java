import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		try (Scanner sc = new Scanner(System.in)){
			String s = sc.next();
			int a = Integer.parseInt(s.substring(0,2));
			int b = Integer.parseInt(s.substring(2));
			
			if ((a == 0 && b == 0) || (a == 0 && b > 12) || (a > 12 && b == 0) || (a > 12 && b > 12)) {
				System.out.println("NA");
			}
			else if ((1 <= a && a <= 12 && b > 12) || (a > 12 && 1 <= b && b <= 12)) {
				System.out.println("YYMM");
			}
			else if ((1 <= a && a <= 12 && b == 0) || (a == 0 && 1 <= b && b <= 12)) {
				System.out.println("MMYY");
			}
			else if ((1 <= a && a <= 12 && 1 <= b && b <= 12) || (1 <= a && a <= 12 && 1 <= b && b <= 12)) {
				System.out.println("AMBIGUOUS");
			}
		}
	}
}
