import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		rectangle();

	}
	
	public static void rectangle() {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a * b + " " + (a + b) * 2);
	}
}
