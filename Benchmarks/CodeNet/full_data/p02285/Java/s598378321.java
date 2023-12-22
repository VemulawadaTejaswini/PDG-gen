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

	public Node search(Integer key) {
		Node p = root;
		while(p != null) {
			int result = key.compareTo(p.data);
			if(result == 0) {return p;}
			else if(result < 0) {p = p.left;}
			else {p = p.right;}
		}
		return null;
	}
	
	//二分探索木から要素を削除するメソッド
	////Javaプログラマのためのアルゴリズムとデータ構造 p.234参照
	public boolean delete(Integer key) {
		//まず根に注目する
		Node p = root;
		
		//parentは現在注目している節の親を指す
		Node parent = null;
		
		//pがparentの左の子ならtrue, 右の子ならfalse
		boolean isLeftChild = false;
		
		while(p != null) {
			
			//注目している節とキーを比較する
			int result = key.compareTo(p.data);
			//見つかった
			if(result == 0) {
				
				//葉である
				if(p.left == null && p.right == null) {
				
					//葉を削除する
					if(parent == null) {root = null;}
					else if(isLeftChild) {parent.left = null;}
					else {parent.right = null;}
					
					//右の子をのみを持つ
				}else if(p.left == null) {
					//右の子を親の子にする
					if(parent == null) {
						root = p.right;
					}else if(isLeftChild) {parent.left = p.right;}
					else {parent.right = p.right;}
					
					//左の子をのみを持つ
				}else if(p.right == null){
					//左の子を親の子にする
					if(parent == null) {root = p.left;}
					else if(isLeftChild) {parent.left = p.left;}
					else {parent.right = p.left;}
					
					//左右二つ子を持つ
				}else {
					
					//右部分木の最小の要素を取り除いて変数xに代入
					Node x = delMin(p, p.right);
					
					//注目している節に最小の要素xを入れる
					if(parent == null) {root = x;}
					else if(isLeftChild) {parent.left = x;}
					else {parent.right = x;}
					x.right = p.right;
					x.left = p.left;
				}
				//削除が成功した
				return true;
			
				//キーの方が小さければ左部分木に進む
			}else if(result < 0) {
				parent = p;
				isLeftChild = true;
				p = p.left;
				
				//キーの方が大きければ右部分木に進む
			}else {
				parent = p;
				isLeftChild = false;
				p = p.right;
			}
		}
		//削除対象が見つからなかった
		return false;
	}
	
	//二分探索木から最小の要素を削除するメソッド
	//Javaプログラマのためのアルゴリズムとデータ構造 p.239参照
	public static Node delMin(Node parent, Node p) {
		boolean isLeftChild = false;
		while(p.left != null) {
			parent = p;
			isLeftChild = true;
			p = p.left;
		}
		
		if(isLeftChild) {
			parent.left = p.right;
		}else {
			parent.right = p.right;
		}
		
		return p;
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
				output.append("\n");
			}else if(order.equals("find")) {
				number = sc.nextInt();
				if(search(number) == null) { output.append("no\n"); }
				else { output.append("yes\n"); }
			}else if(order.equals("delete")) {
				number = sc.nextInt();
				delete(number);
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
