import java.util.*;

public class Main {
	public static void main(String[] args) {
		ALDS1_3_C();
	}

	public static void ALDS1_3_C() {
		
		Scanner sc = new Scanner(System.in);
		//LinkedList<Integer> link = new LinkedList<Integer>();
		Deque<Integer> link = new ArrayDeque<Integer>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String command = sc.next();
			
			if(command.equals("insert")) {
				int x = sc.nextInt();
				link.addFirst(x);
			}else if(command.equals("delete")) {
				int x = sc.nextInt();
				link.removeFirstOccurrence(x);
			}else if(command.equals("deleteFirst")) {
				link.removeFirst();
			}else if(command.equals("deleteLast")) {
				link.removeLast();
			}
		}
			
		Integer tmp;
		boolean notFirst = false;
		while((tmp = link.poll()) != null) {
			if(notFirst)
				System.out.print(" ");
			System.out.print(tmp);
			notFirst = true;
		}
		System.out.println();
	}
	
}

