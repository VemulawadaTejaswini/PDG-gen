import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> que = new LinkedList<Integer>();
		while(sc.hasNextInt()) {
			int x = sc.nextInt();
			if(x != 0) que.push(x);
			else System.out.println(que.pop());
		}
	}
}