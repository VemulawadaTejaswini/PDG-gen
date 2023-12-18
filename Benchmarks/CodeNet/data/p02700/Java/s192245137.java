import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Thp = sc.nextInt();
		int Tatk = sc.nextInt();

		int Ahp = sc.nextInt();
		int Aatk = sc.nextInt();

		int counter = 1;
		while (0 < Thp && 0 < Ahp) {
			if (counter % 2 == 1) {
				Ahp -= Tatk;
			} else {
				Thp -= Aatk;
			}
			counter++;
		}
		if (Thp < Ahp) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

	}

}