import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();

		int takahashiCount = 0;
		for (int i = 1 ; i <= month; i++) {
			for (int j = 1; j <= day; j++) {
				if (i == j) {
					takahashiCount++;
					break;
				}
			}
					}
		System.out.println(takahashiCount);
	}



}