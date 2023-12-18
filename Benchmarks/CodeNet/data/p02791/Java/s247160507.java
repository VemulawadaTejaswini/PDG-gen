import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.next());

		int counter = 0;
		ArrayList<Integer> pi = new ArrayList<Integer>();
		for(int i=0; i<n; ++i) {
			int numPi = Integer.parseInt(scan.next());
			pi.add(numPi);
			boolean clear = true;
			for(int j=0; j<i; ++j) {
				// 満たさない物があったため、falseにしてbreak
				if(numPi > pi.get(j)) {
					clear = false;
					break;
				}
			}
			// 条件を満たした場合はインクリメント
			if(clear) {
				++counter;
			}
		}
		System.out.println(counter);
	}
}