import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// nがあり、nの数だけの整数の入力
			int n = sc.nextInt();
			List<Integer> an = new ArrayList<>();
			for (int i = 0; i < n * 2 - 2; i++) {
				an.add(sc.nextInt());
			}
			int maxUse = 1;
			StringBuilder sb = new StringBuilder();
			Map<Integer, Set<Integer>> useMap = new HashMap<>();
			for (int i = 0; i < an.size(); i++) {
				int start = an.get(i);
				i++;
				int end = an.get(i);
				Set<Integer> useStart = useMap.get(start);
				if (useStart == null) {
					useStart = new HashSet<>();
					useMap.put(start, useStart);
				}
				Set<Integer> useEnd = useMap.get(end);
				if (useEnd == null) {
					useEnd = new HashSet<>();
					useMap.put(end, useEnd);
				}
				Set<Integer> useAll = new HashSet<>(useStart);
				useAll.addAll(useEnd);
				for (int j = 1; j < n; j++) {
					if (!useAll.contains(j)) {
						if (maxUse < j) {
							maxUse = j;
						}
						useStart.add(j);
						useEnd.add(j);
						sb.append(j);
						sb.append(System.lineSeparator());
						break;
					}
				}
			}
			// 出力(整数)
			System.out.println(maxUse + System.lineSeparator() + sb);
		}
	}
}
