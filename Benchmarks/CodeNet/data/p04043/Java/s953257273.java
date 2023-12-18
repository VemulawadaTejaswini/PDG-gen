package score100;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a == b && b== 5 && c == 7 || b == c && c== 5 && a == 7|| c == a && a== 5 && b == 7){

				System.out.println("YES");

		}
			else {
				System.out.println("NO");
			}
	}
}
