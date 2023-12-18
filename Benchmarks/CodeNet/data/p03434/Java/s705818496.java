package beginner088;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf = br.readLine();
		int n = Integer.valueOf(buf);

		buf = br.readLine();
		String[] a = buf.split(" ", 0);

		List<Integer> aList = Stream.of(a)
		    .map(Integer::valueOf)
		    .sorted(Comparator.reverseOrder())
		    .collect(Collectors.toList());

		int alice = 0;
		int bob = 0;
		for (int i = 0; i < aList.size(); i++) {
			if (i % 2 == 0) {
				alice += aList.get(i);
			} else {
				bob += aList.get(i);
			}
		}

		System.out.println(alice - bob);
	}

}
