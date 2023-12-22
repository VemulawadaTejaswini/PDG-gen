import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int count = 0;
			int I, J, K;

			if(n == 0 && x == 0) {
				break;
			}

			for(int i = 1; i <= Math.min(x-3, n); i++) {
				for(int j = 1; j <= Math.min(x-3, n); j++) {
					int k = x - i - j;

					if( (i != j && i != k && j!= k)
						&& (k >= 1 && k <= n)
							) {
						count++;
					}
				}
			}

			System.out.println(count/6);
		}
	}
}

