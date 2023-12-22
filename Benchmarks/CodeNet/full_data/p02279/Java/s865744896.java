import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
	int depth = 0;
	int parent = -1;
	String type = "";
	ArrayList<Integer> children = new ArrayList<Integer>();
} 

public class Main {
	
	private static Scanner src;

	public static void main(String[] args) {
		src = new Scanner(System.in);
		int n = src.nextInt();
		Node[] tree = new Node[n];
		for(int i = 0; i < n; i++) tree[i] = new Node(); 
		for(int i = 0; i < n; i++) {
			int id = src.nextInt(), k = src.nextInt(); 
			for(int j = 0; j < k; j++) {
				Integer child = src.nextInt(); 
				tree[id].children.add(child);
				tree[child].parent = id;
			}
		}
		for(int i = 0; i < n; i++) {
			if(tree[i].parent == -1) {
				Queue<Integer> queue = new LinkedList<Integer>();
				for(Integer child : tree[i].children) queue.add(child);
				int size = tree[i].children.size();
				int d = 1;
				while(!queue.isEmpty()) {
					int child = queue.poll();
					tree[child].depth = d;
					for(Integer j : tree[child].children) queue.add(j);
					size--;
					if(size == 0) {size = queue.size();  d++;}
				}
				break;
			}
		}
		for(int i = 0; i < n; i++) {
			StringBuilder answ = new StringBuilder();
			answ.append("node ").append(i).append(": parent = ").append(tree[i].parent).append(", depth = ")
			.append(tree[i].depth).append(", ");
			if(tree[i].parent == -1) { answ.append("root, ["); } 
			else if(tree[i].children.size() > 0) { answ.append("internal node, ["); }
			else answ.append("leaf, [");
			int l = tree[i].children.size();
			if(l >= 1) {
				for(int j = 0; j < l - 1; j++) {
					answ.append(tree[i].children.get(j)).append(", ");
				}
				answ.append(tree[i].children.get(l - 1)).append("]");
			}else answ.append("]");
			System.out.println(answ);
		}
	}
}

