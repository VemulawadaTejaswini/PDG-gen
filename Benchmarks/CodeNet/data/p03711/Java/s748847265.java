import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] a = { 0, 1, 2, 1, 3, 1, 3, 1, 1, 3, 1, 3, 1 };
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (a[x] == a[y])
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}
}