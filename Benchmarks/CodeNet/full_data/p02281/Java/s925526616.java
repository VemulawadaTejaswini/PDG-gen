import java.util.Scanner;


public class Main{

	static int[] parent;
	static int[] leftChild;
	static int[] rightChild;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = new Integer(s.nextLine()).intValue();
		parent = new int[cnt];
		leftChild = new int[cnt];
		rightChild = new int[cnt];
		for(int i=0 ; i<cnt ; i++) {
			parent[i] = -1;
			leftChild[i] = -1;
			rightChild[i] = -1;
		}
		for(int i=0 ; i<cnt ; i++) {
			String[] tmp = s.nextLine().split(" ");
			if(new Integer(tmp[1]).intValue()!=-1) {
				parent[new Integer(tmp[1]).intValue()] = new Integer(tmp[0]).intValue();
				leftChild[new Integer(tmp[0]).intValue()] = new Integer(tmp[1]).intValue();
			}
			if(new Integer(tmp[2]).intValue()!=-1) {
				parent[new Integer(tmp[2]).intValue()] = new Integer(tmp[0]).intValue();
				rightChild[new Integer(tmp[0]).intValue()] = new Integer(tmp[2]).intValue();
			}
		}
		int root = -1;
		for(int i=0 ; i<parent.length ; i++) {
			if(parent[i]==-1)
				root = i;
		}
		System.out.println("Preorder");
		preorder(root);
		System.out.println("");
		System.out.println("Inorder");
		inorder(root);
		System.out.println("");
		System.out.println("Postorder");
		postorder(root);
	}

	public static void preorder(int root) {
		System.out.print(" " + root);
		if(leftChild[root]!=-1)
			preorder(leftChild[root]);
		if(rightChild[root]!=-1)
			preorder(rightChild[root]);
	}

	public static void inorder(int root) {
		if(leftChild[root]!=-1)
			inorder(leftChild[root]);
		System.out.print(" " + root);
		if(rightChild[root]!=-1)
			inorder(rightChild[root]);

	}

	public static void postorder(int root) {
		if(leftChild[root]!=-1)
			postorder(leftChild[root]);
		if(rightChild[root]!=-1)
			postorder(rightChild[root]);
		System.out.print(" " + root);
	}
}