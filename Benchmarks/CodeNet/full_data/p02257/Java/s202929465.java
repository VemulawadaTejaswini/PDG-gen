import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int primeCnt = 0;
		for (int i = 0; i < n; i++) {
			if (checkPrimeNumber(Integer.parseInt(br.readLine()))) primeCnt++;
		}
		System.out.println(primeCnt);
	}

	public static boolean checkPrimeNumber(int target) {
		if (target < 2) return false;
		if (target == 2) return true;
		if (target % 2 == 0) return false;

		for (int i = 3; i <= Math.sqrt(target); i++) {
			if (target % i == 0) return false;
		}
		return true;
	}
}