
import java.util.*;

public class Main{ 

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		//int numNode = scan.nextInt();
		TreeNodeData data = new TreeNodeData(scan.nextInt());
		//scan.nextLine();
		data.readNodeData(scan);
		Root root = data.getNodeList();
		ArrayList<AbstractNode> tree = root.connectTree();
		Collections.sort(tree);
		for(int i=0; i<tree.size();i++)
			System.out.println(tree.get(i));
		//Tree tree = new Tree(data.getNodeList());
		//tree.connectNode();
		//.out.println("scan end");
		//tree.treeView();
	}

}
class NodeData{

	private int numChild;
	private ArrayList<Integer> children;
	public NodeData(int n){
		numChild = n;
		children = new ArrayList<Integer>();
	}
	public void addChild(int c){
		children.add(c);
	}
	public boolean isLeaf(){
		return (children.size()==0);
	}
	public Iterator<Integer> getChildren(){
		return children.iterator();
	}
}
/*class Tree{
	int numNode;
	ArrayList<AbstractNode> tree = new ArrayList<AbstractNode>();
	HashMap<Integer, NodeData> nodeData;
	public Tree(HashMap<Integer, NodeData> nodeData){
		this.nodeData = nodeData;
		numNode = nodeData.size();
		for(int i =0; i<numNode ;i++ ){
			if(nodeData.get(i).isLeaf())
				tree.add(new Leaf(i, nodeData));
			else
				tree.add(new InternalNode(i, nodeData));
		}
	}
	public void connectNode(){
		for(int i=0; i<numNode; i++){
			for(Iterator<Integer> iter = nodeData.get(i).getChildren(); iter.hasNext();){
				int childId = iter.next();
				tree.get(i).addChild(tree.get(childId));
				tree.get(childId).setParent(tree.get(i));
			}
		}
	}
	public void treeView(){
		for(int i=0; i<numNode; i++)
			System.out.println(tree.get(i));
	}
}*/
class TreeNodeData{
	int numNode;
	private HashMap<Integer, NodeData> nodeData = new HashMap<Integer, NodeData>();
	public TreeNodeData(int n){
		this.numNode = n;	
	}

	public void readNodeData(Scanner scan){
		for(int i=0; i<numNode; i++){
			int id = scan.nextInt();
			int numChild = scan.nextInt();
			NodeData data = new NodeData(numChild);
			for(int j=0; j<numChild; j++){
				int childID = scan.nextInt();
				data.addChild(childID);
			}
			nodeData.put(id, data);
		}

	}
	private int rootID(){
		ArrayList<Integer> notParent = new ArrayList<Integer>();
		for(int i=0; i<numNode; i++)
			for(Iterator<Integer> iter = nodeData.get(i).getChildren(); iter.hasNext();)
				notParent.add(iter.next());
		for(int i=0; i<numNode; i++)
			if(!notParent.contains(i))
				return i;
		return -1;
	}
	public Root getNodeList(){
		return new Root(rootID(), nodeData);	
	}
}


class Leaf extends AbstractNode{
	public Leaf(int n, HashMap<Integer, NodeData> nodeData){
		super(n, nodeData);
	}
	@Override 
	public void addChild(AbstractNode c){
		return;
	}
	@Override 
	String getType(){
			return "leaf";
	}
	@Override 
	public int getDepth(){//(AbstractNode n){
			return parent.getDepth()+1;
	}
	@Override 
	public int getParentID(){
		return parent.getID();
	}
}
class Root extends AbstractNode{
	public Root(int n, HashMap<Integer, NodeData> nodeData){
		super(n, nodeData);
	}
	@Override 
	public void addChild(AbstractNode c){
		children.add(c);
	}
	@Override 
	public int getDepth(){
		return 0;
	}
	@Override 
	String getType(){
			return "root";
	}
	@Override 
	public int getParentID(){
		return -1;
	}
}
class InternalNode extends AbstractNode{
	public InternalNode(int n, HashMap<Integer, NodeData> nodeData){
		super(n, nodeData);
	}
	@Override 
	public void addChild(AbstractNode c){
		children.add(c);
	}
	@Override 
	int getDepth(){//(AbstractNode n){
			return parent.getDepth()+1;
	}
	@Override 
	String getType(){
			return "internal node";
	}
	@Override 
	public int getParentID(){
		return parent.getID();
	}
}
abstract class AbstractNode implements Comparable<AbstractNode>{
	protected int id;
	protected AbstractNode parent;
	protected ArrayList<AbstractNode> children = new ArrayList<AbstractNode>();
	abstract public void addChild(AbstractNode c);
	abstract int getDepth();
	abstract String getType();
	abstract public int getParentID();
	public AbstractNode(int id, HashMap<Integer, NodeData> nodeData){
		this.id = id;
		if(nodeData.get(id).isLeaf())
			return;
		for(Iterator<Integer> iter = nodeData.get(id).getChildren(); iter.hasNext();){
			int childId = iter.next();
			if(nodeData.get(childId).isLeaf()){
				Leaf temp = new Leaf(childId, nodeData);
				temp.setParent(this);
				this.addChild(temp);
			}else{
				InternalNode temp = new InternalNode(childId, nodeData);
				temp.setParent(this);
				this.addChild(temp);
			}
		}
	}
	public int getID(){
		return id;
	}
	public void setParent(AbstractNode p){
		this.parent = p;
	}
	String childrenID(){
		StringBuilder temp = new StringBuilder();
		temp.append("[");
		if(children.size()>0)
		for(int i=0; ; i++){
			temp.append(children.get(i).getID());
			if( i == children.size() - 1 )
				break;
			temp.append(", ");
		}
		temp.append("]");
		return new String(temp);
	}
	public void nodeInfomation(){
		System.out.println(this);
		for(int i=0; i< children.size();i++)
			children.get(i).nodeInfomation();
	}
	public ArrayList<AbstractNode> connectTree(){
		ArrayList<AbstractNode> temp = new ArrayList<AbstractNode>();
		temp.add(this);
		for(int i=0; i< children.size();i++)
			temp.addAll(children.get(i).connectTree());
		return 	temp;
	}
	@Override
	public String toString(){
		StringBuilder temp = new StringBuilder();
		temp.append("node " + this.id);
		temp.append(": parent = " + getParentID());
		temp.append(", depth = " + getDepth());
		temp.append(", "  + getType());
		temp.append(", "   + childrenID());
		return new String(temp);
	}
	@Override
 	public int compareTo(AbstractNode temp) {
		return this.id - temp.getID();
	}
}