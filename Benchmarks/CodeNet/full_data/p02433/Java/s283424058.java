import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, j;
		LinkedList<Integer> list = new LinkedList<Integer>();
		ListIterator<Integer> cursor = list.listIterator();
		try (Scanner sc = new Scanner(System.in)) {
			int q = sc.nextInt();
			for(i = 0; i < q; i++) {
				int order_number = sc.nextInt();
				switch(order_number) {
				case 0 :
					cursor.add(sc.nextInt());
					cursor.previous();
					break;
				case 1 :
					int d = sc.nextInt();
					if(d >= 0) {
						for(j = 0; j < d; j++) {
							cursor.next();
						}
					}else {
						for(j = 0; j < -d; j++) {
							cursor.previous();
						}
					}
					break;
				case 2 :
					cursor.next();
					cursor.remove();
					break;
				}
			}
			for (int output : list) {
				System.out.println(output);
			}
		}
	}
}

