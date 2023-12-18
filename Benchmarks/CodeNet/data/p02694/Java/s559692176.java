//b_1_percent
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long yen_at_bank = 100;
		int year = 0;
		
		
		while(true) {
			year++;
			yen_at_bank = yen_at_bank + yen_at_bank / 100;
			if(yen_at_bank >= x) {
				System.out.println(year);
				return;
			}
		}
	}
}