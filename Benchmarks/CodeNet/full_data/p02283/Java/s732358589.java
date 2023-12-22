import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Tree tree = new Tree();
		for(int i = 0; i < n; i++){
			String[] tmpArray = br.readLine().split(" ");
			if(tmpArray[0].equals("insert")){
				Node node = new Node(Integer.parseInt(tmpArray[1]), null, null);
				tree.insert(node);
			}
			else {
				inorder(tree.root);
				System.out.println();
				preorder(tree.root);
				System.out.println();
			}
		}
	}

	static void preorder(Node node){
		System.out.print(" "+node.key);
		if(node.left != null){
			preorder(node.left);
		}
		if(node.right != null){
			preorder(node.right);
		}
	}
	
	static void inorder(Node node){
		if(node.left != null){
			inorder(node.left);
		}
		System.out.print(" "+node.key);
		if(node.right != null){
			inorder(node.right);
		}
	}
	
}

class Tree {
	Node root = null;
	
	public Tree(){
		
	}
	public Tree(Node root){
		this.root = root;
	}
	
	public void insert (Node node){
		Node y = null;
		Node x = this.root;
		while(x != null){
			y = x;
			if( node.key < x.key){
				x = x.left;
			}
			else{
				x = x.right;
			}
		}
		node.parent = y;
		
		if (y == null){
			this.root = node;
		}
		else if(node.key < y.key){
			y.left = node;
		}
		else {
			y.right = node;
		}
	}
}

class Node {
	int key;
	Node left = null;
	Node right = null;
	Node parent = null;
	
	public Node(int key, Node left, Node right){
		this.key = key;
		this.left = left;
		this.right = right;
	}
}