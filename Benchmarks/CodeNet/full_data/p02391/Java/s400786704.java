import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		String result = " == ";
		
		if (a < b) {
			result = " < ";
		} else if (a > b) {
			result = " > ";
		}
		
		System.out.println("a" + result + "b");
	}
}