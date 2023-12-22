import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		//??????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = br.readLine()) != null) {
			int num = Integer.parseInt(str);
			int count =0;
			for (int i = 2; i <= num; i++) {
				count = count + judge(i);
			}
			System.out.println(count);
		}
	}

	static int judge (int n) {
		int m = (int)Math.sqrt(n);
		for (int i = 2; i < m + 1; i++) {
			if (n % i == 0) return 0;
		}
		return 1;
	}

}