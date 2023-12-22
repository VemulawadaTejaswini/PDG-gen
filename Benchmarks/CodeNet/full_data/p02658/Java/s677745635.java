
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int N = scanner.nextInt();
		long ans = 1;
		long max = (long)Math.pow(10, 18);

		for(int i = 0 ; i < N ; i++) {
			long a = scanner.nextLong();
			if(a == 0) {
				ans = 0;
				break;
			}
			if(max / ans >= a) {
				ans *= a;
			}else {
				ans = -1;
			}

		}

		System.out.println(ans);

		scanner.close();

	}

}
