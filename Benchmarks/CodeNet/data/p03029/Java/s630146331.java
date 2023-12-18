import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int apple = sc.nextInt();
		int hahen= sc.nextInt();
		sc.close();

		System.out.println((apple * 3 + hahen)/2);
	}
}