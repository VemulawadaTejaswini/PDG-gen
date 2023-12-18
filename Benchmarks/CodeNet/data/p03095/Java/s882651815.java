import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.valueOf(scan.nextLine()).intValue();
		String[] strs = scan.nextLine().split("");
	
		int cnt = n;
		for (int i = 0; i < n; i++) {
			String tmp = strs[i];
			for (int j = i + 1; j < n; j++) {
				tmp = tmp + strs[j];
				
				String[] tmpSplits = tmp.split("");
				Arrays.sort(tmpSplits);
				String bef = "";
				boolean flg = true;
				for (String tmpSplit : tmpSplits) {
					if (bef.equals(tmpSplit)) {
						break;
					}
				}
				
				if (flg) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt % ((10 * 9) + 7));
	}
}
