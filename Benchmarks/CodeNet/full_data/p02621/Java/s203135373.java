import java.util.Scanner;

public class Main {
	
	public static void main (String[] ags) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		scanner.close();
		
		int b = 2;
		int c = 3;
		
		System.out.println(a + (int) Math.pow(a, b) + (int) Math.pow(a, c));
	}

}
