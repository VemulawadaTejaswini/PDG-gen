import java.util.*;
public class treework {
	static Node[] list;
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	list =new Node[n];
    	
    	int num,ri,le;
    	for(int i=0;i<n;i++){
    		list[i]=new Node();
    	}
    	for(int i=0;i<n;i++){
    		num=sc.nextInt();
    		list[i].number=num;
    		le=sc.nextInt();
    		ri=sc.nextInt();
    		if(ri==-1){
    			list[i].right=null;
    		}else{
    			list[i].right=list[ri];
    			list[ri].pid=i;
    		}
    		if(le==-1){
    			list[i].left=null;
    		}else{
    			list[i].left=list[le];
    			list[le].pid=i;
    		}
    		
    	}
    	System.out.println("Preorder");
    	for(int i=0;i<n;i++){
    		if(list[i].pid==-1){
    			preorder(list[i]);
    		}
    	}
    	System.out.print("\n");
    	System.out.println("Inorder");
    	for(int i=0;i<n;i++){
    		if(list[i].pid==-1){
    			inorder(list[i]);
    		}
    	}
    	System.out.print("\n");
    	System.out.println("Postorder");
    	for(int i=0;i<n;i++){
    		if(list[i].pid==-1){
    			postorder(list[i]);
    		}
    	}
    	System.out.print("\n");
}
    static void preorder(Node node){
    	System.out.print(" ");
    	System.out.print(node.number);
    	if(node.left!=null){
    		preorder(node.left);
    	}
    	if(node.right!=null){
    		preorder(node.right);
    	}
    }
    static void inorder(Node node){
    	if(node.left!=null){
    		inorder(node.left);
    	}
    	System.out.print(" ");
    	System.out.print(node.number);
    	if(node.right!=null){
    		inorder(node.right);
        }
    }
    static void postorder(Node node){
    	if(node.left!=null){
    		postorder(node.left);
    	}
    	if(node.right!=null){
    		postorder(node.right);
        }
    	System.out.print(" ");
    	System.out.print(node.number);
    }	
}
class Node{
	int number;
	int pid;
	Node left;
	Node right;
	Node(){
		pid=-1;
		number=0;
		left=null;
		right=null;
	}
}
