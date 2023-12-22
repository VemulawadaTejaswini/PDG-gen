import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Node T = null;
		for(int i = 0; i < n; ++i) {
			String[] str = br.readLine().split(" ");
			if(str[0].equals("insert")){
				T = Node.insert(T, new Node(Integer.parseInt(str[1])));
			}else{
				System.out.println(" " + Node.strInOrder(T));
				System.out.println(" " + Node.strPreOrder(T));
			}
		}
	
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
	public static Node insert(Node T, Node z){
		Node y = null;
		Node x = T;
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
			T = z;
		}else if(z.key < y.key){
			y.left = z;
		}else{
			y.right = z;
		}
		return T;
	}
	public static String strInOrder(Node z){
		StringBuilder sb = new StringBuilder();
		if(z == null){
			return "";
		}
		if(z.left != null){
			sb.append(strInOrder(z.left));
			sb.append(' ');
		}
		sb.append(z.key);
		if(z.right != null){
			sb.append(' ');
			sb.append(strInOrder(z.right));
		}
		return sb.toString(); 
	}
	public static String strPreOrder(Node z){
		StringBuilder sb = new StringBuilder();
		if(z == null){
			return "";
		}
		sb.append(z.key);
		if(z.left != null){
			sb.append(' ');
			sb.append(strPreOrder(z.left));
		}
		if(z.right != null){
			sb.append(' ');
			sb.append(strPreOrder(z.right));
		}
		return sb.toString(); 
	}
}