
import java.util.*;


public class Main{ 

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int operationNum = scan.nextInt();
		BinarySearchTree tree = new BinarySearchTree();
		scan.nextLine();
		for(int i=0; i<operationNum; i++)
			tree.operation(scan.nextLine());
		// ArrayList<BinarySearchTreeNode> list = 
		//  tree.inOrderConnect(new ArrayList<BinarySearchTreeNode>());

	}

}
class BinarySearchTree{
	private BinarySearchTreeNode root=null;
	public BinarySearchTree(){
		//root = new BinarySearchTreeNode();
	}
	public void operation(String code){
		if(code.equals("print"))
			print();
		else{
			String[] key = code.split(" ");
			insert(Integer.parseInt(key[1]));		
		}

	}
	public void insert(int key){
		if(root==null)
			root = new BinarySearchTreeNode(key);
		else
			root.insertNode(key);
	}
	public void print(){
		keyOrderToString(this.root.inOrderConnect(new ArrayList<BinarySearchTreeNode>()));
		keyOrderToString(this.root.preOrderConnect(new ArrayList<BinarySearchTreeNode>()));
	}
	private void keyOrderToString(ArrayList<BinarySearchTreeNode> list){
		// StringBuilder temp = new StringBuilder();
		// for(Iterator<BinarySearchTreeNode> iter = list.iterator(); iter.hasNext();)
		// 	temp.append(" "+iter.next().getKey());
		// System.out.println(new String(temp));
		for(Iterator<BinarySearchTreeNode> iter = list.iterator(); iter.hasNext();)
			System.out.print( new StringBuilder().append(" ").append(iter.next().getKey()));
		System.out.println("");	
	}

}



class BinarySearchTreeNode{
	protected int key;
	protected BinarySearchTreeNode parent = null;
	protected ArrayList<BinarySearchTreeNode> children = new ArrayList<BinarySearchTreeNode>();
	protected BinarySearchTreeNode LeftChild = null;
	protected BinarySearchTreeNode RightChild = null;
	public BinarySearchTreeNode(int key){
		this.key = key;
	}
	public BinarySearchTreeNode(int key, BinarySearchTreeNode parent){
		this.key = key;
		this.parent = parent;
	}
	void insertNode(int key){
/*		if(this.parent == null && this.LeftChild ==null && this.RightChild == null){
			this.key = key;
			System.out.println("root");
			this.parent = this;
			return;
		}else */
		if(key < this.key){
			if(this.LeftChild ==null)
				this.LeftChild = new BinarySearchTreeNode(key, this);
			else
				this.LeftChild.insertNode(key);
			return;
		}else{
			if(this.RightChild ==null)
				this.RightChild = new BinarySearchTreeNode(key, this);
			else
				this.RightChild.insertNode(key);
			return;
		}
	}
	public ArrayList<BinarySearchTreeNode> preOrderConnect(ArrayList<BinarySearchTreeNode> list){
		list.add(this);
		if(LeftChild!=null)
			LeftChild.preOrderConnect(list);
		if(RightChild!=null)
			RightChild.preOrderConnect(list);
		return list;
	}
	public ArrayList<BinarySearchTreeNode> inOrderConnect(ArrayList<BinarySearchTreeNode> list){
		if(LeftChild!=null)
			LeftChild.inOrderConnect(list);
		list.add(this);
		if(RightChild!=null)
			RightChild.inOrderConnect(list);
		return list;
	}	
	public int getKey(){
		return this.key;
	}

}