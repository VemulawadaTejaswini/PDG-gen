import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int r = (a + b) % 2;
		int ans = ((a + b) / 2) + r;
		sc.close();
		System.out.println(ans);
	}

}
