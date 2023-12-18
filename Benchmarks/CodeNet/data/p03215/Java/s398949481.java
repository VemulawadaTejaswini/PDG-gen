import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int a[] = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int len = 1; len <= N; len++) {
			for(int now = 0; now + len <= N; now++) {
				int temp = 0;
				for(int i = 0; i < len; i++) {
					temp += a[now + i];
				}
				list.add(temp);
			}
		}
		
		int sum = list.get(list.size() - 1);
		String sum_bin = Integer.toBinaryString(sum);
		String ans_bin = "1";
		for(int i = 1; i < sum_bin.length(); i++) {
			ans_bin += "0";
		}
		
		ArrayList<Integer> templist = new ArrayList<Integer>();
		
		for(int i = 0; i < ans_bin.length(); i++) {
			templist.clear();
			int cnt = 0;
			for(int j = 0; j < list.size(); j++) {
				if((Integer.parseInt(ans_bin, 2) & list.get(j)) == Integer.parseInt(ans_bin, 2)) {
					cnt++;
					templist.add(list.get(j));
				}
			}
			if(cnt >= K) {
				list = (ArrayList<Integer>) templist.clone();
				if(i != ans_bin.length() - 1) {
					if(i != ans_bin.length() - 2) {
						ans_bin = ans_bin.substring(0, i) + "11" + ans_bin.substring(i + 2, ans_bin.length());
					} else {
						ans_bin = ans_bin.substring(0, i) + "11";
					}
				} else {
					ans_bin = ans_bin.substring(0, i) + "1";
				}
			} else {
				templist.clear();
				if(i != ans_bin.length() - 1) {
					if(i != ans_bin.length() - 2) {
						ans_bin = ans_bin.substring(0, i) + "01" + ans_bin.substring(i + 2, ans_bin.length());
					} else {
						ans_bin = ans_bin.substring(0, i) + "01";
					}
				} else {
					ans_bin = ans_bin.substring(0, i) + "0";
				}
			}
		}
		
		System.out.print(Integer.parseInt(ans_bin, 2));
	}
}
