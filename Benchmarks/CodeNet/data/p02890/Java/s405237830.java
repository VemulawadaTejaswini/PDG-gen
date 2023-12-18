
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
		int[] max = new int[n];
		for(int i = 0; i < list.size(); i++) {
			max[i] = list.get(i);
		}
		for(int i = 1; i < n + 1; i++) {
			if(max[i - 1] == 0) {
				System.out.println(0);
			} else {
				int[] min = new int[i];
				for(int j = 0; j < i; j++) {
					min[j] = max[j];
				}
				int position = i;
				while(position < n && max[position] != 0) {
					int minpos = 0;
					int minnum = Integer.MAX_VALUE;
					for(int j = 0; j < i; j++) {
						if(minnum > min[j]) {
							minpos = j;
							minnum = min[j];
						}
					}
					min[minpos] += max[position];
					position++;
				}
				int mp = 0;
				int mn = Integer.MAX_VALUE;
				for(int j = 0; j < i; j++) {
					if(mn > min[j]) {
						mp = j;
						mn = min[j];
					}
				}
				System.out.println(min[mp]);
			}
		}
	}

}
