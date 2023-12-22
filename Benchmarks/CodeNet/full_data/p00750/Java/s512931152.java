import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	class node {

		int id;

		Character cost;

		LinkedList<Integer> next = new LinkedList<Integer>();

	}

	int strlen;

	String rec(LinkedList<Integer> next, String spell, node[] graph,

			LinkedList<Integer> goal, int count ,boolean[] visited) {

		LinkedList<Integer> next2 = new LinkedList<Integer>();

		char min = Character.MAX_VALUE;

		// System.out.println(spell);

		if (count > strlen)

			return "NO";

		if (next.isEmpty())

			return "NO";

		boolean visited2 = true;

		for (int h : next) {

			visited2 &= visited[h];

			visited[h] = true;

			if (min > graph[h].cost) {

				next2.clear();

				min = graph[h].cost;

				next2.addAll(graph[h].next);

			} else if (min == graph[h].cost) {

				next2.addAll(graph[h].next);

			}

		}

		for(int h:next){

			if (goal.contains((Object) h) && min == graph[h].cost) {

				return spell+min;

			}

		}

		if(visited2) return "NO";

		spell += min;

		return rec(next2, spell, graph, goal, ++count,visited);

	}

	class terminal{

		LinkedList<Integer> next = new LinkedList<Integer>();

	}

	class arrow {

		int id;

		int from;

		int to;

		String cost;



		arrow(int from, int to, String cost) {

			this.from = from;

			this.to = to;

			this.cost = cost;

		}



		@Override

		public boolean equals(java.lang.Object obj) {

			arrow arr = (arrow) obj;

			return from == arr.from && to == arr.to;

		}



		@Override

		public String toString() {

			return from + " zl " + to + "   -" + cost;

		}

	}



	void run() {

		for (;;) {

			int n = sc.nextInt();

			int a = sc.nextInt();

			int s = sc.nextInt();

			int g = sc.nextInt();

			if ((n | a | s | g) == 0)

				break;

			LinkedList<arrow> arr = new LinkedList<Main.arrow>();

			for (int i = 0; i < a; i++) {

				int from = sc.nextInt();

				int to = sc.nextInt();

				String cost = sc.next();

				arrow node = new arrow(from, to, cost);

				if (arr.contains(node)) {

					arrow n2 = arr.get(arr.indexOf(node));

					if (n2.cost.compareTo(cost) > 0) {

						arr.remove(arr.indexOf(node));

						arr.add(node);

					}

				} else {

					arr.add(node);

				}

			}

			strlen = 0;

			int[] map = new int[arr.size()];

			int count = 0;

			

			for (arrow n0 : arr) {

				map[count] = strlen;

				n0.id = count;

				strlen += n0.cost.length();

				count++;

			}

			terminal[] t = new terminal[n];

			for(int i=0;i<n;i++){

				t[i] = new terminal();

			}

			for(arrow n1:arr){

				t[n1.from].next.add(map[n1.id]);

			}

			node[] graph = new node[strlen];

			LinkedList<Integer> start = new LinkedList<Integer>();

			LinkedList<Integer> goal = new LinkedList<Integer>();

			for (arrow n0 : arr) {

				char[] c = n0.cost.toCharArray();

				for (int i = 0; i < n0.cost.length() - 1; i++) {

					graph[i + map[n0.id]] = new node();

					graph[i + map[n0.id]].cost = c[i];

					graph[i + map[n0.id]].id = i + map[n0.id];

					graph[i + map[n0.id]].next.add(i + map[n0.id] + 1);

				}

				int i = n0.cost.length() - 1;

				graph[i + map[n0.id]] = new node();

				graph[i + map[n0.id]].cost = c[i];

				graph[i + map[n0.id]].id = i + map[n0.id];

				

				 // TODO ツつアツつアツづーツ債つ堕ャツづ可（ツ計ツ算ツ療環づーツ個クツづァツつキツ）

				graph[i + map[n0.id]].next.addAll(t[n0.to].next);

/*				for(arrow n1:arr){

					if(n0.to == n1.from){

						graph[i + map[n0.id]].next.add(map[n1.id]);

					}

				}*/

				if (s == n0.from) {

					start.add(map[n0.id]);

				}

				if (g == n0.to) {

					goal.add(map[n0.id] + i);

				}

			}

			LinkedList<Integer> next = new LinkedList<Integer>();

			char min = Character.MAX_VALUE;

			for (int h : start) {

				if (min > graph[h].cost) {

					next.clear();

					min = graph[h].cost;

					next.add(h);

				} else if (min == graph[h].cost) {

					next.add(h);

				}

			}

			String spell = "";

			boolean[] visited = new boolean[graph.length]; 

			System.out.println(rec(next, spell, graph, goal, 0 , visited));

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}