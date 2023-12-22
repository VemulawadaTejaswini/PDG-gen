

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Deque<Integer> list = new ArrayDeque<Integer>(1000000);
		for (int i = 0; i < n; i++) {
			String command = sc.next();
			if (command.equals("insert") || command.equals("delete")) {
				Integer value = sc.nextInt();
				if (command.equals("insert")) {
					list.addFirst(value);
				} else {
					list.remove(value);
				}
			} else if (command.equals("deleteFirst")) {
				list.pollFirst();
			} else if (command.equals("deleteLast")) {
				list.pollLast();
			} else {
				System.out.println("Unknown command:" + command);
			}
		}
		sc.close();	
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer value = itr.next();
			System.out.print(value);
			if (itr.hasNext()) {
				System.out.print(" ");
			}
		}
		System.out.println("");
	}	
}

