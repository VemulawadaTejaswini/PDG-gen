
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		long ans = M / N;
		while(true) {
			long res = M - N * ans;
			if(res % ans == 0) {
				break;
			}
			ans--;
		}
		System.out.println(ans);
	}

}
