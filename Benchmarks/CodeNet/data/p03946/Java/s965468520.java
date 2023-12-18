import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int prev = 0;
		int min = sc.nextInt();
		int max = min;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < n; i++) {
			int x = sc.nextInt();
			if (max < x) {
				max = x;
			}
			if (min > x) {
				list.add(max - min);
				min = x;
				max = x;
			}
		}
		list.add(max - min);
		Collections.sort(list);
		Collections.reverse(list);
		int first = list.get(0);
		if (first == 0) {
			System.out.println(0);
			return;
		}
		int cnt = 1;
		for (int i = 1; i < list.size(); i++) {
			if(first == list.get(i)) {
				cnt++;
			} else {
				break;
			}
		}
		System.out.println(cnt);
	}
}
