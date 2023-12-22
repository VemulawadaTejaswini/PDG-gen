import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static void trace(Object ... objects){
		System.out.println(Arrays.toString(objects));
	}
	
	public static class Node {
		int id;
		Node parent;
		LinkedList<Node> children;
		long lazy_value;
		long cur_value;
		boolean used;
		
		public Node(int id){
			this.id = id;
			parent = null;
			children = new LinkedList<Node>();
			lazy_value = cur_value = 0;
			used = false;
		}
		
		public void setParent(Node node){
			parent = node;
		}
		
		public void addNode(Node node){
			children.add(node);
		}
		
		public void addLazyCost(long value){
			lazy_value += value;
		}
		
		public void propagete(){
			for(Node node : children){
				node.addLazyCost(lazy_value);
			}
			cur_value += lazy_value;
			lazy_value = 0;
		}
		
		public String toString(){
			return id + ": " + cur_value + ",(" + lazy_value + ")";
		}
	}
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int Q = sc.nextInt();
		
		Node[] nodes = new Node[N];
		for(int i = 0; i < N; i++){
			nodes[i] = new Node(i);
		}
		
		for(int i = 0; i < N - 1; i++){
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			
			final int parent = Math.min(a, b);
			final int child = Math.max(a, b);
			
			nodes[parent].addNode(nodes[child]);
			nodes[child].setParent(nodes[parent]);
		}
		
		LinkedList<Node> u_stack = new LinkedList<Node>();
		LinkedList<Node> v_stack = new LinkedList<Node>();
		
		for(int i = 0; i < Q; i++){
			final int q = sc.nextInt();
			final int u = sc.nextInt();
			final int v = sc.nextInt();
			//System.out.println(Arrays.toString(nodes));
			if(q == 0){
				if(u == v){ 
					System.out.println("0");
				}else{
					u_stack.clear();
					v_stack.clear();
					
					Node cur_u = nodes[u];
					while(cur_u != null){
						u_stack.addFirst(cur_u);
						cur_u = cur_u.parent;
					}
					
					Node cur_v = nodes[v];
					while(cur_v != null){
						v_stack.addFirst(cur_v);
						cur_v = cur_v.parent;
					}
				
					long costs = 0;
					for(Node node : u_stack){
						node.propagete();
						node.used = true;
						if(node.parent == null){
							continue;
						}
						costs += node.parent.cur_value;
					}
					
					for(Node node : v_stack){
						node.propagete();
						
						if(node.parent == null){
							continue;
						}else{
							costs += (node.used ? -1 : 1) * node.parent.cur_value;
						}
					}
				
					for(Node node : u_stack){
						node.used = false;
					}
					//System.out.println(u_stack);
					//System.out.println(v_stack);
					System.out.println(costs);
				}
			}else{
				nodes[u].addLazyCost(v);
			}
		}
	}
	
	public static class Scanner {
		private BufferedReader br;
		private StringTokenizer tok;
		
		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}
		
		private void getLine() throws IOException {
			while(!hasNext()) { tok = new StringTokenizer(br.readLine()); }
		}
		
		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}
		
		public String next() throws IOException {
			while(!hasNext()) { getLine(); }
			return tok.nextToken();
		}
		
		public int nextInt() throws IOException {
			return Integer.parseInt(this.next());
		}
	}
	
	
} 