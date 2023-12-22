
import java.util.*;

public class Main{ 

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		//int numNode = scan.nextInt();
		Tree tree = new Tree(scan.nextInt());
		scan.nextLine();
		tree.connectNode(scan);
		tree.treeView();
	}

}
class Tree{
	int numNode;
	HashMap<Integer, Node> nodes = new HashMap<Integer, Node>();
	public Tree(int n){
		this.numNode = n;
		for(int i=0; i<numNode; i++)
			nodes.put(i, new Node(i));	
	}
	public void connectNode(Scanner scan){
		for(int i=0; i<numNode; i++){
			String line = scan.nextLine();
			String[] splitLine = line.split(" ");
			int id = Integer.parseInt(splitLine[0]);
			int numChild = Integer.parseInt(splitLine[1]);
			if(numChild == 0)
				continue;
			for(int j=0; j<numChild; j++){
				int childId = Integer.parseInt(splitLine[2+j]);
				nodes.get(id).setChild(nodes.get(childId));
				nodes.get(childId).setParent(nodes.get(id));
			}
		}
	}
	public void treeView(){
		for(int i=0; i<numNode; i++)
			System.out.println(nodes.get(i));
	}

}

interface INode{
	INode getParent();
	//ArrayList<INode> getChild();
	//String getNodeType();
	//integer getDepth();
}
class Node{
	int id;
	Node parent;
	ArrayList<Node> children = new ArrayList<Node>();
	public Node(int id){
		this.id=id;
	}
	public void setParent(Node p){
		this.parent = p;
	}
	public Node getParent(){
		return this.parent;
	}
	public int getParentID(){
		return (parent==null)? -1 : parent.id;
	}
	public void setChild(Node c){
		children.add(c);
	}
	public Iterator<Node> getChildren(){
		return children.iterator();
	}
	int getDepth(Node n){
		if(n.parent==null)
			return 0;
		else
			return getDepth(n.parent)+1;
	}
	String getType(){
		if(parent==null)
			return "root";
		else if(children.size()==0)
			return "leaf";
		else
			return "internal node";
	}
	String childrenID(){
		String result ="[";
		if(children.size()>0)
		for(int i=0; ; i++){
			result += children.get(i).id;
			if( i == children.size() - 1 )
				break;
			result += ", ";
		}
		return result.trim()+"]";
	}
	@Override
	public String toString(){
		String result ="";
		result += "node " + this.id;
		result += ": parent = " + getParentID();
		result += ", depth = " + getDepth(this);//+ this.id;
		result += ", "  + getType();
		result += ", "   + childrenID();
		//node 1: parent = 0, depth = 1, internal node, [2, 3]
		return result;
	}
}
/*
class Selection extends SortStrategy{
	public Selection(int n){
		super(n);
	}
	@Override
	public ArrayList<Integer> sort(){

}*/
class SortContext{
	SortStrategy strategy;
	ArrayList<Integer> seq = new ArrayList<Integer>();
	int seqLength;
	public SortContext(int length, SortStrategy s){
		seqLength = length;
		this.strategy = s;
	}
	public void readSequence(Scanner scan){
		for(int i=0; i<seqLength; i++)
			seq.add(scan.nextInt());
	}
	public String toString(){
		String tmp = "";
		for(Iterator<Integer> iter = strategy.sort(seq); iter.hasNext();)
			tmp += iter.next() + " ";
		return tmp.trim();
	}
	public int swapTimes(){
		return strategy.getSwapTimes();
	}
}