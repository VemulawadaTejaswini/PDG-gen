import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = sc.nextInt();

		int scope = d * 2 + 1;
		int num = n % scope == 0 ? n / scope : n / scope + 1;

		System.out.println(num);

		sc.close();
	}

}
