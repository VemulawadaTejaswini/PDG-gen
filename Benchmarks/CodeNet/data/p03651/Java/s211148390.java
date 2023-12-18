import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int wantNum = sc.nextInt();
		TreeSet<Integer> nums = new TreeSet<>();
		for(int i = 0; i < N; i++) {
			nums.add(sc.nextInt());
		}
		int limit = 0;
		System.out.println(check(nums, wantNum, limit));
	}
	public static String check(TreeSet<Integer> l, int wantNum, int limit) {
		List<Integer> list = new ArrayList<>(l);
		for(int i = 0; i < list.size(); i++) {
			for(int m = 0; m < list.size(); m++) {
				l.add(Math.abs(list.get(i) - list.get(m)));
			}
		}

		if(l.contains(wantNum)) {
			return "POSSIBLE";
		}

		limit += 1;
		if(limit > 5) {
			return "IMPOSSIBLE";
		} else {
			return check(l, wantNum, limit);
		}
	}
}
