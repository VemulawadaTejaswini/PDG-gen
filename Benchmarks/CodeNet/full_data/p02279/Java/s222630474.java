import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node[] nodes = new Node[n];
		for (int i = 0; i < n; i++) {
		    nodes[i] = new Node(i);
		}
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    int count = sc.nextInt();
		    for (int j = 0; j < count; j++) {
		        int y = sc.nextInt();
		        nodes[x].add(y);
		        nodes[y].parent = x;
		    }
		}
		for (Node x : nodes) {
		    if (x.parent == -1) {
		        set(nodes, x.idx, 0);
		        break;
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (Node x : nodes) {
		    sb.append(x).append("\n");
		}
		System.out.print(sb);
	}
	
	static void set(Node[] nodes, int idx, int depth) {
	    nodes[idx].depth = depth;
	    for (int x : nodes[idx].children) {
	        set(nodes, x, depth + 1);
	    }
	}
	
	static class Node {
	    int idx;
	    int parent;
	    int depth;
	    ArrayList<Integer> children;
	    
	    public Node(int idx) {
	        this.idx = idx;
	        parent = -1;
	        children = new ArrayList<>();
	    }
	    
	    public void add(int x) {
	        children.add(x);
	    }
	    
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("node ").append(idx).append(": parent = ");
	        sb.append(parent).append(", depth = ").append(depth).append(", ");
	        if (parent == -1) {
	            sb.append("root");
	        } else if (children.size() == 0) {
	            sb.append("leaf");
	        } else {
	            sb.append("internal node");
	        }
	        sb.append(", [");
	        for (int i = 0; i < children.size(); i++) {
	            if (i > 0) {
	                sb.append(", ");
	            }
	            sb.append(children.get(i));
	        }
	        sb.append("]");
	        return sb.toString();
	    }
	}
}

