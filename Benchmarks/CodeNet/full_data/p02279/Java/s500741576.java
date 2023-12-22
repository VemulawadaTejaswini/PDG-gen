import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Node[] node = input();
		print(node);
	}
	
	public static Node[] input() throws NumberFormatException, IOException{
		//System.setIn(new FileInputStream("./input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Node[] node = new Node[n];
		for(int i = 0; i < n; ++i) {
			node[i] = new Node(i);
		}
		for(int i = 0; i < n; ++i) {
			// id = i
			String[] t = br.readLine().split(" ");
			int k = Integer.parseInt(t[1]);
			for(int j = 0; j < k; ++j) {
				int c = Integer.parseInt(t[j+2]);
				node[i].child.add(node[c]);
				node[c].parent = node[i];
			}
		}
		return node;
	}
	
	public static void print(Node[] node){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < node.length; ++i) {
			//node 0: parent = -1, depth = 0, root, [1, 4, 10]
			sb.append("node " + node[i].id);
			sb.append(": parent = " + node[i].parent.id);
			sb.append(", depth = " + node[i].getDepth());
			sb.append(", " + node[i].getType());
			sb.append(", [");
			int c = node[i].child.size();
			for(int j = 0; j < c; ++j) {
				if(j != 0){
					sb.append(", ");
				}
				sb.append(node[i].child.get(j).id);
			}
			sb.append("]\n");

		}
		System.out.print(sb);
	}
}

class Node {
	public int id;
	public Node parent;
	public ArrayList<Node> child = new ArrayList<Node>();
	public Node(int id){
		this.id = id;
		if(id != -1){
			parent = new Node(-1);
		}
	}

	public int getDepth(){
		if(parent.id == -1){
			return 0;
		}else{
			return parent.getDepth() + 1; 
		}
	}
	
	public String getType(){
		if(parent.id == -1){
			return "root";
		}else if(child.size() == 0){
			return "leaf";
		}else{
			return "internal node";
		}
		
	}
}