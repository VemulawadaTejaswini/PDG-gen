import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Node{
	int id;
	Node left,right;
	
	public void display(){
		System.out.print(" "+id);
	}
}

class Tree{
	private Node root;
	public void insert(int id){
		Node newNode = new Node();
		newNode.id = id;
		if(root==null) 
			root = newNode;
		else{
			Node current = root;
			Node parent;
			while(true){
				parent = current;
				if(current.id>id){
					current = current.left;
					if(current == null){
						parent.left = newNode;
						return;
					}
				}else{
					current = current.right;
					if(current==null){
						parent.right = newNode;
					 	return;
					}
				}
			}
		}
	}
	
	public void inOrder(Node localRoot){
		if(localRoot!=null){
			inOrder(localRoot.left);
			localRoot.display();
			inOrder(localRoot.right);
		}
	}
	public void preOrder(Node localRoot){
		if(localRoot!=null){
			localRoot.display();
			preOrder(localRoot.left);
			preOrder(localRoot.right);
		}
	}
	public void print(){
		inOrder(root);
		System.out.println("");
		preOrder(root);
	}
}

public class Main {
	public static void main(String[] args) throws IOException{
		Tree tree = new Tree();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
			String[] s = br.readLine().split(" ");
			if(s[0].equals("insert"))
				tree.insert(Integer.parseInt(s[1]));
			else if(s[0].equals("print"))
				tree.print();
		}
		System.out.println("");
	}
}