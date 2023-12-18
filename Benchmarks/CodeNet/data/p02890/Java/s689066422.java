
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		int num = list.get(0);
		int pos = 0;
		int[] change = new int[n];
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == num) {
				change[pos]++;
			} else {
				num = list.get(i);
				pos++;
				change[pos]++;
			}
		}
		list.clear();
		for(int i = 0; i < n; i++) {
			if(change[i] != 0) {
				list.add(change[i]);
			} else
				break;
		}
		Collections.sort(list);
		Collections.reverse(list);
		for(int i = 1; i < n + 1; i++) {
			List<Integer> copy = new ArrayList<>(list);
			if(copy.size() < i) {
				System.out.println(0);
			} else {
				List<Integer> min = new ArrayList<>();
				for(int j = 0; j < i; j++) {
					min.add(copy.get(j));
				}
				Collections.sort(min);
				for(int j = i; j < copy.size(); j++) {
					min.add(min.get(0) + copy.get(j));
					min.remove(0);
					Collections.sort(min);
				}
				System.out.println(min.get(0));
			}
		}
	}

}
