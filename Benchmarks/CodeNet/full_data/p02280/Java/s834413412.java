import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int numNodes = scan.nextInt();
		TempNodeData tempNodeData = new TempNodeData(scan);
		Root root = new Root(tempNodeData);
		Iterator<AbsNode> iter = root.treeIter();
		while(iter.hasNext())
			System.out.println(iter.next());
	}
}
abstract class AbsNode implements Comparable<Object>{
	int id;
	int height = -1;
	AbsNode parent= null;
	AbsNode left=null;
	AbsNode right=null;
	public AbsNode(){
		left=null;
		right=null;
	}
	public AbsNode(TempNodeData data, int id){
		this.id = id;
		int leftID = data.getLeftNodeID(id);
		if(leftID != -1)
		this.left = (!data.isLeaf(leftID))?
			new Node(data, leftID, this) : new Leaf(leftID, this);
		else
			this.left = new NullNode();
			
		int rightID = data.getRightNodeID(id);
		if(rightID != -1)
		this.right = (!data.isLeaf(rightID))?
			new Node(data, rightID, this) : new Leaf(rightID, this);
		else
			this.right = new NullNode();
	}
	@Override
	public int compareTo(Object other) {
		AbsNode n = (AbsNode) other;
		return this.id - n.id; 
	}
	public int getHeight(){
		int	leftHeight = left.getHeight() + 1;
		int	rightHeight = right.getHeight() + 1;
		return leftHeight > rightHeight ? leftHeight : rightHeight;
	}
	boolean isNull(){
		return false;
	}
	int getDegree(){
		return (left.isNull()?0:1) + 
				(right.isNull()?0:1);
	}
	int getParentID(){
			return parent.id;
	}
	public int getSiblingID(){
		return parent.getSiblingID(this.id);
	}
	public int getSiblingID(int id){
		return (left.id == id)?
				right.id : left.id;
	}
	int getDepth(){
		return parent.getDepth()+1;
	}
	public void treeIter(ArrayList<AbsNode> tree){
			left.treeIter(tree);
			right.treeIter(tree);
			tree.add(this);
	}
	public Iterator<AbsNode> treeIter(){
		ArrayList<AbsNode> tree = new ArrayList<AbsNode>();
		treeIter(tree);
		Collections.sort(tree);
		return tree.iterator();
	}
	abstract String getType();
	@Override
	public String toString(){
		String tmp = "";
		tmp += "node " + id;
			tmp += ": parent = " + getParentID();
			tmp += ", sibling = " + getSiblingID();
		tmp += ", degree = " + getDegree();
		tmp += ", depth = " + getDepth();
		tmp += ", height = "+ getHeight();
		tmp += ", " + getType();
		return tmp;
	}
}
class NullNode extends AbsNode{
	public NullNode(){
		super();
		id = -1;
	}
	boolean isNull(){
		return true;
	}
	@Override
	public int getHeight(){
		return -1;
	}
	@Override
	public void treeIter(ArrayList<AbsNode> tree){
	}
	@Override
	String getType(){
		return "";
	}
	int getDegree(){
		return 0;
	}
}
class Leaf extends AbsNode{
	public Leaf(int id, AbsNode p){
		super();
		this.id = id;
		parent = p;
	}
	@Override
	public int getHeight(){
		return 0;
	}
	@Override
	public void treeIter(ArrayList<AbsNode> tree){
		tree.add(this);
	}
	@Override
	String getType(){
			return "leaf";
	}
	int getDegree(){
		return 0;
	}
}
class Root extends AbsNode{
	public Root(TempNodeData data){
		super(data, data.keyOfRoot());
	}
	@Override
	int getParentID(){
		return -1;
	}
	@Override
	public int getSiblingID(){
			return -1;
	}
	@Override
	String getType(){
			return "root";
	}
	@Override
	int getDepth(){
		return 0;
	}
}
class Node extends AbsNode{
	public Node(TempNodeData data, int id, AbsNode p){
		super(data,id);
		parent = p;
	}
	@Override
	String getType(){
			return "internal node";
	}

}
class TempNodeData{
	HashMap<Integer,Integer> mapLeftID = new HashMap<Integer,Integer>();
	HashMap<Integer,Integer> mapRightID = new HashMap<Integer,Integer>();
	public TempNodeData(Scanner scan){
		while(scan.hasNext()){
			int key = scan.nextInt();
			mapLeftID.put(key,scan.nextInt());
			mapRightID.put(key,scan.nextInt());
		}
	}
	public int keyOfRoot(){
		int index = 0;
		for(int i=0; i<mapLeftID.size(); i++)
			if(!mapLeftID.containsValue(i) && !mapRightID.containsValue(i)){
				index = i;
				break;
			}
		return index;
	}
	public int getLeftNodeID(int nodeID){
		return mapLeftID.get(nodeID);
	}
	public int getRightNodeID(int nodeID){
		return mapRightID.get(nodeID);
	}
	boolean isLeaf(int nodeID){
		return (mapLeftID.get(nodeID) == -1 && mapRightID.get(nodeID) == -1);
	}
}
class NodeData{
	public Integer id;
	public int left;
	public int right;
	public NodeData(int i, int r, int l){
		id = i;
		right = r;
		left = l;
	}
	public boolean isLeaf(){
		return (left==-1 && right == -1);
	}

}