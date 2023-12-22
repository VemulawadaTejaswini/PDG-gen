import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		int nana = 0;
		int ans = -1;
		for (int i = 0; i < k; i++) {
			nana += Math.pow(10, i) * 7  % k;
			if (nana % k == 0) ans = i;
		}

		System.out.println(ans);


		sc.close();

	}

}