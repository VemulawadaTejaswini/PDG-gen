import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		long sum = 0;
		List<Integer> rset = new LinkedList<>();
		List<Integer> gset = new LinkedList<>();
		List<Integer> bset = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'R') {
				rset.add(i);
			} else if (s.charAt(i) == 'G') {
				gset.add(i);
			} else if (s.charAt(i) == 'B') {
				bset.add(i);
			}
		}
		sum = rset.size() * gset.size() * bset.size();
		for (int i = 0; i < rset.size(); i++) {
			for (int j = 0; j < gset.size(); j++) {
				int a = rset.get(i);
				int b = gset.get(j);
				int max = Math.max(b,a);
				int min = Math.min(b,a);
				if (bset.contains(max + max - min)) {
					sum--;
				}
				if ((min+max) %2 ==0 && bset.contains((min+max)/2)) {
					sum--;
				}
				if (bset.contains(min + min - max)) {
					sum--;
				}
			}
		}
		System.out.println(sum);
	}

}
