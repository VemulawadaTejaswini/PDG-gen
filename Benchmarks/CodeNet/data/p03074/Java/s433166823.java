
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		String str = scn.next();
		ArrayList<Integer> al = new ArrayList<>();
		int cnt = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				cnt++;
			} else {
				al.add(cnt);
				cnt = 1;
			}
		}
		al.add(cnt);
		long[] sum = new long[al.size()];
		for (int j = 0; j < al.size(); j++) {
			if (j > 0) {
				sum[j] += sum[j - 1] + al.get(j);
			} else {
				sum[j] = al.get(j);
			}
		}
//		for(int j=0;j<sum.length;j++) {
//			System.out.print(sum[j]+" ll");
//		}
		n = al.size() / 2;
		if (str.charAt(0) == '0' && al.size() % 2 != 0)
			n++;
		if (k >= n) {
			System.out.println(sum[al.size() - 1]);
		} else {
			long max = Long.MIN_VALUE;
			for (int j = str.charAt(0) == '0' ? 0 : 1; j < al.size(); j += 2) {
				int x = j + (k - 1) * 2;
				//System.out.println(x);
				if (x < al.size() && sum[x + 1 < al.size() ? x + 1 : x] - ((j - 2) >= 0 ? sum[j - 2] : 0) > max) {
		
					max = sum[x + 1 < al.size() ? x + 1 : x] -((j - 2) >= 0 ? sum[j - 2] : 0);
					//System.out.println(max+" mmm");
				} else if (sum[j + ((al.size() - j - 1) / 2 - 1) * 2 + ((1 < al.size()) ? 1 : 0)]
						- ((j - 2) >= 0 ? sum[j - 2] : 0) > max) {
					max = sum[j + ((al.size() - j - 1) / 2 - 1) * 2 + ((1 < al.size()) ? 1 : 0)]
							- ((j - 2) >= 0 ? sum[j - 2] : 0);
				}
			}
			System.out.println(max);
		}
	}

}
