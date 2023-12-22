import java.util.*;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		long n = scanner.nextLong();
		scanner.nextLine();

		String command;
		Integer x;
		
		for (long i = 0; i < n; i ++) {
			command = scanner.nextLine();
			if (command.substring(0,6).intern().equals("insert ")){
				x = Integer.valueOf(command.substring(7).intern());
				list.addFirst(x);
			} else if (command.substring(0,6).intern().equals("delete ")) {
				x = Integer.valueOf(command.substring(7).intern());
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

