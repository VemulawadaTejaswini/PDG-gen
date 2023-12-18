//b_1_percent
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long yen_at_bank = 100;
		int year = 0;
		//System.out.println("debug: init: yen_at_bank: " + yen_at_bank + " year: " + year);
		while(true) {
			year++;
			double multi_per = 1.01;
			yen_at_bank = (int)(multi_per * yen_at_bank);
			//System.out.print("#");
			//System.out.println("debug: tmp: "+tmp+" yen_at_bank: " + yen_at_bank + " year: " + year);
			if(yen_at_bank >= x) {
				System.out.println(year);
				return;
			}
		}
	}
}