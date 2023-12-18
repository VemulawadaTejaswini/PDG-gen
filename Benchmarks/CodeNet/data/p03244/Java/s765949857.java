import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);
		int n = sc.nextInt();

		HashMap<Integer, Integer> odd = new HashMap<>();
		HashMap<Integer, Integer> even = new HashMap<>();

		for (int i = 0; i < n / 2; i++) {
			int o = sc.nextInt();
			int e = sc.nextInt();

			odd.put(0, 0);
			even.put(0, 0);

			if (!odd.containsKey(o)) {
				odd.put(o, 0);
			}
			odd.put(o, odd.get(o) + 1);

			if (!even.containsKey(e)) {
				even.put(e, 0);
			}
			even.put(e, even.get(e) + 1);
		}

		List<Entry<Integer, Integer>> oddList = new ArrayList<>(odd.entrySet());
		List<Entry<Integer, Integer>> evenList = new ArrayList<>(even.entrySet());

		Collections.sort(oddList, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});

		Collections.sort(evenList, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});

		if (!oddList.get(0).getKey().equals(evenList.get(0).getKey())) {
			out.println(n - oddList.get(0).getValue() - evenList.get(0).getValue());
		} else {
			out.println(
					Math.min(n - oddList.get(0).getValue() - evenList.get(1).getValue(),
							n - oddList.get(1).getValue() - evenList.get(0).getValue()));
		}

		sc.close();
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
