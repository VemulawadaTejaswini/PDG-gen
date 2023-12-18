import java.util.*;
import static java.lang.System.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		//数ごとに出てきた回数を数える
		HashMap<Integer, Long> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			int key = list.get(i);
			//該当数がなければ１、あればl+1を追加
			Long l = map.get(key);
			map.put(key, l == null? 1 : l + 1);
		}
		//組み合わせ総数を算出
		long total = 0;
		for(long i : map.values()) {
			if (i > 1)
			total += combination(i, 2);
		}
		
		for (int i = 0; i < n; i++) {
			long ans = total;
			long tmp = map.get(list.get(i));
			ans = ans - combination(tmp , 2) + combination(tmp-1, 2);
			out.println(ans);
		}
		

		out.close();
	}
	
	public static long factorial(long n) {
		if (n <= 1)
			return 1;
		else {
			return n * factorial(n - 1);
		}
	}

	public static long combination(long n, long r) {
		long top = n;
		for (int i = 0; i < r - 1; i++) {
			top = top * (--n);
		}
		long bottom = factorial(r);
		return top / bottom;
	}
}
