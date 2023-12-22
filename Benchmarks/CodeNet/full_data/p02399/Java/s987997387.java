import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String delimeter = " ";
		int a = sc.nextInt();
		int b = sc.nextInt();

		int d = a / b;
		int r = a % b;
		float f = (float)a / b;

		System.out.println(d + delimeter + r + delimeter + f);
	}	
}