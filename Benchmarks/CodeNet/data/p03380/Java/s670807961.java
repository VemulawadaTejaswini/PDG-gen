import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		ArrayList<Integer> a = new ArrayList<Integer>();

		for(int i = 0; i < n; i++) {
			a.add(Integer.parseInt(sc.next()));
		}
		Collections.sort(a);

		int ai = a.get(n - 1);

		// (ai/2)に最も近い数を探索する
		for(int i = 0;; i++) {
			if((double)a.get(i) >= (double)ai / 2.0) {
				if((double)a.get(i) - ((double)ai / 2.0) < ((double)ai / 2.0) - (double)a.get(i - 1)){
					System.out.println(ai + "," + a.get(i));
				}else {
					System.out.println(ai + "," + a.get(i - 1));
				}
				break;
			}
		}

	}

}
