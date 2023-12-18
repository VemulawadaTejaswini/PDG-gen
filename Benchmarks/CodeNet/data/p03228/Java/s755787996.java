import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int taka = sc.nextInt();
		int aoki = sc.nextInt();
		int times = sc.nextInt();

		System.out.println(times);

		for (int i = 0; i < times; i++) {
			if (i % 2 == 0) {
				if ((taka % 2) != 0) {
					taka--;
				}
				int give = taka / 2;
				taka -= give;
				aoki += give;

				System.out.println("\ntaka" + taka);
				System.out.println("aoki" + aoki);

			} else {

				if ((aoki % 2) != 0) {
					aoki--;
				}
				int give = aoki / 2;
				aoki -= give;
				taka += give;

				System.out.println("\ntaka" + taka);
				System.out.println("aoki" + aoki);
			}
		}
		System.out.println(aoki+" "+taka);

	}
}