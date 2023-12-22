import java.util.*;

public class BST{
static class Node{
int value;
Node right,left;

	Node(int value){
		this.value=value;
		left=null;
		right=null;
	}
}
static void insert(Node node,int value){
if(value<node.value){
	if(node.left!=null){
		insert(node.left,value);}
		else
	node.left=new Node(value);
	

}else
	if(node.right!=null){
		insert(node.right,value);}
		else{
	node.right=new Node(value);
	}

}
static void inorder(Node node){
	if(node!=null){
inorder(node.left);
System.out.println(node.value);
inorder(node.right);
}

}


public static void main(String[] args) {
	Node node=new Node(3);
	insert(node,5);
	insert(node,2);
	inorder(node);
}

}