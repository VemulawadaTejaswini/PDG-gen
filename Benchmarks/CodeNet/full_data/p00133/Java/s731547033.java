import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char a[][] = new char[8][8];

		for (int i = 0; i < 8; i++) {
			String s = sc.next();
			for (int j = 0; j < 8; j++) {
				a[i][j] = s.charAt(j);
			}
		}

		System.out.println("90");
		for (int j = 0; j < 8; j++) {
			for (int i = 7; 0 <= i; i--) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("180");
		for (int i = 7; 0 <= i; i--) {
			for (int j = 7; 0 <= j; j--) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("270");
		for (int j = 7; 0 <= j; j--) {
			for (int i = 0; i < 8; i++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}