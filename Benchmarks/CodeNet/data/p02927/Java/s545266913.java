import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();
		int day = s.nextInt();
		s.close();
		int d1 = 0;
		int day10 = day / 10;
		int sum = 0;

		for (int i = 2; i <= month; i++) {
			//月ごとに処理する
			for (int j = 2; j <= day10; j++) {
				d1 = i / j;
				if ((j * 10 +d1) < day && i % j ==0 && d1!=1) {
					sum++;
				}
			}
		}
		System.out.println(sum);

	}

}
