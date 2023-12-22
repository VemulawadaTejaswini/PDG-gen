import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DequeOrder ord = new DequeOrder();
		try (Scanner sc = new Scanner(System.in)) {
			int q = sc.nextInt();
			for(int i = 0; i < q; i++) {
				int order_number = sc.nextInt();
				if(order_number == 0) {
					ord.push(sc.nextInt(), sc.nextInt());
				}else if(order_number == 1) {
					ord.randomAccess(sc.nextInt());
				}else if(order_number == 2) {
					ord.pop(sc.nextInt());
				}
			}
		}
	}
}
class DequeOrder {
	public Deque<Integer> array = new ArrayDeque<>();
	public void push(int d, int x){
		if(d == 0) {
			array.addFirst(x);
		}else if(d == 1) {
			array.addLast(x);
		}
	}
	public void randomAccess(int p) {
		Iterator<Integer> i = array.iterator();
		for(int j = 0; j < p; j++) {
			i.next();
		}
		System.out.println(i.next());
	}
	public void pop(int d) {
		if(d == 0) {
			array.removeFirst();
		}else if(d == 1) {
			array.removeLast();
		}
	}
	public Deque<Integer> getArray() {
		return array;
	}
}


