/*
   Deque
   http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP2_1_B&lang=jp
 */

import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		int i = 0;
		int d = 0;
		int limit = 400000;
		MyDeque A = new MyDeque(limit);
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

	private static void push(MyDeque A, int d, int x) {
		if (d == 0) {
			A.addFirst(x);
		} else if (d == 1) {
			A.addLast(x);
		}
	}
	private static void randomAccess(MyDeque A, int p) {
		System.out.println(A.get(p));
	}
	private static void pop(MyDeque A, int d) {
		if (d == 0) {
			A.removeFirst();
		} else if (d == 1) {
			A.removeLast();
		}
	}
}

class MyDeque {
	private int size;
	private int first;
	private int last;
	private int data[];
	MyDeque(int limit) {
		data = new int [limit * 2 + 1];
		first = limit;
		last = limit - 1;
		size = 0;
	}
	void addFirst(int x) {
		data[--first] = x;
	}
	void addLast(int x) {
		data[++last] = x;
	}
	int get(int p) {
		return data[first + p];
	}
	void removeFirst() {
		first++;
	}
	void removeLast() {
		last--;
	}
}

