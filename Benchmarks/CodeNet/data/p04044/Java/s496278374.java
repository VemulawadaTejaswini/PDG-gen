
import java.util.*;

class Main {
	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int n = sc.nextInt();
		
		PriorityQueue<String> list = new PriorityQueue<>();
		
		for (int i = 0; i < n; i++) list.add(sc.next());
		for (int i = 0; i < n; i++) System.out.print(list.poll());
		System.out.println();
	}
}