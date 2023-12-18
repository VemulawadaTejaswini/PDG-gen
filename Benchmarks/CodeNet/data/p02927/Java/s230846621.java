
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();
		int day = s.nextInt();
		s.close();
		int d1 = 0;
//		int d10 = 0;
		int day10 = day / 10;
		int sum = 0;

		for (int i = 1; i <= month; i++) {
			//月ごとに処理する
			for (int j = 2; j <= day10; j++) {
				d1 = month / j;
				if ((day10* 10 +d1) < day && month%j ==0) {
					sum++;
				}
			}
		}
		System.out.println(sum);

	}

}
