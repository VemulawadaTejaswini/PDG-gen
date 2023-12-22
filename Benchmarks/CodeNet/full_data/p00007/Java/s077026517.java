import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int principal = 100000;
		final float interest = 0.05f;
		int debtBal = principal;
		
		Scanner scan = new Scanner(System.in);
		int week = scan.nextInt();
		
		for(int i = 1; i <= week; i++) {
			debtBal += debtBal * interest;
			debtBal = (int)Math.ceil((double)debtBal / 1000);
			debtBal *= 1000;
		}
		
		System.out.println(debtBal);
	}
}