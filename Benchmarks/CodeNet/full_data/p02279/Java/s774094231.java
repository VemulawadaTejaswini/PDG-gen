
import java.util.*;

public class Main{ 

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		//int numNode = scan.nextInt();
		Tree tree = new Tree(scan.nextInt());
		scan.nextLine();
		tree.connectNode(scan);
		//System.out.println("scan end");
		tree.setDepth();
		//System.out.println("depth end");
		tree.treeView();
	}

}
class Tree{
	int numNode;
	//HashMap<Integer, Node> nodes = new HashMap<Integer, Node>();
	ArrayList<Node> nodes = new ArrayList<Node>();
	public Tree(int n){
		this.numNode = n;
		for(int i=0; i<numNode; i++)
			nodes.add(new Node(i));	
	}
	public void connectNode(Scanner scan){
		for(int i=0; i<numNode; i++){
			//String line = scan.nextLine();
			//String[] splitLine = line.split(" ");
			int id = scan.nextInt();//Integer.parseInt(splitLine[0]);
			int numChild = scan.nextInt();//IInteger.parseInt(splitLine[1]);
			if(numChild == 0)
				continue;
			for(int j=0; j<numChild; j++){
				int childId = scan.nextInt();//IInteger.parseInt(splitLine[2+j]);
				nodes.get(id).setChild(childId);
				nodes.get(childId).setParent(id);
			}
		}
	}
	public int rootID(){
		for(int i=0; i<numNode; i++)
			if(nodes.get(i).parent==-1)
				return i;
		return 0;
	}
	public void setDepth(){
		setDepth(nodes.get(rootID()),0);
	}
	public void setDepth(Node n, int d ){
		n.setDepth(d);
		for(Iterator<Integer> iter = n.getChildren(); iter.hasNext();)
			setDepth(nodes.get(iter.next()), d+1);
	}
	public void treeView(){
		for(int i=0; i<numNode; i++)
			System.out.println(nodes.get(i));
	}

}

class Node{
	int id;
	int parent=-1;
	int depth=0;
	ArrayList<Integer> children = new ArrayList<Integer>();
	public Node(int id){
		this.id=id;
	}
	public void setParent(int p){
		this.parent = p;
	}
	public int getParent(){
		return this.parent;
	}
	public int getParentID(){
		return parent;
	}
	public void setChild(Integer c){
		children.add(c);
	}
	public Iterator<Integer> getChildren(){
		return children.iterator();
	}
	void setDepth(int d){
		//System.out.println("set depth : " + id);
		depth = d;
	}
	/*int getDepth(Node n){
		if(n.parent==-1)
			return 0;
		else
			return getDepth(n.parent)+1;
	}*/
	String getType(){
		if(parent==-1)
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
			result += children.get(i);
			if( i == children.size() - 1 )
				break;
			result += ", ";
		}
		return result.trim()+"]";
	}
	@Override
	public String toString(){
		StringBuilder temp = new StringBuilder();
		temp.append("node " + this.id);
		temp.append(": parent = " + getParentID());
		temp.append(", depth = " + depth);// + getDepth(this);//+ this.id;
		temp.append(", "  + getType());
		temp.append(", "   + childrenID());
		//node 1: parent = 0, depth = 1, internal node, [2, 3]
		return new String(temp);
		/*String result ="";
		result += "node " + this.id;
		result += ": parent = " + getParentID();
		result += ", depth = " + depth;// + getDepth(this);//+ this.id;
		result += ", "  + getType();
		result += ", "   + childrenID();
		//node 1: parent = 0, depth = 1, internal node, [2, 3]
		return result;*/
	}
}