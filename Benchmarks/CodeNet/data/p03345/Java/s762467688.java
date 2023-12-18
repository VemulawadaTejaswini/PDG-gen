public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		long takahashi = scanner.nextLong();
		long nakahashi = scanner.nextLong();
		long hikuhashi = scanner.nextLong();

		long k = scanner.nextLong();

		System.out.println((k%2==1)?nakahashi-takahashi:takahashi-nakahashi);
		scanner.close();
	}

}
