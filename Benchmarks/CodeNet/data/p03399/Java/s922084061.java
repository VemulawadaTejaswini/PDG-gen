import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int days = scan.nextInt();
		int remain = scan.nextInt();

		int eatdays = 0;
		int[] day = new int[num];

		for (int n=0; n<num; n++) {
			day[n] = scan.nextInt();

		}

		for (int n=0; n<num; n++) {
			int amari = days%day[n];
			if (amari == 0) {
				eatdays += days/day[n];
			} else {
				eatdays += days/day[n] + 1;
			}

		}

		System.out.println(eatdays + remain);

		scan.close();

	}

}
