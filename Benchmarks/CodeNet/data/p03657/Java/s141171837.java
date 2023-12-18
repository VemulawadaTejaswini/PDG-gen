import java.util.Scanner;

class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if ((a+b) % 3 == 0) {
			System.out.println("Possible");
		} else {
			System.out.println("Impossible");
		}
		sc.close();
	}

}
