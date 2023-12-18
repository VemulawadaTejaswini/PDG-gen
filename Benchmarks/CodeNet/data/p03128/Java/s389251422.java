import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	int N, M;
	Set<Integer> A;
	Map<Integer, Integer> cost;
	int[] baseCost = { 2, 5, 5, 4, 5, 6, 3, 7, 6 };
	int[] baseOrder = { 1, 7, 4, 5, 3, 2, 9, 6, 8 };
	List<Integer> searchOrder;
	Deque<Integer> result;

	Main() {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		A = new HashSet<>();
		tokens = in.nextLine().split(" ");
		cost = new HashMap<>();
		searchOrder = new ArrayList<>();
		for (int i = 0; i < M; ++i) {
			int val = Integer.parseInt(tokens[i]);
			A.add(val);
		}
		for (int i = 0; i < baseOrder.length; ++i) {
			if (A.contains(baseOrder[i])) {
				searchOrder.add(baseOrder[i]);
			}
		}
		in.close();
		result = new ArrayDeque<>();
	}

	boolean search(int num) {
		if (num < 0) {
			return false;
		}
		if (num == 0) {
			return true;
		}
		if(num == 6) {
			if(A.contains(7)) {
				result.addLast(7);
				result.addLast(7);
				return true;
			}
		}
		if (num == 7) {
			if (A.contains(7) && A.contains(4)) {
				result.addLast(7);
				result.addLast(4);
				return true;
			}
		}
		for (int i = 0; i < searchOrder.size(); ++i) {
			int val = searchOrder.get(i);
			result.addLast(val);
			boolean r = search(num - baseCost[val - 1]);
			if (r) {
				return true;
			} else {
				result.pollLast();
			}
		}
		return false;
	}

	void calc() {
		search(N);
	}

	void show() {
		List<Integer> list = new ArrayList<>(result.size());
		list.addAll(result);
		Collections.sort(list);
		Collections.reverse(list);
		for (int i = 0; i + 1 < list.size(); ++i) {
			System.out.print(list.get(i));
		}
		System.out.println(list.get(list.size() - 1));
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		ins.show();
	}

}