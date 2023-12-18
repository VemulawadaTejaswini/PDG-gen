public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int x = a / 100;
		int y = (a - x * 100) / 10;
		int z = (a - x * 100 - y * 10);

		if(x == z) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

		System.out.println("test");

		sc.close();

	}

}
