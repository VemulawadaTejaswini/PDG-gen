
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Order ord = new Order();
		try (Scanner sc = new Scanner(System.in)) {
			int q = sc.nextInt();
			for(int i = 0; i < q; i++) {
				int order_number = sc.nextInt();
				if(order_number == 0) {
					ord.push(1, sc.nextInt());
				}else if(order_number == 1) {
					ord.randomAccess(sc.nextInt());
				}else if(order_number == 2) {
					ord.pop(1);
				}
//				System.out.println(ord.getArray());
			}
		}
	}
}

class Order{
	ArrayList<Integer> array = new ArrayList<Integer>();
	public void makeList(int a){
		array.add(a);
	}
	public void push(int d, int x){
		if(d == 0) {
			array.add(0, x);
		}else if(d == 1) {
			array.add(x);
		}
	}
	public void randomAccess(int p) {
		System.out.println(array.get(p));
	}
	public void pop(int d) {
		if(d == 0) {
			array.remove(0);
		}else if(d == 1) {
			array.remove(array.size() - 1);
		}

	}
	public ArrayList<Integer> getArray() {
		return array;
	}
}

