import java.util.*;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);
		
		long n = scanner.nextLong();
		scanner.nextLine();
		
		for (long i = 0; i < n; i ++) {
			String command = scanner.next();
			if (command.length() > 6) {
				if (command.charAt(6) == 'F') {
					list.remove();
				} else {
					list.removeLast();
				}
			} else if (command.charAt(0) == 'd') {
				list.remove(scanner.next());
			} else {
				list.addFirst(scanner.next());
			}
		}
		
		scanner.close();
		
		for (int i = 0; i < list.size() - 1; i++) {
			System.out.print(list.get(i));
			System.out.print(" ");
		}
		System.out.println(list.getLast());
	}
} 

