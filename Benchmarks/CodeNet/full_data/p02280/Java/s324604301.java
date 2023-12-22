
import java.io.*;
import java.util.*;


public class Main{ 

	public static void main(String args[]){
		int nodes=0;
		Scanner scan = new Scanner(System.in);
		binaryTrees bt = new binaryTrees(nodes=scan.nextInt());
		for(int i=0; i<nodes;i++)
		bt.load(scan.nextInt(),scan.nextInt(),scan.nextInt());
		//bt.findParent();
		bt.show();

	}
}
class node{
	public int id;
	public int left;
	public int right;
	public int parent=-1;
	public int depth=0;
	public int height=-1;
	public int sibling=-1;
	public int degree=0;
	public String property="internal node";
	public void set(int i, int l, int r){
		id=i;
		left=l;
		right=r;
	}
}


class binaryTrees{
	node[]  tree;
	int rootID=-1;
	ArrayList<Integer> leafID = new ArrayList<Integer>();
	int numNodes=0;
	public binaryTrees(int x){
		tree =  new node[x];
		for(int i=0; i<x;i++)
			tree[i]=new node();
	}
	public void load(int i, int l, int r){
		tree[numNodes].set(i,l,r);
		if(l!=-1){
			tree[l].parent=numNodes;
			tree[numNodes].degree++;
		}
		if(r!=-1){
			tree[r].parent=numNodes;
			tree[numNodes].degree++;
		}
		if(l==-1&&r==-1){
			tree[numNodes].height=0;
			
		}
		numNodes++;
	}
	void findRoot(){
		for(int i=0; i<tree.length;i++)
			if(tree[i].parent==-1){
				rootID=i;
				break;
			}
	}
	void setDepth(){
		for(int i=0; i<tree.length;i++){
			int p=tree[i].parent;
			while(p!=-1){
				tree[i].depth++;
				p=tree[p].parent;
			}
		}
	}

	public void setHeight(){
		int h=0;
		while(true){
			for(int i=0; i<tree.length;i++){
				System.out.printf("id:%d parent:%d height:%d\n",i,tree[i].parent,tree[i].height);
				if(i!=rootID && tree[i].height==h && tree[tree[i].parent].height<h+1)
					tree[tree[i].parent].height=h+1;
			}
		if(tree[rootID].height>maxHeight())
			break;
		h++;
		}
	}
	
	int maxHeight(){
		int max=0;
		for(int i=0; i<tree.length;i++)
			if(i!=rootID && tree[i].height>max)
				max=tree[i].height;
		return max;
	}
	public void findSibling(){
		for(int i=0; i<tree.length;i++){
			for(int j=0; j<tree.length;j++)
				if(i!=j && tree[i].parent==tree[j].parent){
					tree[i].sibling=j;
					break;
				}
					
		}
	}
	public void setProperty(){
	tree[rootID].property="root";
		for(int i=0; i<tree.length;i++)
			if(tree[i].height==0)
				tree[i].property="leaf";
	}
	public void show(){
		setDepth();
		findRoot();
		findSibling();
		setHeight();
		findRoot();
		setProperty();
		for(int i=0; i<tree.length;i++)
		System.out.printf("node %d: parent = %d, sibling = %d, degree = %d, depth = %d, height = %d, %s\n",
		tree[i].id,tree[i].parent ,tree[i].sibling ,tree[i].degree ,
		tree[i].depth ,tree[i].height ,tree[i].property);
	}
}