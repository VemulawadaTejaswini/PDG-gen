import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		double d = Double.parseDouble(sc.next());
		double t = Double.parseDouble(sc.next());
		double s = Double.parseDouble(sc.next());
		
		double result = (d/t) ;
		if (result <= s ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
			
		}
	}	

}
