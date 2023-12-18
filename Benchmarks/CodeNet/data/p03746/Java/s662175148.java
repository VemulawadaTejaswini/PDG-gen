

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a + b + c;
		String s = sc.next();
		String res = String.valueOf(sum) + " " + s;
		System.out.println(res);*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();
		int key = 1;
		for (int i = 0; i < m; i++) {
			int start = sc.nextInt();
			if (i == 0) key = start;
			int end = sc.nextInt();
			if (map.containsKey(start)) {
				LinkedList<Integer> tmp = map.get(start);
				tmp.add(end);
				map.put(start, tmp);
			} else {
				map.put(start, new LinkedList<Integer>());
				LinkedList<Integer> tmp = map.get(start);
				tmp.add(end);
				map.put(start, tmp);
			}
			if (map.containsKey(end)) {
				LinkedList<Integer> tmp = map.get(end);
				tmp.add(start);
				map.put(end, tmp);
			} else {
				map.put(end, new LinkedList<Integer>());
				LinkedList<Integer> tmp = map.get(end);
				tmp.add(start);
				map.put(end, tmp);
			}
		}
		LinkedList<Integer> queue = new LinkedList<>();
		while (map.containsKey(key) && !queue.contains(key)) {
			queue.offer(key);
			boolean insert = false;
			for (int i : map.get(key)) {
				if (!queue.contains(i)) {
					//queue.offer(i);
					key = i;
					insert = true;
					break;
				}
			}
			if (!insert) break;
		}
		String res = "";
		while (!queue.isEmpty()) {
			res += String.valueOf(queue.poll());
			res += " ";
		}
		System.out.println(res.trim());
	}

}
