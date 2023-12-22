import java.util.*;
class Node{
	Integer data;
	Node left;
	Node right;
	Node(Integer data){
		left = null;
		right = null;
		this.data = data;
	}
}
public class Main{
	Scanner sc = new Scanner(System.in);
	StringBuilder output = new StringBuilder();
	private static Node root;
	int m;
	String order;
	int[] T;
	int number;
	public Main() {
		root = null;
	}
	public Node insert(Integer key) {
		Node p = root;
		Node parent = null;
		boolean isLeftChild = false;
		while(p != null) {
			int result = key.compareTo(p.data);
			if(result == 0) {
				return null;
			}else if(result < 0) {
				parent = p;
				isLeftChild = true;
				p = p.left;
			}else {
				parent = p;
				isLeftChild = false;
				p = p.right;
			}
		}
		Node newNode = new Node(key);
		if(parent == null) {
			root = newNode;
		}else if(isLeftChild) {
			parent.left = newNode;
		}else {
			parent.right = newNode;
		}
		return newNode;
	}
	
	//二分探索木からkeyをもつ節を探索するメソッド
	//Javaプログラマのためのアルゴリズムとデータ構造 p.224参照
	public Node search(Integer key) {
		//まず根に注目する
		Node p = root;
		
		//注目している節がある限り繰り返し処理を行う
		while(p != null) {
			
			//注目している節とkeyを比較する
			int result = key.compareTo(p.data);
			
			//節とkeyが等しい
			if(result == 0) {
				return p;
				
			//keyの方が小さいときは左分木に進む
			}else if(result < 0) {
				p = p.left;
				
			//keyの方が大きいときは右分木に進む
			}else {
				p = p.right;
			}
		}
		//探索に失敗したらnullを返す
		return null;
	}
	public void input() {
		m = sc.nextInt();
		T = new int[m];
		for(int i=0; i<m; i++) {
			order = sc.next();
			if(order.equals("print")) {
				inorder(root);
				output.append("\n");
				preorder(root);
			}else if(order.equals("find")) {
				number = sc.nextInt();
				if(search(number) == null) { output.append("no\n"); }
				else { output.append("yes\n"); }
			}else {
				T[i] = sc.nextInt();
				insert(T[i]);
			}
		}
		System.out.print( output.toString() );
	}
	public void inorder(Node p) {
		if(p == null) {
			return;
		}else {
			inorder(p.left);
			output.append(" "+p.data);
			inorder(p.right);
		}
	}
	public void preorder(Node p) {
		if(p == null) {
			return;
		}else {
			output.append(" "+p.data);
			preorder(p.left);
			preorder(p.right);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
	}
}
