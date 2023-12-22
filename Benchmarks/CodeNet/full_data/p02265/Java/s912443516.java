import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.nextLine();

		DoublyLL ll = new DoublyLL();

		loop:
		for (int i=0; i < n; i++) {
			String command = sc.nextLine();

			switch (command) {
			case "deleteFirst":
				ll.deleteFirst();
				continue loop;
			case "deleteLast":
				ll.deleteLast();
				continue loop;
			}

			int x = Integer.parseInt(command.split(" ")[1]);

			switch (command.split(" ")[0]) {
			case "insert":
				ll.insert(x);
				continue;
			case "delete":
				ll.delete(x);
				continue;
			}
		}

		int l = ll.length;
		Element e = ll.first;
		for (int i = 1; i < l; i++) {
			System.out.print(e.key + " ");
			e = e.next;
		}
		System.out.println(e.key);
	}

//	static class DoublyLL<T> {
//
//	}

	static class DoublyLL {
		// first element of this list
		Element first = null;

		Element last = null;

		// the number of elements in this list
		int length = 0;

		// constructor
		DoublyLL(int x) {
			this.first = new Element(x);
			this.last = this.first;
			this.first.previous = this.last;
			this.first.next = this.last;
			length = 1;
		}

		DoublyLL() {}

		// insert x
		void insert(int x) {
			if (length==0) {
				DoublyLL temp = new DoublyLL(x);
				this.first = temp.first;
				this.last = temp.last;
				length++;
				return;
			}
			Element newfirst = new Element(this.last, x, this.first);
			this.first.previous = newfirst;
			this.last.next = newfirst;
			this.first = newfirst;
			length++;
			return;
		}

		// delete x
		void delete(int x) {

//			if (this.first.key == x) {
//				Element newfirst = this.first.next;
//				newfirst.previous = null;
//				this.first = newfirst;
//				return this;
//			}

			if (length==1)
				if (this.first.key == x) {
					this.first = this.last = null;
					length--;
					return;
				}

			if (length==0) return;

			Element e = this.first;

			for (int i = 0; i < length; i++) {
				if (e.key == x) {
					Element p = e.previous;
					Element n = e.next;
					p.next = n;
					n.previous = p;
					if (i == 0) this.first = n;
					else if (i == length-1) this.last = p;
					length--;
					return;
				} else {
					e = e.next;
				}
			}

			return;
		}

		void deleteFirst() {
			if (length <= 1) {
				this.first = this.last = null;
				length = 0;
				return;
			}
			Element n = this.first.next;
			this.first = n;
			length--;
			return;
		}

		void deleteLast() {
			if (length <= 1) {
				this.first = this.last = null;
				length = 0;
				return;
			}
			Element p = this.last.previous;
			this.last = p;
			length--;
			return;
		}
	}
}

class Element {
	Element previous;

	int key;

	Element next;

	Element(Element previous, int key, Element next) {
		this.key = key;
		this.next = next;
		this.previous = previous;
	}

	Element(int key) {
		this(null, key, null);
	}
}