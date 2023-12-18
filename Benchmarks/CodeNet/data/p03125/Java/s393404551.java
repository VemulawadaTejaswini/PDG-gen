import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		if (b % a == 0) 
			System.out.println(a + b);
		else 
			System.out.println(b - a);
	}
}