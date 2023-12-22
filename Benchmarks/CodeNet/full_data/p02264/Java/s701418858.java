import java.util.Scanner;

public class Main {

	static class Node<E> {
		public E value;
		public Node<E> next;		
		public Node(E value) {
			this.value = value;
			this.next = null;
		}
	}

	static class SimpleQueue<E> {
		
		private Node<E> head;
		private Node<E> tail;
		int size;
		
		public SimpleQueue() {
			size = 0;
			head = null;
			tail = null;
		}
		
		public int getSize() {
			return size;
		}
		
		public boolean isEmpty() {
			return size == 0;
		}
		
		public void enqueue(E element) {
			Node<E> node = new Node<E>(element);
			if (head == null && tail == null) {
				head = tail = node;
			} else {
				tail.next = node;
				tail = node;
			}
			size++;
		}
		
		public E dequeue() {			
			if (isEmpty()) {
				return null;
			}
			E element = head.value;
			head = head.next;
			if (head == null) {
				tail = null;
			}
			size--;
			return element;			
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			Node<E> current = head;
			while (current != null) {
				sb.append(current.value);
				current = current.next;
				if (current != null) {
					sb.append(", ");
				}
			}			
			sb.append("](");
			if (tail != null) {
				sb.append(tail.value);
			}
			sb.append(")");
			return sb.toString();
		}		
	}
	
	static class Process {		
		public String name;
		public int time;		
		public Process(String name, int time) {
			this.name = name;
			this.time = time;
		}		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		SimpleQueue<Process> queue = new SimpleQueue<Process>();
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int time = sc.nextInt();
			queue.enqueue(new Process(name, time));
		}
		sc.close();

		int total = 0;
		while (!queue.isEmpty()) {
			
			Process process = queue.dequeue();
			if (process.time > q) {
				process.time = process.time - q;
				total += q;
				queue.enqueue(process);
			} else {
				total += process.time;
				System.out.println(process.name + " " + total);
			}			
		}
	}
}


