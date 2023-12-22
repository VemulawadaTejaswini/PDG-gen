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

		Node head = null;

		for(int i = 0; i < n; i++){
			String[] tmpArray = br.readLine().split(" ");
			String op = tmpArray[0];

			if(op.equals("insert")){
				int k = Integer.parseInt(tmpArray[1]);
				int p = Integer.parseInt(tmpArray[2]);

				head = insert(head, k, p);
//				System.out.println("insert");
				
//				System.out.println(head);
			}
			else if(op.equals("find")){
				int k = Integer.parseInt(tmpArray[1]);

				if(find(head, k)){
					System.out.println("yes");
				}
				else {
					System.out.println("no");
				}
			}
			else if(op.equals("delete")){
				int k = Integer.parseInt(tmpArray[1]);

				head = delete(head, k);
			}
			else {
				inorder(head);
				System.out.println();
				preorder(head);
				System.out.println();
			}
		}
	}

	static Node rightRotate(Node t){
		Node s = t.left;
		t.left = s.right;
		s.right = t;
		return s;
	}

	static Node leftRotate(Node t){
		Node s = t.right;
		t.right = s.left;
		s.left = t;
		return s;
	}

	static Node insert(Node t, int key, int priority){
		if(t == null){
			return new Node(key, priority);
		}

		if(key == t.key){
			return t;
		}

		if(key < t.key){
			t.left = insert(t.left, key, priority);

			if(t.priority < t.left.priority){
				t = rightRotate(t);
			}
		}

		else {
			t.right = insert(t.right, key, priority);
			if(t.priority < t.right.priority){
				t = leftRotate(t);
			}
		}

		return t;
	}

	static boolean find(Node head, int key){
		Node node = head;

		while(node != null){
			if(node.key == key){
				return true;
			}

			else if(node.key > key){
				node = node.left;
			}
			else {
				node = node.right;
			}
		}

		return false;
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


	static Node delete(Node t, int key){
		if(t == null){
			return null;
		}

		if(key < t.key){
			t.left = delete(t.left, key);
		}
		else if(key > t.key){
			t.right = delete(t.right, key);
		}
		else {
			return delete2(t, key);
		}

		return t;
	}

	static Node delete2(Node t, int key){
		if(t.left == null && t.right == null){
			return null;
		}

		else if(t.left == null){
			t = leftRotate(t);
		}
		else if(t.right == null){
			t = rightRotate(t);
		}
		else {
			if(t.left.priority > t.right.priority){
				t = rightRotate(t);
			}
			else {
				t = leftRotate(t);
			}
		}
		return delete(t, key);
	}
}

class Node {
	Node left;
	Node right;
	int key;
	int priority;

	Node(int key, int priority){
		this.key = key;
		this.priority = priority;
	}
}
