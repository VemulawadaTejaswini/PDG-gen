import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int quantidade = input.nextInt();
		input.close();
		
		int n500 = quantidade / 500;
		quantidade %= 500;
		int n100 = quantidade / 100;
		quantidade %= 100;
		int n50 = quantidade / 50;
		quantidade %= 50;
		int n10 = quantidade / 10;
		quantidade %= 10;
		int n5 = quantidade / 5;
		
		if(n10 > 0) {
			n5 += n10 * 2;
		}
		
		if(n50 > 0) {
			n5 += n50 * 10;
		}
		
		if(n100 > 0) {
			n5 += n100 * 20;
		}
		
		System.out.println((n500 * 1000) + (n5 * 5));
		
	}
}