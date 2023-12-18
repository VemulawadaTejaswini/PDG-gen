import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		List<Integer> Aary = primeFactory(A);
		List<Integer> Bary = primeFactory(B);
		Map<Integer,Integer> map = new HashMap<>();
		int cnt = 1;
		for(int i : Aary) {
			map.put(cnt,i);
			cnt++;
		}
		List<Integer> result = new ArrayList<>();
		for(int i : Bary) {
			if(map.containsValue(i)) {
				result.add(i);
			}
		}
		System.out.println(result.size() != 0 ? result.size() : 1);
	}

	private static List<Integer> primeFactory(int i) {
		List<Integer> ary = new ArrayList<>();
		while(i % 2 == 0) {
			i /= 2;
			ary.add(2);
		}
		for(int j = 3;j <= i;j+=2) {
			while(i % j == 0) {
				ary.add(j);
				i /= j;
			}
		}
		return ary;
	}
}