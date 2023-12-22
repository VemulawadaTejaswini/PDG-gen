import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("./input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Node T = null;
		for(int i = 0; i < n; ++i) {
			String[] str = br.readLine().split(" ");
			if(str[0].equals("insert")){
				T = Node.insert(T, new Node(Integer.parseInt(str[1])));
			}else{
				System.out.print(' ');
				Node.inOrder(T);
				System.out.println();

				System.out.print(' ');
				Node.preOrder(T);
				System.out.println();
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
	public static void inOrder(Node z){
		if(z == null){
			return;
		}

		if(z.left != null){
			inOrder(z.left);
			System.out.print(' ');
		}
		System.out.print(z.key);
		if(z.right != null){
			System.out.print(' ');
			inOrder(z.right);
		}
		
	}
	public static void preOrder(Node z){
		if(z == null){
			return;
		}
		System.out.print(z.key);
		if(z.left != null){
			System.out.print(' ');
			preOrder(z.left);
		}
		if(z.right != null){
			System.out.print(' ');
			preOrder(z.right);
		}
	}
}