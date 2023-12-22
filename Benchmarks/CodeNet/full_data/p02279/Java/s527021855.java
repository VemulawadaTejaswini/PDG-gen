import java.util.*;
import java.io.*;

class Main {

	static Node[] node = null;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		node = new Node[n];

		for (int i=0; i<n; i++) {
			node[i] = new Node();
		}

		for (int i=0; i<n; i++) {
			String line = br.readLine();
			String[] str = line.split(" ");
			int id = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			node[id].child = new int[k];
			for (int j=0; j<k; j++) {
				int c = node[id].child[j] = Integer.parseInt(str[j+2]);
				node[c].parent = id;
			}
		}

		for (int i=0; i<n; i++) {
			if (node[i].parent == -1) {
				set(node[i],0);
				break;
			}
		}

		for (int i=0; i<n; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append("node ").append(i).append(": parent = ").append(node[i].parent);
			sb.append(", depth = ").append(node[i].depth).append(", ").append(node[i].type).append(", [");
			for (int j=0; j<node[i].child.length; j++) {
				sb.append(node[i].child[j]);
				if (j < node[i].child.length - 1)
					sb.append(", ");
			}
			sb.append("]");
			System.out.println(sb);
		}

		br.close();
	}

	static void set(Node nd,int depth){
		nd.depth = depth;

		if (nd.child.length == 0) {
			nd.type = "leaf";
			return;
		}else if(depth != 0) {
			nd.type = "internal node";
		}

		for (int i=0; i<nd.child.length; i++) {
			set(node[nd.child[i]],depth+1);
		}
	}

	static class Node{
		int parent = -1;
		int depth = 0;
		String type = "root";
		int[] child = null;
	}
}