
import java.util.ArrayList;
import java.util.Scanner;

class Node{
	int id;
	ArrayList<Node> next_list;
	boolean is_visited;
	public Node(int id){
		this.id = id;
		this.next_list = new ArrayList<>();
		this.is_visited = false;
	}

	public void addNext(Node next,int path_id){
		this.next_list.add(next);
	}

	String calcPath(int count){
		is_visited = true;

		for(int i = 0;i < next_list.size();i++){
			Node next = next_list.get(i);
			if(next.is_visited)continue;

			return id + " " + next.calcPath(count + 1);
		}
		count++;
		return String.valueOf(id) + ":" + count;
	}
}

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vertex_count = sc.nextInt();
		int side_count = sc.nextInt();

		ArrayList<Node>node_list = new ArrayList<Node>();

		for(int i = 0;i < vertex_count;i++){
			node_list.add(new Node(i + 1));
		}

		for(int i = 0;i < side_count;i++){
			int j = sc.nextInt() - 1;
			int k = sc.nextInt() - 1;
			node_list.get(j).addNext(node_list.get(k),i + 1);
			node_list.get(k).addNext(node_list.get(j),i + 1);
		}

		String path = node_list.get(0).calcPath(0);
		String count_str;
		String[] str = path.split(":");
		path = str[0];
		count_str = str[1];

		System.out.println(count_str);
		System.out.println(path);

		sc.close();
	}

}
