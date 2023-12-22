/*
   Deque
   http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP2_1_B&lang=jp
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {
	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>();
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
	private static void push(List<Integer> A, int d, int x) {
		if (d == 0) {
			A.add(0, x);
		} else if (d == 1) {
			A.add(x);
		}
	}
	private static void randomAccess(List<Integer> A, int p) {
		System.out.println(A.get(p));
	}
	private static void pop(List<Integer> A, int d) {
		if (d == 0) {
			A.remove(0);
		} else if (d == 1) {
			A.remove(A.size() - 1);
		}
	}
}

