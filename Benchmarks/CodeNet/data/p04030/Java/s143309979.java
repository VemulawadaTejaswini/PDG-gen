import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		Deque<Character> deq = new ArrayDeque<Character>();
		String s = sc.next();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '0') {
				deq.push('0');
			}else if (s.charAt(i) == '1') {
				deq.push('1');
			}else {
				deq.poll();
			}
		}
		while(!deq.isEmpty()) {
			System.out.print(deq.removeLast());
		}
		System.out.println();
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}