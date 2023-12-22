

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> li = new LinkedList<Integer>();
		for (int n = Integer.parseInt(sc.nextLine()); n > 0; n--) {
			String[] ins = sc.nextLine().split(" ");
			switch (ins[0]) {
			case "insert":
				li.add(Integer.parseInt(ins[1]));
				break;
			case "delete":
				li.remove(li.indexOf(Integer.parseInt(ins[1])));
				break;
			case "deleteFirst":
				li.removeFirst();
				break;
			case "deleteLast":
				li.removeLast();
				break;
			}
		}
		
		while (li.size() > 0) {
			System.out.print(li.getLast()+" ");
			li.removeLast();
		}
		System.out.println();
	
	}
}

