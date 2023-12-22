import java.util.*;

class Node{
	int key;
	int parent = -1;
	int left = -1;
	int right = -1;

	public Node(int key){
		this.key = key;
	}

	public int getDegree(){
		int d = 2;
		if(this.left == -1)
			d--;
		if(this.right == -1)
			d--;
		return d;
	}
}

class Tree{
	Node[] nodes;
	int root = -1;

	public Tree(int n){
		nodes = new Node[n]; // Node???????????????
	}

	public void delete(int key){
		int x;
		if((x = find(root, key)) != -1)
			delete(x, key);
	}
	private void delete(int x, int key){
		if(nodes[x].getDegree() == 0){
			if(root == x)
				root = -1;
			else if(nodes[nodes[x].parent].left == x) // x???left??????
				nodes[nodes[x].parent].left = -1;
			else
				nodes[nodes[x].parent].right = -1;
		}else if(nodes[x].getDegree() == 1){
			int c;
			if(nodes[x].left == -1)
				c = nodes[x].right;
			else
				c = nodes[x].left;

			if(root == x)
				root = c;
			else if(nodes[nodes[x].parent].left == x)
				nodes[nodes[x].parent].left = c;
			else
				nodes[nodes[x].parent].right = c;

			nodes[c].parent = nodes[x].parent;
		}else{
			int c = leftIn(nodes[x].right);
			nodes[x].key = nodes[c].key;
			delete(c, nodes[c].key);
		}
	}
	private int leftIn(int x){
		if(nodes[x].left == -1)
			return x;
		else
			return leftIn(nodes[x].left);
	}

	public void find(int key){
		if(find(root, key) == -1)
			System.out.println("no");
		else
			System.out.println("yes");
	}
	private int find(int x, int key){
		if(x == -1)
			return -1;
		else if(nodes[x].key == key)
			return x;
		else if(key < nodes[x].key)
			return find(nodes[x].left, key);
		else
			return find(nodes[x].right, key);
	}

	public void printPreorder(){
		printPre(root);
		System.out.println();
	}
	private void printPre(int id){
		if(id == -1)
			return;
		System.out.print(" " + nodes[id].key);
		printPre(nodes[id].left);
		printPre(nodes[id].right);
	}

	public void printInorder(){
		printIn(root);
		System.out.println();
	}
	private void printIn(int id){
		if(id == -1)
			return;
		printIn(nodes[id].left);
		System.out.print(" " + nodes[id].key);
		printIn(nodes[id].right);
	}

	public void insert(int i, int key){
		nodes[i] = new Node(key);
		insert(i);
	}
	private void insert(int z){
		int y = -1;
		int x = root;
		while(x != -1){
			y = x;
			if(nodes[z].key < nodes[x].key)
				x = nodes[x].left;
			else
				x = nodes[x].right;
		}
		nodes[z].parent = y;

		if(y == -1)
			root = z;
		else if(nodes[z].key < nodes[y].key)
			nodes[y].left = z;
		else
			nodes[y].right = z;
	}
}

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Tree t = new Tree(n);

		for(int i = 0; i < n; i++){
			String s = scan.next();
			if(s.equals("insert"))
				t.insert(i, scan.nextInt());
			else if(s.equals("find"))
				t.find(scan.nextInt());
			else if(s.equals("delete"))
				t.delete(scan.nextInt());
			else{
				t.printInorder();
				t.printPreorder();
			}
		}

		scan.close();
		System.exit(0);
	}
}