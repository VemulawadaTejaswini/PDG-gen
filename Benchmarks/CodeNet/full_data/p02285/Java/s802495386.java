import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

	public static Node root = null;
	private static class Node {
		Node() {
			this.value = -1;
			this.leftNode = null;
			this.rightNode = null;
		}
		public int value;
		public Node leftNode;
		public Node rightNode;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Scanner s = new Scanner(System.in);
		int cnt = new Integer(br.readLine()).intValue();
		for(int i=0 ; i<cnt ; i++) {
			String[] tmp = br.readLine().split(" ");
			if("insert".equals(tmp[0])) {
				Node n = new Node();
				n.value = new Integer(tmp[1]).intValue();
				insert(n);
			}else if("find".equals(tmp[0])) {
				Node n = new Node();
				n.value = Integer.parseInt(tmp[1]);
				boolean result = find(n);
				if(result)
					System.out.println("yes");
				else
					System.out.println("no");
			}else if("delete".equals(tmp[0])) {
				Node n = new Node();
				n.value = Integer.parseInt(tmp[1]);
				delete(n);
			}
			else {
				inorder(root);
				System.out.println();
				preorder(root);
				System.out.println();
			}
		}
		if(br!=null) {
			br.close();
			br = null;
		}
	}

	public static void insert(Node node) {
		if(root==null){
			root = node;
			return;
		}
		Node targetNode = root;
		Node parent = null;
		while(targetNode != null) {
			parent = targetNode;
			if(targetNode.value > node.value)
				targetNode = targetNode.leftNode;
			else
				targetNode = targetNode.rightNode;
		}
		if(parent.value > node.value)
			parent.leftNode = node;
		else
			parent.rightNode = node;
	}

	public static boolean find(Node node) {
		if(root==null)
			return false;
		Node target = root;
		while(target!=null) {
			if(target.value==node.value)
				return true;
			else{
				if(target.value>node.value) {
					target = target.leftNode;
				}else{
					target = target.rightNode;
				}
			}
		}
		return false;
	}

	public static void delete(Node node) {
		if(root==null)
			return;
		Node parent = null;
		Node targetNode = root;
		Node leftNode = null;
		boolean isLeft = true;
		while(targetNode!=null) {
			if(targetNode.value == node.value) {
				break;
			}else {
				if(targetNode.value>node.value) {
					parent = targetNode;
					targetNode = targetNode.leftNode;
					isLeft = true;
				}else{
					parent = targetNode;
					targetNode = targetNode.rightNode;
					isLeft = false;
				}
			}
		}
		if(targetNode.leftNode!=null && targetNode.rightNode!=null) { //??????????±??????????????????????????????´???
			//??????????±?????????????????????¨?????¨????????§??????????????????
			int value = maxNode(leftNode);
			Node n = new Node();
			n.value = value;
			delete(n);
			targetNode.value = value;
		}else if((targetNode.leftNode!=null && targetNode.rightNode==null) || (targetNode.leftNode==null && targetNode.rightNode!=null)) {
			if(targetNode.leftNode==null) {
				if(isLeft){
					parent.leftNode = targetNode.rightNode;
				}else{
					parent.rightNode = targetNode.rightNode;
				}
				targetNode = null;
			}else {
				if(isLeft) {
					parent.leftNode = targetNode.leftNode;
				}else {
					parent.rightNode = targetNode.leftNode;
				}
				targetNode = null;
			}
		}else {
			if(isLeft){
				parent.leftNode = null;
			}else {
				parent.rightNode = null;
			}
		}
	}

	public static int maxNode(Node leftNode) {
		int leftV = Integer.MIN_VALUE;
		int rightV = Integer.MIN_VALUE;
		int selfV = leftNode.value;
		if(leftNode.leftNode!=null)
			leftV = maxNode(leftNode.leftNode);
		if(leftNode.rightNode!=null)
			rightV = maxNode(leftNode.rightNode);
		return Math.max(Math.max(leftV, rightV), selfV);

	}

	public static void preorder(Node root) {
		System.out.print(" " + root.value);
		if(root.leftNode != null)
			preorder(root.leftNode);
		if(root.rightNode != null)
			preorder(root.rightNode);
	}

	public static void inorder(Node root) {
		if(root.leftNode != null)
			inorder(root.leftNode);
		System.out.print(" " + root.value);
		if(root.rightNode != null)
			inorder(root.rightNode);
	}
}