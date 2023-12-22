import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int q = sc.nextInt();
		sc.nextLine();

		String[] p = new String[n];
		int[] t = new int[n];
//		LinkedHashMap<String, Integer> hmi = new LinkedHashMap<>();
//		LinkedHashMap[] hm = new LinkedHashMap[n];
		ArrayDeque<AbstractMap.SimpleEntry<String, Integer>> ad =
				new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
			p[i] = sc.next();
			t[i] = sc.nextInt();
//			hmi.put(p[i], t[i]);
//			( (LinkedHashMap<String, Integer>) hm[i] ).put(p[i], t[i]);
			AbstractMap.SimpleEntry<String, Integer> pair =
					new AbstractMap.SimpleEntry<>(p[i], t[i]);
			ad.add(pair);
		}

//		System.out.println(Arrays.toString(p));
//		System.out.println(Arrays.toString(t));
//		System.out.println(ad.poll());

		int time = 0;
		while (!ad.isEmpty()) {
			AbstractMap.SimpleEntry<String, Integer> pair = ad.poll();
			// pt: pair time
			int pt = pair.getValue() - q;
			// pp : pair name
			String pn = pair.getKey();

			if (pt > 0) {
				pair.setValue(pt);
				ad.add(pair);
				time += q;
			} else {
				time += pair.getValue();
				System.out.println(pn + " " + time);
			}
		}
	}
}