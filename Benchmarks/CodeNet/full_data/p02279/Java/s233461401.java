import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static class node{
		String status,child;
		String [] children;
		int parent,depth,i;
		
		node(){
			child = sc.nextLine();
		}
		void spt(){
			children = child.split(" ");
		}
		
	}
	
	public static void pd(node [] branch,int index){
		int i,j;
		for(i=0;i<index;i++){
			for(j=0;j<branch[i].children.length;j++){
				branch[Integer.valueOf(branch[i].children[j]]) = i; 
			}
		}
	}
	
	public static void main(String[] args){
		
		int i,n = sc.nextInt();
		String buf;
		node [] tree = new node[n];
		buf = sc.nextLine();
		
		for(i=0;i<n;i++){
			sc.skip(String.valueOf(i)+" ");
			tree[i] = new node();
			tree[i].spt();
		}
		
		for(i=0;i<n;i++){
			System.out.println(tree[i].child);
		}
	}

}
