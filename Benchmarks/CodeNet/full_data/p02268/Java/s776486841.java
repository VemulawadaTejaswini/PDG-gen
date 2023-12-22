import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> T = new ArrayList<Integer>();
		List<Integer> S = new ArrayList<Integer>();
		
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int val = in.nextInt();
			S.add(val);
		}
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			int val = in.nextInt();
			T.add(val);
		}
		
		int cnt = 0;
		for (int i = 0; i < T.size(); i++) {
			if (binarySearch(T.get(i), S)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	static boolean binarySearch(int val, List<Integer> S) {
		int left, right;
		
		left = 0;
		right = S.size();
		while (left < right) {
			int mid = (right + left)/2;
			if (S.get(mid) == val) {
				return true;
			}
			if (val < S.get(mid)) {
				right = mid;
			} else {
				left = mid+1;
			}
		}
		return false;
	}
}

