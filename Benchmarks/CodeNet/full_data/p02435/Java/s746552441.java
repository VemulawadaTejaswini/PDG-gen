import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, j;
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int q = sc.nextInt();
			ArrayList<Deque<Integer>> array = new ArrayList<>();
			for(i = 0; i < n; i++) {
				array.add(new ArrayDeque<Integer>());
			}
			for(i = 0; i < q; i++) {
				int order_number = sc.nextInt();
				int t = sc.nextInt();
				if(array.get(t).isEmpty() && order_number != 0) {
					continue;
				}
				switch(order_number) {
				case 0 :
					array.get(t).add(sc.nextInt());
					break;
				case 1 :
					System.out.println(array.get(t).peekLast());
					
					break;
				case 2 :
					array.get(t).removeLast();
					break;
				}
//				for (Deque<Integer> output : array) {
//					System.out.print(output);
//				}
			}

		}
	}
}

