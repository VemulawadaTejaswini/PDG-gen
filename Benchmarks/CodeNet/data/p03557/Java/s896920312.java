import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> $1 = new ArrayList<>();
		ArrayList<Integer> $2 = new ArrayList<>();
		ArrayList<Integer> $3 = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			$1.add(sc.nextInt());
		}
		for(int i = 0; i < n; i++) {
			$2.add(sc.nextInt());
		}
		for(int i = 0; i < n; i++) {
			$3.add(sc.nextInt());
		}
		$1.sort(null);$2.sort(null);$3.sort(null);
		long ans = 0L;
		for(int i = 0; i < n; i++) {
			int s = $2.get(i);//中央を全探索
			long ok1 = 0L;
			long ok3 = 0L;
			//lower_bound
			ok1 = Collections.binarySearch($1, s, (Integer x, Integer y) ->  (x.compareTo(y) >= 0 ? 1 : -1));
			ok1 = ok1 >= 0 ? ok1 : ~ok1;
			//upper_bound
			ok3 = ~Collections.binarySearch($3, s, (Integer x, Integer y) ->  (x.compareTo(y) > 0 ? 1 : -1));
			ok3 = ok3 >= 0 ? ok3 : ~ok3;
			ok3 = $3.size() - ok3;
			//System.out.println(String.format("%sのとき$1は%s  $3は%s", s,ok1,ok3));
			ans += ok1 * ok3;
			//System.out.println(ans);
		}
		System.out.println(ans);
	}
}
