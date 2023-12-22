import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recursion {
	static List<Integer> aList = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			aList.add(sc.nextInt());
		}
		int q = sc.nextInt();
		List<Integer> mList = new ArrayList<>();
		for (int i = 0; i < q; i++) {
			mList.add(sc.nextInt());
		}
		
		for (Integer m : mList) {
			if (isMatch(0, 0, m.intValue())) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		
	}
	
	public static boolean isMatch(int j, int S, int T) {
			if (S == T) {
				return true;
			}
			for (int i = j; i < aList.size(); i++) {
				if (isMatch(i + 1, S + aList.get(i).intValue(), T)) {
					return true;
				}
			}
			return false;
		}
}