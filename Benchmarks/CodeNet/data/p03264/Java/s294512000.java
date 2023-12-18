mport java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();

		int k2 = k / 2;
		System.out.println(k2 * (k - k2));
	}
}
