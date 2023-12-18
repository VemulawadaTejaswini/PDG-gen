import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total_grid = sc.nextInt();
		int Alice_place = sc.nextInt();
		int Borys_place = sc.nextInt();


		while (Alice_place>=1 && Borys_place<= total_grid) {
			if (Borys_place != Alice_place + 1) {
				Alice_place ++;
			}
			else {
				Alice_place --;
			}

			if (Alice_place != Borys_place - 1) {
				Borys_place --;
			}
			else {
				Borys_place ++;
			}
		}

		if (Alice_place <1) {
				System.out.println("Borys");
		}
		else {
			System.out.println("Alice");
		}

	}
}