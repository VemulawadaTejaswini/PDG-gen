import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main{



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int n        = Integer.parseInt(tmp[0]);
		long k       = Long.parseLong(tmp[1]);
		List<Long> lst = new ArrayList<>();
		long ans     = 0;
		primeFactor(k, lst);


		for(long a : lst) {


			if(a * n <= k) {

				ans = (int) Math.max(ans, a);
			}
		}

		System.out.println(ans);
	}
	private static void primeFactor(long num, List<Long> list) {


		//　素数だからi^2ね！
		for(long i = 2; i <= num / 2; i++) {

			if(num % i == 0) {

				list.add(i);
			}
		}

		list.add(num);
	}
}
