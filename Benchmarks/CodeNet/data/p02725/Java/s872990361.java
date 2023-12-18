import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();

		int saisyo = 0;
		int saigo = 0;
		int hozon = 0;
		int hanbun = k / 2;

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();

			if (i == 0) {
				saisyo = a;
			}
			if (i == n - 1) {
				saigo = a;
			}
			if (a - hozon >= hanbun) {
				saisyo = hozon;
				saigo = a;

				break;
			}
			hozon = a;
		}

		System.out.println(saigo - saisyo);

		sc.close();
	}

}