import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Queue<String> queue = new ArrayDeque<>();
		sb.append(sc.next());
		int q = sc.nextInt();
		int reverse = 0;

		for(int i = 0; i < q; i++) {
			int n = sc.nextInt();
			switch(n) {
			case 1:
				reverse = 1 - reverse;
				break;
			case 2:
				if(sc.nextInt() - 1 == reverse){
					queue.add(sc.next());
				}else {
					sb.append(sc.next());
				}
				break;
			}
		}
		while(queue.peek() != null) {
			sb.insert(0, queue.poll());
		}
		if(reverse == 1) System.out.println(sb.reverse().toString());
		else System.out.println(sb.toString());
		sc.close();
	}
}
