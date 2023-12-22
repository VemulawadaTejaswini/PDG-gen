import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp;
		boolean inclued3 = false;

		for (int i = 1; i <= n; i++) {
			temp = i;
			while (true) {
				if (temp / 10 <= 10) {
					if (temp / 10 == 3 || temp % 10 == 3) {
						inclued3 = true;
					} else {
						inclued3 = false;
					}
					break;
				}
				temp = temp / 10;
			}
			if (i % 3 == 0 || inclued3) {
				System.out.print(" " + i);
			}

		}
		System.out.println();
	}

}