import java.util.*;

class Node implements Comparable<Node> {
	
	int data;
	ArrayList<Integer> children;
	int index;
	
	public Node(int data, ArrayList<Integer> children) {
		this.data = data;
		this.children = children;
	}
	
	public Node(int data, ArrayList<Integer> children, int index) {
		this.data = data;
		this.children = children;
		this.index = index;
	}

	@Override
	public int compareTo(Node node) {
		if (this.data < node.data) {
			return -1;
		} else if (this.data > node.data) {
			return 1;
		} else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return "Data: " + this.data + " || Index: " + this.index;
	}
	
}


public class Main {
	
	ArrayList<Node> nodes = new ArrayList<Node>();
	PriorityQueue<Node> queue = new PriorityQueue<Node>();
	ArrayList<Integer> storage = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Main main = new Main();
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int index = in.nextInt();
			int number = in.nextInt();
			ArrayList<Integer> children = new ArrayList<Integer>();
			for (int j = 0; j < number; j++) {
				children.add(in.nextInt());
			}
			if(i == 0) {
				main.nodes.add(new Node(0, children, index));
			} else {
				main.nodes.add(new Node(9999999, children, index));
			}
		}
		main.queue.add(main.nodes.get(0));
		main.storage.add(main.nodes.get(0).index);
		while(!(main.queue.size() == 0)) {
			Node node = main.queue.poll();
			main.solve(node);
			for (int i = 0; i < node.children.size(); i++) {
				if (!(main.inStorage(node.children.get(i)))) {
					main.queue.add(main.nodes.get(node.children.get(i) - 1));
					main.storage.add(node.children.get(i));
				}
			}
		}
		main.printDistance();
		//main.printStorage();
		
	}
	
	public void solve(Node node) {
		int distance = node.data;
		for (int i = 0; i < node.children.size(); i++) {
			int childDistance = this.nodes.get(node.children.get(i) - 1).data;
			childDistance = (distance + 1 < childDistance)? distance + 1 : childDistance;
			this.nodes.get(node.children.get(i) - 1).data = childDistance;
		}
		
	}
	
	public void printList() {
		Object[] array = this.queue.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public void printNodes() {
		for (int i = 0; i < this.nodes.size(); i++) {
			System.out.print(this.nodes.get(i).data + " ");
			for (int j = 0; j < this.nodes.get(i).children.size(); j++) {
				System.out.print(this.nodes.get(i).children.get(j) + " ");
			}
			System.out.println();
		}
	}
	
	public void printDistance() {
		for (int i = 0; i < this.nodes.size(); i++) {
			if (this.nodes.get(i).data != 9999999)
				System.out.printf("%d %d\n", i + 1, this.nodes.get(i).data);
			else
				System.out.printf("%d %d\n", i + 1, -1);
		}
	}
	
	public void printStorage() {
		for (int i = 0; i < this.storage.size(); i++) {
			System.out.print(this.storage.get(i) + " ");
		}
		System.out.println();
	}
	
	public boolean inStorage(int x) {
		for (int i = 0; i < this.storage.size(); i++) {
			if (x == this.storage.get(i)) {
				return true;
			}
		}
		return false;
	}

}

