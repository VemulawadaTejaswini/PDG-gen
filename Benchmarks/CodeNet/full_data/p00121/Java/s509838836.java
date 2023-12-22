import java.io.IOException;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int ans[] = new int[87654321+10];
		create_ans(ans);
		while(in.hasNext()) {
			String[] map = in.nextLine().split(" ");
			System.out.println(ans[new Node(0, 0, map).getId()]);
		}
	}

	public static void create_ans(int ans[]) {
		String[] map = {"0","1","2","3","4","5","6","7"};
		Set<Integer> s = new HashSet<>();
		Queue<Node> q = new PriorityQueue<>();
		int z_pos = 0;
		for(int i=0;i<8;i++) {
			if(map[i].equals("0")) {
				z_pos = i;break;
			}
		}
		q.offer(new Node(z_pos, 0, map));
		while(!q.isEmpty()) {
			Node node = q.poll();
			int id = node.getId();
			s.add(id);

			// ??????
//			if(id == 1234567) {
//				return node.num;
//			}

			// ??????????????????????????\??????????????????????????\????????????
			int di[] = {-4, +4, -1, +1};
			for(int i=0;i<4;i++) {
				int zero = node.zero_pos + di[i];
				// ???????????????
				if(zero < 0 || zero > 7) continue;

				// ??\????????????
				Node newNode = new Node(zero, node.num+1, node.map);
				swap(newNode.map, node.zero_pos, zero);
				if(s.contains(newNode.getId())) continue;

				q.offer(newNode);
				ans[newNode.getId()] = newNode.num;
				s.add(newNode.getId());
			}
		}
	}

	public static void swap(String[] map, int p1, int p2) {
		String buf = map[p1];
		map[p1] = map[p2];
		map[p2] = buf;
	}
}

class Node implements  Comparable<Node>{
	int zero_pos = 0;
	int num;
	String[] map;
	Node(int zero_pos, int num, String[] map) {
		this.zero_pos = zero_pos;
		this.num = num;
		this.map = map.clone();
	}

	public int getId() {
		int id = 0;
		for(int i=0;i<map.length;i++) {
			id = id * 10 + Integer.parseInt(map[i]);
		}
		return id;
	}

	@Override
	public int compareTo(Node o) {
		return this.num - o.num;
	}
}