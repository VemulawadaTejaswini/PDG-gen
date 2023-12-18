import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int add = a + b;
		int minus = a - b;
		int multi = a*b;
		
		int max = Math.max(add, minus);
		max = Math.max(max, multi);
		
		System.out.println(max);
	}
}
