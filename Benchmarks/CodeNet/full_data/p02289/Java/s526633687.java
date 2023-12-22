import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void insert(ArrayList<Integer> list, int x) {
		list.add(x);
		sendUp(list, list.size() - 1);
	}
	private static void sendUp(ArrayList<Integer> list, int x) {
		int parent = (x-1)/2;
		if(parent >= 0)
			if(list.get(parent) < list.get(x)) {
				int temp = list.get(x);
				list.set(x, list.get(parent));
				list.set(parent, temp);
				sendUp(list, parent);
			}
				
	}
	
	public static void extractMax(ArrayList<Integer> list) {
		System.out.println(list.get(0));
		list.set(0, list.get(list.size()-1));
		list.remove(list.size()-1);
		maxHeapify(list, 0);
	}
	private static void maxHeapify(ArrayList<Integer> a, int x) {
		int left = 2 * x + 1;
		int right = 2 * x + 2;
		int largest = x;
		if(left < a.size())
			if(a.get(left) > a.get(x))
				largest = left;
		if(right < a.size())
			if(a.get(right) > a.get(largest))
				largest = right;
		if(largest != x) {
			int temp = a.get(x);
			a.set(x, a.get(largest));
			a.set(largest, temp);
			maxHeapify(a, largest);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		String next = in.next();
		while(!next.equals("end")) {
			if(next.equals("insert")) {
				insert(a, in.nextInt());
				next = in.next();
			} else {
				extractMax(a);
				next = in.next();
			}
		}
		in.close();
	}
}

