import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		long x = sca.nextLong();
		long money = 100;
		int year = 1;
		boolean flag = false;

		do {
			money = money + (money/100);
			if(money >= x) {
				System.out.println(year);
				flag = true;
			}
			year++;
		} while(!flag);

		// 後始末
		sca.close();
	}
}