import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		class node{
			String status,child;
			int parent,depth;
			
			node(){
				child = sc.nextLine();
			}
		}
		int i,n = sc.nextInt();
		String buf;
		node [] tree = new node[n];
		buf = sc.nextLine();
		
		for(i=0;i<n;i++){
			sc.skip(String.valueOf(i)+" ");
			tree[i] = new node();
		}
		
		for(i=0;i<n;i++){
			System.out.println(tree[i].child);
		}
	}

}
