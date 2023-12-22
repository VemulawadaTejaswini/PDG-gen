import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<PriorityQueue<Integer>> pque = new ArrayList<>();
		
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			pque.add(new PriorityQueue<Integer>(Comparator.reverseOrder()));
		}
		
		int count = scan.nextInt();
		
		for(int i=0; i<count; i++) {
			int query = scan.nextInt();
			int a = scan.nextInt();

			switch(query) {
			
			case 0:
				int b = scan.nextInt();
				pque.get(a).offer(b);
				break;
				
			case 1:
				if(!pque.get(a).isEmpty())
				System.out.println(pque.get(a).peek());
				break;
				
			case 2:
				if(!pque.get(a).isEmpty())
				pque.get(a).poll();
				break;
			}
		}
	}
}
