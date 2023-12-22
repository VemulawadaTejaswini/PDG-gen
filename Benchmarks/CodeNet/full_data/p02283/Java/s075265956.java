import java.io.*;
import java.util.*;

public class Main{

    static Node root;
    
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int n=Integer.parseInt(br.readLine());

	for(int i=0;i<n;i++){
	    String str[]=br.readLine().split(" ");
	    
	    if(str[0].equals("insert")){
		int x=Integer.parseInt(str[1]);
		insert(x);
	    }else{
		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
	    }
	}
    }
    
    static void insert(int key) {
	Node y = null;
	Node x = root;
	Node z = new Node(key);
	while (x != null) {
	    y = x;
	    if (z.key < y.key) {
		x = x.left;
	    } else {
		x = x.right;
	    }
	}
	if (y == null) {
	    root = z;
	} else if (z.key < y.key) {
	    y.left = z;
	} else {
	    y.right = z;
	}
    }
    
    static void inorder(Node u){
	if(u==null){
	    return;
	}
	inorder(u.left);
	System.out.print(" "+u.key);
	inorder(u.right);
    }

    
    static void preorder(Node u) {
	if (u == null)
	    return;
	System.out.print(" " + u.key);
	preorder(u.left);
	preorder(u.right);
    }
}

class Node{

    Node parent;
    Node left;
    Node right;

    int key;
    
    public Node(int key){
	this.key=key;
    }
    
}

