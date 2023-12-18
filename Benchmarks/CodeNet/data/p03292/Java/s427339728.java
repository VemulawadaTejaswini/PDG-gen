mport java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		sc.close();

		int min = Math.min(Math.min(a1, a2), a3);
		int max = Math.max(Math.max(a1, a2), a3);
		System.out.println(max - min);
	}
}
