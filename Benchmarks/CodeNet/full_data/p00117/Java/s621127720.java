import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	enum Color {
		White, Gray, Black
	}

	static void setEdge(List<ArrayList<int[]>> edge, String input) {
		String[] str = input.split(",");
		int from = Integer.parseInt(str[0]);
		int to = Integer.parseInt(str[1]);
		int cost1 = Integer.parseInt(str[2]);
		int cost2 = Integer.parseInt(str[3]);
		edge.get(from - 1).add(new int[] { to - 1, cost1 });
		edge.get(to - 1).add(new int[] { from - 1, cost2 });
	}

	static int[] bfs(List<ArrayList<int[]>> edge, int s) {
		int[] dist = new int[edge.size()];
		Color[] color = new Color[edge.size()];
		for (int i = 0; i < edge.size(); i++) {
			dist[i] = Integer.MAX_VALUE;
			color[i] = Color.White;
		}
		color[s] = Color.Gray;
		dist[s] = 0;
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.add(s);

		while (! q.isEmpty()) {
			int from = q.poll();
				for(int[] e : edge.get(from)){
					int to = e[0];
					int cost = e[1];
					int total = dist[from] + cost;
					dist[to] = (total < dist[to])? total : dist[to];
					if(color[to] == Color.White){
						color[to] = Color.Gray;
						q.add(to);
					}
				}
			color[from] = Color.Black;
		}
		return dist;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int city = s.nextInt();
		int numEdge = s.nextInt();
		List<ArrayList<int[]>> edge = new ArrayList<ArrayList<int[]>>();
		for(int i = 0; i < city; i++){
			edge.add(new ArrayList<int[]>());
		}
		for (int i = 0; i < numEdge; i++) {
			setEdge(edge, s.next());
		}
		String[] input = s.next().split(",");
		int start = Integer.parseInt(input[0]);
		int dest = Integer.parseInt(input[1]);
		int money = Integer.parseInt(input[2]);
		int price = Integer.parseInt(input[3]);
		System.out.println(money - price - bfs(edge, start - 1)[dest - 1] - bfs(edge, dest - 1)[start - 1]);
		s.close();
	}

}