import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		int d = a / b;
		int r = a % b;
		float f = (float)a / (float)b;
		System.out.println(d+" "+r+" "+f);
	}
}