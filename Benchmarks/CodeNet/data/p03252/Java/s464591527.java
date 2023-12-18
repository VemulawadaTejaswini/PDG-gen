import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] s = scanner.next().toCharArray(), t = scanner.next().toCharArray();
			// sとtにそれぞれのみ含まれる文字
			Set<Character> sSet = new HashSet<>(), tSet = new HashSet<>();
			Map<Character, Integer> sMap = new HashMap<>(), tMap = new HashMap<>();
			IntStream.range(0, s.length).forEach(i -> {
				sSet.add(s[i]);
				tSet.add(t[i]);
				sMap.put(s[i], sMap.getOrDefault(s[i], 0) + 1);
				tMap.put(t[i], tMap.getOrDefault(t[i], 0) + 1);
			});
			// sとt両方に含まれる文字セット
			Set<Character> commonSet = new HashSet<>(sSet);
			commonSet.retainAll(tSet);
			sSet.removeAll(commonSet);
			tSet.removeAll(commonSet);
			boolean sameCount = true;
			for (char c : commonSet) {
				sameCount &= (sMap.get(c) == tMap.get(c));
			}
			System.out.println(((sSet.size() == tSet.size()) && sameCount) ? "Yes" : "No");
		}
	}
}
