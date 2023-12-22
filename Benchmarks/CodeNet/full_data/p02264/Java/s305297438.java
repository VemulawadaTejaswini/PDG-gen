
import java.util.*;



/*
 * Aizuuuuuuu
 * 
 */
public class Main {
	public static void print(ArrayList<String> list) {
		for (String i :list) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		int globalTime = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		ArrayList<String> results = new ArrayList<String>();
		LinkedList<String> ns = new LinkedList<String>();
		LinkedList<Integer> qs = new LinkedList<Integer>();
		
		while (ns.size() < n) {
			ns.addLast(sc.next());
			qs.addLast(sc.nextInt());
		}
		
		String tempS = "";
		int tempI = 0;
		
		while (ns.size() > 0) {
			if (qs.peek() - q <= 0) {
				results.add(ns.poll() + " " + (qs.peek()+globalTime));
				globalTime += qs.poll();
			}
			else {
				tempI = qs.poll();
				tempI -= q;
				qs.addLast(tempI);
				ns.addLast(ns.poll());
				globalTime += q;
			}
		}
		print(results);
		
	}
}

