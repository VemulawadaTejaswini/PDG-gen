
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayDeque <Character> deque = new ArrayDeque<Character>(); 
		
		String s = sc.next();
		
		for(int i = 0 ;i < s.length();i++) {
			deque.addFirst(s.charAt(i));
		}
		
		int q = Integer.parseInt(sc.next());
		
		for(int i = 0 ;i < q ;i++) {
			int p = Integer.parseInt(sc.next());
			if(p == 1) {
				char cf = deque.pollLast();
				char cl = deque.pollFirst();
				
				deque.addFirst(cf);
				deque.addLast(cl);
			}
			else {
				int r = Integer.parseInt(sc.next());
				String c = sc.next();
				if(r == 1) {
					deque.addFirst(c.charAt(0));
				}
				else {
					deque.addLast(c.charAt(0));
				}
			}
		}
		
		int m = deque.size();
		
		for(int i = 0 ;i < m ;i++) {
			System.out.print(deque.poll());
		}
		
	}
}
