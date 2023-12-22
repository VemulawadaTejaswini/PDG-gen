import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

//import java.io.*;
//import java.util.*;

public class Main {
	static public void main(String[] argv) {
		try{
//			FileWriter fw = new FileWriter("output.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//			PrintWriter pw = new PrintWriter(bw, true);
			
//			FileReader fr = new FileReader("input.txt");
//			BufferedReader br = new BufferedReader( fr );
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//			PrintWriter pw = new PrintWriter(bw, true);
			
			while(true) {
				String buf = br.readLine();
				int n;
				n = Integer.valueOf(buf);
				if(n == 0) break;
				
				StringTokenizer st;
				LinkedList<Node> list = new LinkedList<Node>();
				for(int i = 0; i < n; i++) {
					buf = br.readLine();
					st = new StringTokenizer(buf);
					Node node = new Node();
					node.e_1 = Integer.valueOf(st.nextToken());
					node.e_2 = Integer.valueOf(st.nextToken());
					list.offer(node);
				}
				int max_count = 0;
				for(int i = 0; i < n; i++) {
					int count = solve(list, i+1);
					if(count > max_count) max_count = count;
				}
				System.out.println(max_count);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static int solve(LinkedList<Node> list, int root) {
		int max_count = 1;
		for(int i = 0; i < list.size(); i++) {
			Node node = list.poll();
			if(root == node.e_1) {
				LinkedList<Node> removed = removeNode(list, root);
				int count = 1 + solve(removed, node.e_2);
				if(count > max_count) max_count = count;
			} else if (root == node.e_2) {
				LinkedList<Node> removed = removeNode(list, root);
				int count = 1 + solve(removed, node.e_1);
				if(count > max_count) max_count = count;
			}
			list.offer(node);
		}
		return max_count;
	}
	
	static LinkedList<Node> copy(LinkedList<Node> list) {
		return new LinkedList<Node>(list);
	}
	
	static LinkedList<Node> removeNode(LinkedList<Node> list, int element) {
		LinkedList<Node> cloned = copy(list);
		for(int i = 0; i < list.size(); i++) {
			Node node = cloned.poll();
			if(!(node.e_1 == element || node.e_2 == element)) cloned.offer(node);
		}
		return cloned;
	}
}

class Node {
	public int e_1;
	public int e_2;
}