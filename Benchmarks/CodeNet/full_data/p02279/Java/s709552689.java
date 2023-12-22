import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static class node{
		String status,child;
		String [] children;
		int parent,depth,i;
		
		node(){
			this.child = sc.nextLine();
		}
		void spt(){
			this.children = this.child.split(" ");
		}
		
	}
	public static void position(node [] branch,int num){
		int i;
		for(i=0;i<num;i++){
			if(branch[i].parent == -1) branch[i].status = "root";
			else if(branch[i].children[0].equals("0")) branch[i].status = "leaf";
			else branch[i].status = "internal node";
		}
	}
	
	public static void pd(node [] branch,int index){
		int i,j;
		for(i=0;i<index;i++){
			for(j=0;j<branch[i].children.length;j++){
				branch[Integer.parseInt(branch[i].children[j])].parent = i; 
			}
		}
	}
	public static void sd(node [] branch,int index){
		int i,j,c;
		for(i=0;i<index;i++){
			j = i;
			c = 0;
			while(true){
				if(branch[j].parent == -1) break;
				c++;
				j = branch[j].parent;
			}
			branch[i].depth = c;
		}
	}
	
	public static void main(String[] args){
		
		Integer i,j,n = sc.nextInt();
		String buf;
		node [] tree = new node[n];
		buf = sc.nextLine();
		
		for(i=0;i<n;i++){
			sc.skip(String.valueOf(i)+" ");
			tree[i] = new node();
			tree[i].spt();
		}
		pd(tree,n);
		tree[0].parent = -1;
		
		position(tree,n);
		sd(tree,n);
		
		for(i=0;i<n;i++){
			if(tree[i].children[0].equals("0")) tree[i].children[0] = "";
		}
		
		for(i=0;i<n;i++){
			System.out.printf("node %d: parent = %d, depth = %d, %s, [",i,tree[i].parent,tree[i].depth,tree[i].status);
			for(j=0;j<tree[i].children.length;j++){
				System.out.print(tree[i].children[j]);
				if(j != (tree[i].children.length -1)){
					System.out.print(", ");
				}
			}
			System.out.println("]");
		}
	}

}
