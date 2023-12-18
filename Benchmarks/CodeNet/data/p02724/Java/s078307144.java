import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int quantidade = input.nextInt();
		input.close();
		
		int n500 = quantidade / 500;
		quantidade %= 500;
		quantidade %= 100;
		quantidade %= 50;
		int n5 = quantidade / 5;
		
		System.out.println((n500 * 1000) + (n5 * 5));
		
	}
}