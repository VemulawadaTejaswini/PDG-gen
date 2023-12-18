import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static class Node {
		int pos;
		int year;
		int prefecture;
		public Node (int pos, int year, int prefecture) {
			this.pos = pos;
			this.year = year;
			this.prefecture = prefecture;
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Node[] cities = new Node[M];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			cities[i] = new Node(i, y, p);
		}
		Arrays.sort(cities, new Comparator<Node>() {
			public int compare(Node node1, Node node2) {
				return node1.year - node2.year;
			}
		});
		int[] count = new int[N+1];
		for (int i = 0; i < M; i++) {
			cities[i].year = ++count[cities[i].prefecture];
		}
		Arrays.sort(cities, new Comparator<Node>() {
			public int compare(Node node1, Node node2) {
				return node1.pos - node2.pos;
			}
		});
		for (int i = 0; i < M; i++) {
			System.out.println(String.format("%06d", cities[i].prefecture) + String.format("%06d", cities[i].year));
		}
	}
}
