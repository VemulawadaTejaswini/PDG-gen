/*
   Deque
   http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP2_1_B&lang=jp
 */

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

class Main {
	public static void main(String[] args) {
		LinkedList<Integer> A = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		int i = 0;
    int d = 0;
		while (i < q) {
			i++;

			int Cmd = scan.nextInt();
			switch (Cmd) {
			case 0:
				d = scan.nextInt();
				int x = scan.nextInt();
				push(A, d, x);
				break;
			case 1:
				int p = scan.nextInt();
				randomAccess(A, p);
				break;
			case 2:
				d = scan.nextInt();
				pop(A, d);
				break;
			default:
				break;
			}
		}
	}
	private static void push(LinkedList<Integer> A, int d, int x) {
		if (d == 0) {
			A.addFirst(x);
		} else if (d == 1) {
			A.addLast(x);
		}
	}
	private static void randomAccess(LinkedList<Integer> A, int p) {
		System.out.println(A.get(p));
	}
	private static void pop(LinkedList<Integer> A, int d) {
		if (d == 0) {
			A.removeFirst();
		} else if (d == 1) {
			A.removeLast();
		}
	}
}

