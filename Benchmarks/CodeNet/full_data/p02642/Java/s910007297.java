import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (list.contains(num)) {
				set.add(num);
			} else {
				list.add(num);
			}
		}
		if (N == 1) {
			System.out.println(1);
			return;
		}
		Collections.sort(list);
		long count = 0;
		for (int i = 0; i < list.size(); i++) {
			boolean key = true;
			int num = list.get(i);
			if (set.contains(num)) {
				continue;
			} else {
				for (int j = 1; j <= num/2; j++) {
					if (num%j == 0) {
						if (list.contains(j)) {
						    key = false;
						    break;
						}
					}
				}
				if (key) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}