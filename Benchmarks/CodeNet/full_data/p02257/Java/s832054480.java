import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int findCount = 0;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			if (isPrime(num)) {
				findCount++;
			}
		}
		System.out.println(findCount);
	}

	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		} else if (num == 2) {
			return true;
		} else if (num % 2 == 0) {
			return false;
		}

		double sqrtNum = Math.sqrt(num);
		for (int i = 3; i <= sqrtNum; i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}