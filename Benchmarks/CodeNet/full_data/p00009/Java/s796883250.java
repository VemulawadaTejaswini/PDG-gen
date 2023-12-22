import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	private static int n;
	private static int cnt = 30;

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && cnt-- > 0) {
			int p_num = 0;
			n = Integer.parseInt(line);
			for (int i = 2; i <= n; i++) {
				boolean isPnum = true;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						isPnum = false;
						break;
					}
				}
				if (isPnum) {
					p_num++;
				}
			}
			System.out.println(p_num);
		}
	}
}