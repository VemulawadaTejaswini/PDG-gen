import java.util.Deque;
import java.util.LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {

	public static void main(String[] args) {

		InputOutput stdIO = new InputOutput();

		int n = stdIO.getValue();
		Deque<Integer> dll = new LinkedList<>();

		int value;
		String[] inputline;

		long t1 = System.nanoTime();

		for (int i = 0; i < n; i++) {
			inputline = stdIO.getLineStringArray();
			switch (inputline[0]) {
			case "insert":
				insert(dll, Integer.parseInt(inputline[1]));
				break;
			case "delete":
				delete(dll, Integer.parseInt(inputline[1]));
				break;
			case "deleteFirst":
				deleteFirst(dll);
				break;
			case "deleteLast":
				deleteLast(dll);
				break;
			}
		}
		long t2 = System.nanoTime();
//		System.out.println(((t2-t1)/1000000000.0) + "?§?");
		StringBuilder sb = new StringBuilder();
		for(int i =0; i < dll.size()+1;i++) {
			sb.append(dll.pop()+ " ");
		}
		sb.delete(sb.length()-1, sb.length());
		System.out.println(sb);
		stdIO.close();
	}

	private static void insert(Deque<Integer> dll, int value) {
		dll.push(value);
	}

	private static void delete(Deque<Integer> dll, int value) {
		dll.remove((Integer) value);
	}

	private static void deleteFirst(Deque<Integer> dll) {
		dll.removeFirst();
	}

	private static void deleteLast(Deque<Integer> dll) {
		dll.removeLast();
	}
}
class InputOutput {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public int getValue() {
		int n = 0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return n;
	}
	public String[] getLineStringArray() {
		try {
			return br.readLine().trim().split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}


	public void close() {
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}