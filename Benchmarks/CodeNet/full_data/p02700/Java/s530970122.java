

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int thp = sc.nextInt();
		int ta = sc.nextInt();
		int ahp = sc.nextInt();
		int aa = sc.nextInt();

		while (thp > 0) {
			ahp -= ta;
			if (ahp <= 0)
				break;
			thp -= aa;
		}
		if (thp <= 0)
			System.out.println("No");
		else
			System.out.println("Yes");
	}

}
