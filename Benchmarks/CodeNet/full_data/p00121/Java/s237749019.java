import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	LinkedList<String> getAdj(String puzzle) {

		LinkedList<String> a = new LinkedList<String>();

		int index = puzzle.indexOf('0');

		int[] adj = { -1, 1, -4, 4 };

		for (int i = 0; i < 4; i++) {

			int ni = index + adj[i];

			if (ni < 0)

				continue;

			if (ni > 7)

				continue;

			if(index == 5 && ni == 4)

				continue;

			if(index == 4 && ni == 5)

				continue;

			char buffer = puzzle.charAt(ni);

			char ch[] = puzzle.toCharArray();

			ch[ni] = '0';

			ch[index] = buffer;

			String str = new String(ch);

			a.add(str);

		}

		return a;

	}



	void run() {

		LinkedList<String> memo = new LinkedList<String>();

		memo.add("01234567");

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("01234567",0);

		int step = 1;

		int sum = 0;

		for (; !memo.isEmpty();) {

			LinkedList<String> nextMemo = new LinkedList<String>();

			

			for (String str : memo) {

//				System.out.println(str);

				for (String adj : getAdj(str)) {

//					System.out.println(" "+adj);

					if (map.containsKey(adj)) {

						continue;

					}

					if (nextMemo.contains(adj)) {

						continue;

					}

					map.put(adj,step);

					nextMemo.add(adj);

				}

			}

			step++;

			memo = nextMemo;

		}





		for (; sc.hasNextLine();) {

			System.out.println(map.get(sc.nextLine().replace(" ", "")));

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}