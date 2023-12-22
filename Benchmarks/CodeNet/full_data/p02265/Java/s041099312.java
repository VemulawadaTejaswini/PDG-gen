import java.util.*;

public class Main {
	public static void main(String[] args) {
		LinkedList<Long> list = new LinkedList<Long>();
		Scanner scanner = new Scanner(System.in);
		
		long n = scanner.nextLong();
		
		for (long i = 0; i < n; i ++) {
			String command = scanner.next();
			if (command.equals("insert")){
				Long x = scanner.nextLong();
				list.addFirst(x);
			} else if (command.equals("delete")) {
				Long x = scanner.nextLong();
				list.remove(x);
			} else if (command.equals("deleteFirst")) {
				list.remove();
			} else {
				list.removeLast();
			}
		}
		
		scanner.close();
		
		for (int i = 0; i < list.size() - 1; i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println(list.getLast());
	}
} 

