import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n   = Integer.parseInt(scanner.nextLine());
		String[] ctemp = scanner.nextLine().split(" ");
		String[] htemp = scanner.nextLine().split(" ");
		int[] city = new int[n + 1];
		int[] hero = new int[n];

		int ans = 0;

		for(int i = 0; i < n; i++) {

			city[i] = Integer.parseInt(ctemp[i]);
			hero[i]     = Integer.parseInt(htemp[i]);
		}

		city[n] = Integer.parseInt(ctemp[n]);

		for(int i = n - 1; i >= 0; i--) {

			int a = city[i + 1] + city[i] - hero[i];
			int b = city[i + 1] - hero[i];

			if(b > 0) {

				ans += hero[i];

			}else if(a > 0) {

				city[i] = a;
				ans    += hero[i];

			}else{

				ans    += city[i] + city[i + 1];
				city[i] = 0;

			}

		}

		System.out.println(ans);

	}
}