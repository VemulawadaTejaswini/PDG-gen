import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		String[] s = new String[N];
		int[][] smap = new int[N][26];
		Map<Integer, Set<Integer>> alphaMap = new HashMap<>();
		for (int i = 0; i < N; i++) {
			s[i] = sc.nextLine();

			Set<Integer> alphaSet = new HashSet<>();
			for (int k = 0; k < 10; k++) {
				char c = s[i].substring(k, k + 1).charAt(0);
				alphaSet.add(Character.getNumericValue(c));
			}
			alphaMap.put(i, alphaSet);
		}

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (alphaMap.get(i).equals(alphaMap.get(j))) cnt++;
			}
		}

		System.out.println(cnt);
	}
}