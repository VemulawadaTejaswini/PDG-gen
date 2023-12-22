import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<List<Integer>> fullLIst;
	
	static void perm(List<Integer> seed) {
		List<Integer> list = new ArrayList<>(seed);
		boolean[] used = new boolean[seed.size()];
		build(seed, list, used, 0);
	}
	
	static void build(List<Integer> seed, List<Integer> list, boolean[] used, int index) {
		if (index == seed.size()) {
			fullLIst.add(new ArrayList<>(list));
			return;
		}
		
		for (int i = 0; i < seed.size(); i++) {
			if (used[i]) {
				continue;
			} else {
				list.set(index, seed.get(i));
				used[i] = true;
				build(seed, list, used, index + 1);
				used[i] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		List<Integer> sortedList = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
			sortedList.add(list.get(i));
		}
		fullLIst = new ArrayList<>();
		Collections.sort(sortedList);
		perm(sortedList);
		int index = -1;
		for (int i = 0; i < fullLIst.size(); i++) {
			boolean flag = true;
			
			for (int j = 0; j < fullLIst.get(i).size(); j++) {
				if (fullLIst.get(i).get(j) != list.get(j)) {
					flag = false;
					break;
				}
			}
			
			if (flag) {
				index = i;
				break;
			}
		}
		
		if (index > 0) {
			for (int i = 0; i < fullLIst.get(index - 1).size() - 1; i++) {
				System.out.print(fullLIst.get(index - 1).get(i) + " ");
			}
			System.out.println(fullLIst.get(index - 1).get(fullLIst.get(index - 1).size() - 1));
		}
		
		for (int i = 0; i < fullLIst.get(index).size() - 1; i++) {
			System.out.print(fullLIst.get(index).get(i) + " ");
		}
		System.out.println(fullLIst.get(index).get(fullLIst.get(index).size() - 1));
		
		if (index < fullLIst.size() - 1) {
			for (int i = 0; i < fullLIst.get(index + 1).size() - 1; i++) {
				System.out.print(fullLIst.get(index + 1).get(i) + " ");
			}
			System.out.println(fullLIst.get(index + 1).get(fullLIst.get(index + 1).size() - 1));
		}
	}
}

