import java.io.IOException;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> ans = new HashMap<>();
		create_ans(ans);
		while(in.hasNext()) {
			String[] map = in.nextLine().split(" ");
			System.out.println(ans.get(""+new Node(0, 0, map).getStrId()));
		}
	}

	public static void create_ans(Map<String, Integer> ans) {
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
			ans.put(node.getStrId(), node.num);

			// ??????????????????????????\??????????????????????????\????????????
			int di[] = {-4, +4, -1, +1};
			for(int i=0;i<4;i++) {
				int zero = node.zero_pos + di[i];
				// ???????????????
				if(zero < 0 || zero > 7) continue;
				if(node.zero_pos == 3 && i == 3) continue;
				if(node.zero_pos == 4 && i == 2) continue;

				// ??\????????????
				Node newNode = new Node(zero, node.num+1, node.map);
				swap(newNode.map, node.zero_pos, zero);
				if(s.contains(newNode.getId())) continue;
				newNode.addSteps(node.getSteps());
				newNode.addStep(newNode);

				q.offer(newNode);
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
	List<Node> steps = new ArrayList<>();
	Node(int zero_pos, int num, String[] map) {
		this.zero_pos = zero_pos;
		this.num = num;
		this.map = map.clone();
	}

	public void addStep(Node node) {
		this.steps.add(node);
	}

	public void addSteps(List<Node> steps) {
		this.steps = new ArrayList<Node>(steps);
	}

	public List<Node> getSteps() {
		return this.steps;
	}

	public int getId() {
		int id = 0;
		for(int i=0;i<map.length;i++) {
			id = id * 10 + Integer.parseInt(map[i]);
		}
		return id;
	}

	public String getStrId() {
		String id = "";
        for(int i=0;i<map.length;i++) {
			id = id + map[i];
		}
		return id;
	}

	@Override
	public int compareTo(Node o) {
		return this.num - o.num;
	}
}