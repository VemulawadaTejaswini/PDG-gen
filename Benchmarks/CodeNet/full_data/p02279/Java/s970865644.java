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
	    int k=Integer.parseInt(str[1]);

	    for(int j=0;j<k;j++){
		int c=Integer.parseInt(str[j+2]);
		node[id].add(c);
		node[c].parent=id;
	    }
	}

	for(int i=0;i<n;i++){
	    System.out.println("node "+i+": parent = "+node[i].parent+", depth = "+node[i].getDepth(node)+", "+node[i].isType()+", "+node[i].child);
	}
    }
}
class Node{

    int parent;
    ArrayList<Integer> child=new ArrayList<>();
    
    public Node(int parent){
	this.parent=parent;
    }
    public void add(int id){
	child.add(id);
    }
    public String isType(){
	if(parent==-1){
	    return "root";
	}else if(child.size()==0){
	    return "leaf";
	}else{
	    return "internal node";
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
}

