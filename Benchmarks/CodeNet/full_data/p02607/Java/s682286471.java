import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n        = Integer.parseInt(scanner.nextLine());
		String[] tmp = scanner.nextLine().split(" ");
		int ans      = 0;

		for(int i = 0; i < n; i++) {

			if((i + 1) % 2 == 1) {
				if(Integer.parseInt(tmp[i]) % 2 == 1) {
					ans++;
				}
			}
		}

		System.out.println(ans);
	}
}
