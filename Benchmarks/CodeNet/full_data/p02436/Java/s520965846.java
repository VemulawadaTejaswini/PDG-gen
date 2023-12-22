import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			ArrayList<Queue<Integer>> Q = new ArrayList<>();
			int n = sc.nextInt();
			for(int i = 0; i < n; i++) {
				Q.add(new LinkedList<Integer>());
			}
			int qn = sc.nextInt();
			for(int i = 0; i < qn; i++) {
				int q = sc.nextInt();
				switch(q) {  // 文字列に対し switch を使って良い
				case 0 /* enqueue(t)*/: {
					int t = sc.nextInt();
					int x = sc.nextInt();
					Q.get(t).add(x);
					break;  /* break を忘れない */
				}
				case 1 /* front(t) */: {
					int t = sc.nextInt();
					if(!Q.get(t).isEmpty()) {
						System.out.println(Q.get(t).peek());
					}
					break;  /* break を忘れない */
				}
				case 2: /* dequeue(t) */ {
					int t = sc.nextInt();
					if(!Q.get(t).isEmpty()) {
						Q.get(t).remove();
					}
					break;  /* break を忘れない */
				}
				}
			}
		}
	}
}
