import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ka = a + b;
		int gen = a - b;
		int jo = a * b;
		int [] vls = {ka, gen, jo};
		int ans = vls[0];
		for (int i = 1; i < 3; i++ ) {
			ans = Math.max(ans, vls[i]);
		}
		System.out.println(ans);
	}
}
