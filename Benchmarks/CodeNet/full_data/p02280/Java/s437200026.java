import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int n=Integer.parseInt(br.readLine());

	Node node[]=new Node[n];
        for(int i=0;i<n;i++){
	    node[i]=new Node(-1);
	}

	for(int i=0;i<n;i++){
	    String str[]=br.readLine().split(" ");
	    int id=Integer.parseInt(str[0]);
	    int left=Integer.parseInt(str[1]);
	    int right=Integer.parseInt(str[2]);
	    node[id].left=left;
	    node[id].right=right;

	    if(left!=-1)
		node[left].parent=id;
	    if(right!=-1)
		node[right].parent=id;
	}

	for(int i=0;i<n;i++){
	    System.out.print("node "+i+": ");
	    System.out.print("parent = "+node[i].parent+", ");
	    System.out.print("sibling = "+node[i].getSibling(node,i)+", ");
	    System.out.print("degree = "+node[i].getDegree()+", ");
	    System.out.print("depth = "+node[i].getDepth(node)+", ");
	    System.out.print("height = "+node[i].getHeight(node,i)+", ");
	    System.out.print(node[i].isType());
	    System.out.print("\n");
	}
    }
}
class Node{

    int parent;
    int left=-1;
    int right=-1;
    
    public Node(int parent){
	this.parent=parent;
    }
    public String isType(){
	if(parent==-1){
	    return "root";
	}else if(left==-1&&right==-1){
	    return "leaf";
	}else{
	    return "internal node";
	}
    }

    public int getSibling(Node node[],int id){
	if(parent==-1)
	    return -1;
	if(node[parent].left==id){
	    return node[parent].right;
	}else{
	    return node[parent].left;
	}
    }

    public int getDegree(){
	if(left==-1&&right==-1){
	    return 0;
	}else if((left!=-1&&right==-1)||(left==-1&&right!=-1)){
	    return 1;
	}else{
	    return 2;
	}
    }

    
    
    public int getDepth(Node node[]){
	int pID=parent;
	int count=0;
	while(pID!=-1){
	    pID=node[pID].parent;
	    count++;
	}
	return count;
    }

    public int getHeight(Node node[],int id){
	int Lheight=0;
	int Rheight=0;
	
	if(node[id].left==-1&&node[id].right==-1){
	    return 0;
	}else{
	    int l=node[id].left;
	    if(l!=-1){
		Lheight=getHeight(node,l)+1;
	    }
	    int r=node[id].right;
	    if(r!=-1){
		Rheight=getHeight(node,r)+1;
	    }
	}
	return Math.max(Lheight,Rheight);
    
    }
}

