import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static char[] array = new char[13];

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		try {
			while ((line = br.readLine()) != null) {
				line = line.trim();
				array = line.toCharArray();
				int[] numCount = new int[10];
				for (int i = 0; i < array.length; i++) {
					numCount[array[i] - '0']++;
				}
				String ans = "0";
				for (int i = 1; i <= 9; i++) {
					if (numCount[i] == 4)
						continue;
					searchHead: for (int j = 1; j <= 9; j++) {
						int[] num = numCount.clone();
						num[i]++;
						if (num[j] - 2 < 0)
							continue;
						num[j] -= 2;
						// 順子チェック
						for (int k = 1; k <= 7; k++) {
							if (num[k] < 0)
								continue searchHead;
							int surplus = num[k] % 3;
							if (surplus != 0) {
								num[k] -= surplus;
								num[k + 1] -= surplus;
								num[k + 2] -= surplus;
							}
						}
						// 8と9は0か3
						if (((num[8] % 3) + (num[9] % 3)) == 0 && num[8] >= 0 && num[9] >= 0) {
							if (ans.equals("0")) {
								ans = Integer.toString(i);
							} else {
								ans += " " + Integer.toString(i);
							}
							break searchHead;
						}
					}
				}
				System.out.println(ans);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}