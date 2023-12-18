import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();

		if (k == 4 || k == 6 || k == 9 || k == 10 || k == 14 || k == 21 || k == 22 || k == 25 || k == 26) {
			print(2);
		} else if (k == 8 || k == 12 || k == 18 || k == 20 || k == 27) {
			print(5);
		} else if (k == 16) {
			print(14);
		} else if (k == 24) {
			print(15);
		} else if (k == 28 || k == 30) {
			print(4);
		} else if (k == 32) {
			print(51);
		} else {
			print(1);
		}
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
