import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long money = scan.nextInt();
		int year = 0;
		for(int num = 100;num < money;num *= 1.01) {
			year += 1;
		}
		System.out.println(year);
		
		scan.close();
	}
}