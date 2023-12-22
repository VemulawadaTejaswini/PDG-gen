import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static Set<MultiValueMap> set = new HashSet<>();
	static boolean resBool;
	static Integer[] res;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			MultiValueMap multiValueMap = new MultiValueMap();
			multiValueMap.a = sc.nextInt();
			multiValueMap.b = sc.nextInt();
			set.add(multiValueMap);
		}
		resBool = true;
		res = new Integer[N + 1];
		res[0] = 99;
		res[1] = 99;
		getRes(new ArrayList<>(Arrays.asList(1)));

		if (resBool) {
			System.out.println("Yes");
			for (int i = 2; i <= N; i++) {
				System.out.println(res[i]);
			}
		} else {
			System.out.println("No");
		}
	}

	static class MultiValueMap {
		int a;
		int b;
	}

	private static void getRes(List<Integer> array) {
		List<Integer> dist = new ArrayList<>();
		for (int i : array) {
			for (MultiValueMap e : set) {
				if (e.a == i) {
					if (res[e.b] == null) {
						dist.add(e.b);
						res[e.b] = e.a;
					}
				}
				if (e.b == i) {
					if (res[e.a] == null) {
						dist.add(e.a);
						res[e.a] = e.b;
					}
				}
			}
		}
		if (!Arrays.asList(res).contains(null)) {
			return;
		}
		if (dist.isEmpty()) {
			resBool = false;
			return;
		}
		getRes(dist);
	}
}