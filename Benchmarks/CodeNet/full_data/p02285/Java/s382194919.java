
import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Main {

	public static void preOrder( Node root ) {	      
    	if( root == null)
        	return;      
        System.out.print(" " + root.data);
        preOrder(root.left);
        preOrder(root.right);	     
    }
	public static void inOrder(Node root) {
		if(root==null)
			return ;
    	if(root.left!=null) inOrder(root.left);
    	System.out.print(" " + root.data);    		
    	if(root.right!=null) inOrder(root.right);
    }
	public static void print( Node root ) {
		inOrder( root );
		System.out.println();
		preOrder( root );
		System.out.println();
	}
	public static Node deletemin(Node root) {
		if(root.left==null) return root.right;
		root.left = deletemin(root.left);
		return root;
	}
	public static Node getmin(Node root) {
		if(root.left==null) return root;
		return getmin(root.left);
	}
	public static Node deletion(Node root, int data) {
		if(root==null) return null;
		if(root.data>data)	root.left = deletion(root.left,data);
		else if(root.data<data) root.right = deletion(root.right,data);
		else //found it
		{
			if(root.left==null) return root.right;
			else if(root.right==null) return root.left;
			else
			{
				Node temp = getmin(root.right);
				root.data = temp.data;
				root.right = deletemin(root.right);
			}			
		}
		return root;
	}

	public static Node insert(Node root,int data) {
    	if(root==null)
    	{	    		
    		root= new Node(data);
    		return root;
    	}
    	Node curr = root;
    	while(true)
    	{
    		if(data<curr.data)
	    	{
	    		if(curr.left==null)
	    		{
	    			curr.left = new Node(data);
	    			return root;//break;
	    		}		
	    		else curr = curr.left;		    		
	    	}
    		else
    		{
	    		if(curr.right==null)
	    		{
	    			curr.right = new Node(data);
	    			return root;//break;
	    		}		    			
	    		else curr = curr.right;
    		}
    	}
    }
	public static String find(Node root,int data) {
		if(root==null)
    	{	    		
    		root= new Node(data);
    		return "no";
    	}
		Node curr = root;
		while(true)
    	{
			if(data==curr.data)
				return "yes";
			else if(data<curr.data)
	    	{
	    		if(curr.left==null)
	    		{
	    			return "no";//break;
	    		}		
	    		else curr = curr.left;		    		
	    	}
    		else
    		{
	    		if(curr.right==null)
	    		{
	    			return "no";//break;
	    		}		    			
	    		else curr = curr.right;
    		}
    	}
	}

	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        Node root = null;
        while(t-- > 0) {
            String str = scan.nextLine();
            String[] tokens = str.split(" ");
//            System.out.println(tokens[0]);
            switch(tokens[0].charAt(0)){
            case 'i':  root=insert(root, Integer.parseInt(tokens[1]));break;
            case 'f':  System.out.println(find(root,Integer.parseInt(tokens[1])));break;
            case 'p':  print(root);break;
            case 'd':  root = deletion(root,Integer.parseInt(tokens[1])); break;
            default: break;
            }

        }
        scan.close();
//      	preOrder(root);
    }	
	
}

