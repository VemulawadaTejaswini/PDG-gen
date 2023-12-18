import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		br.close();

		boolean flg = false;
		for (int i = 2; i < 18; i++) {
			int a = 1 << i;
			if (n + 1 == a) {
				flg = true;
				break;
			}
		}
		if (!flg) {
			System.out.println("No");
			return;
		}

		int n2 = n * 2;
		for (int i = 1; i < n2; i++) {
			System.out.println(i + " " + (i + 1));
		}
	}
}
