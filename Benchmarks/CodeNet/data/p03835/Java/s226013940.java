import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int s = in.nextInt();
		in.close();
		int ans = 0;
		for (int x = 0; x < k + 1; x++) {
			for (int y = 0; y < k + 1; y++) {
				for (int z = 0; z < k + 1; z++) {
					if (x + y + z == s) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);

	}
}