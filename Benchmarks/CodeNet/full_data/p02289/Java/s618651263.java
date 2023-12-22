import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		String in;
		Node[] T = new Node[1];
		while(true){
			in = br.readLine();
			if(in.startsWith("i")) {
				// insert
				Node.insert(T, Integer.parseInt(in.substring(7)));
			}else if(in.startsWith("ex")) {
				// extract
				sb.append(Node.extract(T) + "\n");
			}else{
				// end
				break;
			}
		}
		System.out.print(sb);
	}
}

class Node{
	public int key;
	public Node left;
	public Node right;
	public Node p;
	public Node(int key){
		this.key = key;
	}
	public static void insert(Node[] T, int key){
		Node z = new Node(key);
		Node y = null;
		Node x = T[0];
		while(x != null){
			y = x;
			if(z.key < x.key){
				x = x.left;
			}else{
				x = x.right;
			}
		}
		z.p = y;
		
		if(y == null){
			T[0] = z;
		}else if(z.key < y.key){
			y.left = z;
		}else{
			y.right = z;
		}
	}
	public static int extract(Node[] T){
		Node z = T[0];
		Node y = null;
		while(z != null){
			y = z;
			z = z.right;
		}
		z = y;
		
		if(z.left == null || z.right == null){
			// case 1, 2
			Node c = null;
			if(z.left != null){
				c = z.left;
				c.p = z.p;
			}else if(z.right != null){
				c = z.right;
				c.p = z.p;
			}
			if(z.p != null) {
				if(z.p.left == z){
					z.p.left = c;
				}else{
					z.p.right = c;
				}
			}else{
				T[0] = c;
			}
		}else{
			// case 3
			Node n = z.right;
			while(n.left != null){
				n = n.left;
			}
			z.key = n.key;
			if(n.right == null){
				// case 1
				if(n.p.left == n){
					n.p.left = null;
				}else{
					n.p.right = null;
				}
			}else{
				// case 2
				n.p.left = n.right;
				n.right.p = n.p;
			}
		}
		return z.key;
	}
}