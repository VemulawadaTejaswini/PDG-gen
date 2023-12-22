import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
public class Main {
 
    /**
     * @param args
     * @throws IOException 
     * @throws NumberFormatException 
     */
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
         
        Tree tree = new Tree();
        for(int i = 0; i < n; i++){
            String[] tmpArray = br.readLine().split(" ");
            if(tmpArray[0].equals("insert")){
                Node node = new Node(Integer.parseInt(tmpArray[1]), null, null);
                tree.insert(node);
            }
            else if(tmpArray[0].equals("find")){
            	if(tree.find(Integer.parseInt(tmpArray[1]))){
            		System.out.println("yes");
            	}
            	else{
            		System.out.println("no");
            	}
            }
            else if(tmpArray[0].equals("delete")){
            	tree.delete(Integer.parseInt(tmpArray[1]));
            }
            else {
                inorder(tree.root);
                System.out.println();
                preorder(tree.root);
                System.out.println();
            }
        }
    }
 
    static void preorder(Node node){
        System.out.print(" "+node.key);
        if(node.left != null){
            preorder(node.left);
        }
        if(node.right != null){
            preorder(node.right);
        }
    }
     
    static void inorder(Node node){
        if(node.left != null){
            inorder(node.left);
        }
        System.out.print(" "+node.key);
        if(node.right != null){
            inorder(node.right);
        }
    }
     
}
 
class Tree {
    Node root = null;
     
    public Tree(){
         
    }
    public Tree(Node root){
        this.root = root;
    }
     
    public void delete(int key){
    	Node node = root;
    	
    	while(node != null){
    		if(node.key == key){
    			if(node.left == null && node.right == null){
    				if(node.parent.left == node){
    					node.parent.left = null;
    				}
    				else {
    					node.parent.right = null;
    				}
    			}
    			
    			else if(node.left == null || node.right == null){
    				Node child;
    				if(node.left != null){
    					child = node.left;
    				}
    				else {
    					child = node.right;
    				}
    				
    				if(node.parent.left == node){
    					node.parent.left = child;
    					child.parent = node.parent;
    				}
    				else {
    					node.parent.right = child;
    					child.parent = node.parent;
    				}
    			}
    			
    			else {
    				node.left.parent = node.parent;
    				node.left.right = node.right;
    			}
    			
    			return;
    		}
    		
    		else if(node.key > key){
    			node = node.left;
    		}
    		else {
    			node = node.right;
    		}
    	}
    }
    
    public boolean find(int key){
    	Node node = root;
    	
    	while(node != null){
    		if(node.key == key){
    			return true;
    		}
    		
    		else if(node.key > key){
    			node = node.left;
    		}
    		else {
    			node = node.right;
    		}
    	}
    	
    	return false;
    }
    public void insert (Node node){
        Node y = null;
        Node x = this.root;
        while(x != null){
            y = x;
            if( node.key < x.key){
                x = x.left;
            }
            else{
                x = x.right;
            }
        }
        node.parent = y;
         
        if (y == null){
            this.root = node;
        }
        else if(node.key < y.key){
            y.left = node;
        }
        else {
            y.right = node;
        }
    }
}
 
class Node {
    int key;
    Node left = null;
    Node right = null;
    Node parent = null;
     
    public Node(int key, Node left, Node right){
        this.key = key;
        this.left = left;
        this.right = right;
    }
}