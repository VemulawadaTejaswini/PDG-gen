import java.util.Scanner;

public class Main {

	static class Node<E> {
		E value;
		Node<E> prev;
		Node<E> next;
		public Node(E value) {
			this.value = value;
			prev = null;
			next = null;
		}
		public String toString() {
			return value.toString();
		}
	}
	
	static class DoublyLinkedList<E> {		
		
		private Node<E> head;
		private Node<E> tail;
		private int size;
		
		public DoublyLinkedList() {
			head = null;
			tail = null;
			size = 0;
		}
		
		public int getSize() {
			return size;
		}
		
		public boolean isEmpty() {
			return size == 0;
		}
		
		public void appendToHead(E element) {
			Node<E> node = new Node<E>(element);
			if (head == null && tail == null) {
				head = tail = node;
			} else {
				head.prev = node;
				node.next = head;
				head = node;
			}
			size++;			
		}
		
		public void delete(E element) {

			if (isEmpty()) {
				return;
			}
			
			if (head.value.equals(element)) {
				deleteFirst();
			} else {
				Node<E> current = head.next;
				while (current != null) {
					if (current.value.equals(element)) {
						Node<E> prev = current.prev;
						Node<E> next = current.next;
						prev.next = next;
						if (next != null) {
							next.prev = prev;
						} else {
							tail = prev;
						}
						size--;
						break;
					} else {
						current = current.next;
					}
				}
			}			
		}

		public void deleteFirst() {			
			if (isEmpty()) {
				return;
			}
			if (size == 1) {
				head = null;
				tail = null;
			} else {
				head = head.next;
				head.prev = null;
			}
			size--;
		}
		
		public void deleteLast() {			
			if (isEmpty()) {
				return;
			}
			if (size == 1) {
				head = null;
				tail = null;
			} else {
				tail = tail.prev;
				tail.next = null;
			}
			size--;
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			Node<E> current = head;
			while (current != null) {
				sb.append(current);
				current = current.next;
				if (current != null) {
					sb.append(" ");
				}
			}
			return sb.toString();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		DoublyLinkedList<String> list = new DoublyLinkedList<String>();
		for (int i = 0; i < n; i++) {
			String command = sc.next();
			if (command.equals("insert") || command.equals("delete")) {
				String value = sc.next();
				if (command.equals("insert")) {
					list.appendToHead(value);
				} else {
					list.delete(value);
				}				
			} else if (command.endsWith("deleteFirst")) {
				list.deleteFirst();
			} else if (command.equals("deleteLast")) {
				list.deleteLast();
			} else {
				System.out.println("Unknown command:" + command);
			}
		}
		sc.close();		
		System.out.println(list);
	}
}

