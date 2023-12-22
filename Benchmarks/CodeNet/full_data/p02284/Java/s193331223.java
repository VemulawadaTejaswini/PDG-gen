
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {

	static long changecount = 0;
   public static void main(String args[]) throws IOException{

	   Scanner sc = new Scanner(System.in);
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int n = Integer.parseInt( br.readLine()  );

	   Tree tree = new Tree();

	   /*
	   tree.insert(30);
       tree.insert(88);
       tree.insert(12);
       tree.insert(1);
       tree.insert(20);
       tree.insert(17);
       tree.insert(25);
       tree.inorder(tree.root);
       System.out.println();
       tree.preorder(tree.root);
       */

       for(int i = 0; i < n ; i++){

    	   String[] string =  br.readLine().split(" ");
    	   if( string[0].equals("insert") ){
    		   tree.insert( Integer.parseInt(string[1]) );
    	   }
    	   else if(string[0].equals("print")) {
    		   tree.inorder(tree.root);
    	       System.out.println();
    	       tree.preorder(tree.root);
    	       System.out.println();
    	   }
    	   else if(string[0].equals("find")) {
    		   //System.out.println( tree.find( tree.root, Integer.parseInt(string[1]) ) );
    		   tree.find( tree.root, Integer.parseInt(string[1]) );
    	   }
       }



   }


}



class Node{

	int  key;
	Node left;
    Node right;
    Node parent;

    Node(int x) {
        key = x;
        left = null;
        right = null;
        parent = null;
    }

}




class Tree{

	Node root = null;


	void insert( int date ){

		Node z = new Node(date);
		Node y = null;
		Node x = root;

		while(x != null){
			 y = x ;// ???????¨????
			 if( z.key < x.key ){
				 x = x.left; // ?????????????§????
			 }
			 else{
				 x = x.right; // ?????????????§????
			 }

		}

		z.parent = y;

		if ( y == null ){
            root = z;
		}
		else if(z.key < y.key){
			y.left = z; // z ??? y ?????????????????????

		}
		else{
			y.right = z ;// z ??? y ?????????????????????
		}


	}


	void find(Node tree, int serch){


		while (tree != null) {

			if( tree.key == serch ){
				System.out.println("yes");
				return ;
			}
			else if(tree.key > serch ){
                 tree = tree.left;
			}
			else{
				tree = tree.right;
			}
	    }
		System.out.println("no");
       return ;
	}


	 void preorder(Node tree ) {

	        if (tree != null) {
	       	 System.out.print(" " + tree.key);
	        	preorder(tree.left);

	           preorder(tree.right);
	       }
	}

	    void inorder (Node tree) {

	    	         if (tree != null) {

	    	        	inorder(tree.left);
	    	            System.out.print(" " + tree.key);
	    	            inorder(tree.right);
	    	        }
	     }


	    void postorder (Node tree) {
	        if (tree != null) {

	        	postorder(tree.left);
	        	postorder(tree.right);
	            System.out.print(" " + tree.key);
	       }
	}




}