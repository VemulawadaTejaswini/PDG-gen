import java.util.Scanner;
class Main {

	public void small() {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int b = sc.nextInt();

		if(a < b) {

			System.out.println("a < b");

		} else {

			if(a > b) {

				System.out.println("a > b");

			} else {

				System.out.println("a == b");

			}

		}

	}

	public static void main(String[] args) {

		new Main().small();

	}

}