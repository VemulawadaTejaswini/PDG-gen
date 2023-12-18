import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	private int n;
	
	private long[] node;
	
	private HashMap<Integer, LinkedList<Integer>> hm;
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		n = sc.nextInt();

		
		hm = new HashMap<Integer, LinkedList<Integer>>();
		for (int i = 0; i < (n - 1); i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			int val = sc.nextInt();

			LinkedList<Integer> ll = new LinkedList<Integer>();
			if (hm.containsKey(from) == true) ll = hm.get(from);
			ll.push(to);
			ll.push(val);
			hm.put(from, ll);
			
			ll = new LinkedList<Integer>();
			if (hm.containsKey(to) == true) ll = hm.get(to);
			ll.push(from);
			ll.push(val);
			hm.put(to, ll);
		}
		
		int q = sc.nextInt();
		int k = sc.nextInt();
		
		node = new long[n + 1];
		for (int i = 0; i < node.length; i++) {
			node[i] = -1;
		}
		node[k] = 0;
		calc(k);

		for (int i = 0; i < q; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();

			System.out.println(node[from] + node[to]);
		}
	}
	
	private void calc(int from) {
		if (hm.containsKey(from) == false) return;
		
		LinkedList<Integer> ll = hm.get(from);

		for (int i = 0; i < (ll.size() / 2); i++) {
			int index = ll.get(i * 2 + 1);
			if (node[index] != -1) continue;
			
			node[index] = node[from] + ll.get(i * 2);
			calc(index);
		}
	}
}