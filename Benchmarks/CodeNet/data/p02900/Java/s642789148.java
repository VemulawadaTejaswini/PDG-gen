import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		sc.close();
		List<Long> Aary = primeFactory(A);
		List<Long> Bary = primeFactory(B);
		Map<Integer,Long> map = new HashMap<>();
		int cnt = 1;
		for(long i : Aary) {
			map.put(cnt,i);
			cnt++;
		}
		List<Long> result = new ArrayList<>();
		for(long i : Bary) {
			if(map.containsValue(i)) {
				result.add(i);
			}
		}
		System.out.println(result.size() != 0 ? result.size() : 1);
	}

	private static List<Long> primeFactory(long i) {
		List<Long> ary = new ArrayList<>();
		while(i % 2 == 0) {
			i /= 2;
			ary.add(2L);
		}
		for(long j = 3;j <= i;j+=2) {
			while(i % j == 0) {
				ary.add(j);
				i /= j;
			}
		}
		return ary;
	}
}