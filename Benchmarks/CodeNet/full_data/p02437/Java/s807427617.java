import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			ArrayList<PriorityQueue<Integer>> PQ = new ArrayList<>();
			int n = sc.nextInt();
			for(int i = 0; i < n; i++) {
				// 大きい順は natural ordering の逆
				PQ.add(new PriorityQueue<Integer>(Collections.reverseOrder()));
			}
			int qn = sc.nextInt();
			for(int i = 0; i < qn; i++) {
				int q = sc.nextInt();
				switch(q) {  // 文字列に対し switch を使って良い
				case 0 /* insert(t)*/: {
					int t = sc.nextInt();
					int x = sc.nextInt();
					PQ.get(t).add(x);
					break;  /* break を忘れない */
				}
				case 1 /* getMax(t) */: {
					int t = sc.nextInt();
					if(!PQ.get(t).isEmpty()) {
						System.out.println(PQ.get(t).peek());
					}
					break;  /* break を忘れない */
				}
				case 2: /* deleteMax(t) */ {
					int t = sc.nextInt();
					if(!PQ.get(t).isEmpty()) {
						PQ.get(t).remove();
					}
					break;  /* break を忘れない */
				}
				}
			}
		}
	}
}

