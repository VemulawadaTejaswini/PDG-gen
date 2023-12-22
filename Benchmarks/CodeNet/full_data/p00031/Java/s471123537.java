import java.io.IOException;
import java.util.*;

/**
 */
class Main {
	final static int N = 10;

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int d = in.nextInt();
			solve(d);
		}
	}

	public static void solve(int d) {
		int res = d;
		List<Integer> ansArr = new ArrayList<>();
		for(int i=9;i>=0;i--) {
			int target = (int)Math.pow(2, i);
			if(res - target >= 0) {
				res -= target;
				ansArr.add(target);
			}
		}
		Collections.sort(ansArr);
		for(int i=0;i<ansArr.size();i++) {
			System.out.print(String.format("%d%s", ansArr.get(i), ((i == ansArr.size() - 1) ? "" : " ")));
		}
		System.out.println("");
	}
}