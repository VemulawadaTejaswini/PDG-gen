import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class Main {

	public static class Node implements Comparable<Node> {
		int id;
		List<Integer> nextId;
		int cost = - 1;

		public Node(int id) {
			this.id = id;
			this.nextId = new ArrayList<>();
		}

		public void add(int id) {
			this.nextId.add(Integer.valueOf(id));
		}

		@Override
		public int compareTo(Node o) {
			return this.cost - o.cost;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] l1 = br.readLine().split(" ");

		int n = Integer.parseInt(l1[0]);
		int x = Integer.parseInt(l1[1]);
		int y = Integer.parseInt(l1[2]);

		int[][] cost = new int[n][n];
		for(int i=0; i< n; ++i) {
			
			List<Node> nodes = new ArrayList<Node>(n);
			for(int t = 1; t <= n; ++t) {
				Node node = new Node(t);
				if(t > 1) {
					node.add(t - 1);
				}
				if(t + 1 <= n) {
					node.add(t + 1);
				}
				if(t == x) {
					node.add(y);
				}
				if(t == y) {
					node.add(x);
				}
				nodes.add(node);
			}

			PriorityQueue<Node> queue = new PriorityQueue<>();
			queue.add(nodes.get(i));
			nodes.get(i).cost = 0;

			Node nd;
			while((nd = queue.peek()) != null) {
				nd = queue.poll();
				for(Integer ni: nd.nextId) {
					Node nn = nodes.get(ni - 1);
					if(nn.cost < 0 || nn.cost > nd.cost + 1) {
						nn.cost = nd.cost + 1;
						queue.offer(nn);
					}
				}
			}
			
			for(int j=0; j<n;++j) {
				cost[i][j] = nodes.get(j).cost;
			}
		}

		for(int k=1;k<n;++k) {
			int cnt = 0;
			
//			System.out.println(k);
			for(int i = 0; i < n; ++i) {
				for(int j = i; j < n; ++j) {
					if(cost[i][j]== k) {
//						System.out.println(String.format("(%d, %d)", i, j));
						++cnt;
					}
				}
			}
			System.out.println(cnt);
//			System.out.println();
		}


	}
}
