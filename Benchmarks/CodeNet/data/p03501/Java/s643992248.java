import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int p1 = n * a;
		
		if (p1 < b) {
			System.out.println(Integer.toString(p1));
		} else {
			System.out.println(Integer.toString(b));
		}
		
	}

}
