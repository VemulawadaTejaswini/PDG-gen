import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int q = sc.nextInt();
			
			Node[] nodes = new Node[n];
			for(int i = 0 ; i < n ; i++ ) {
				nodes[i] = new Node();
			}
			
			//a,b
			for(int i = 0 ; i < n-1 ; i++ ) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				nodes[a-1].children.add(nodes[b-1]);
			}
			
			//Q operation
			for(int i = 0 ; i < q ; i++) {
				int p = sc.nextInt();
				long x = sc.nextLong();
				nodes[p-1].addCounter(x);
			}
			
			long answer = 0;
			for(int i = 0 ; i < n ; i++ ) {
//				answer += nodes[i].counter;
				System.out.print(nodes[i].counter);
				System.out.print(" ");
			}
			
//			System.out.println(answer);
		}
	}
	
	private static class Node {
		public long counter = 0;
		public List<Node> children = new ArrayList<Node>();
		
		public void addCounter(long value) {
			this.counter += value;
			for(Node child : this.children) {
				child.addCounter(value);
			}
		}
	}
}