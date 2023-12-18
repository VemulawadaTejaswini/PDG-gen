import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = {0, 1, 3, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1};
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println(a[x] == a[y] ? "Yes" : "No");
	}
}

