import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Elementary data structures - Doubly Linked List
 */
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int n = parseInt(br.readLine());
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

		for (int i = 0; i < n; i++) {
			line = br.readLine();
			if (line.charAt(0) == 'i') {
				int x = parseInt(line.substring(line.indexOf(' ') + 1));
				list.insert(x);
			} else {
				char c = line.charAt(6);
				if (c == ' ') {
					int x = parseInt(line.substring(line.indexOf(' ') + 1));
					list.delete(x);
				} else if (c == 'F') {
					list.deleteFirst();
				} else {
					list.deleteLast();
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if (i != list.size() - 1) {
				System.out.print(list.get(i) + " ");
			} else {
				System.out.println(list.get(i));
			}
		}

	} //end main
}

class DoublyLinkedList<T> {

	private Node first = null;
	private Node last = null;
	private int size = 0;

	//??£?????????????????????????????? x ?????????????´?????¶?????¶????
	void insert(T x) {
		if (first == null) {
			first = new Node(x);
			last = first;
		} else {
			Node n = new Node(x);
			n.next = first;
			first.prev = n;
			first = n;
		}
		size++;
	}

	int size() {
		return this.size;
	}

	T get(int i) {
		if (i >= size) return null;
		Node n = first;
		while (i > 0) {
			n = n.next;
			i--;
		}
		return n.value;
	}

	//?????? x ??????????????????????´??????£??????????????????????????????
	void delete(T x) {
		Node n = first;
		while (true) {
			if (n == null) break;
			if (n.value.equals(x)) {
				if (n == first) {
					deleteFirst();
				} else if (n == last) {
					deleteLast();
				} else {
					n.prev.next = n.next;
					n.next.prev = n.prev;
					size--;
				}
				break;
			}
			n = n.next;
		}
	}

	//?????????????????????????´????????????????
	void deleteFirst() {
		first = first.next;
		if (first == null) {
			last = null;
		} else {
			first.prev = null;
		}
		size--;
	}

	//????????????????°????????´????????????????
	void deleteLast() {
		last = last.prev;
		if (last == null) {
			first = null;
		} else {
			last.next = null;
		}

		size--;
	}

	class Node {
		T value;
		Node prev;
		Node next;

		Node(T x) {
			this.value = x;
		}
	}
}