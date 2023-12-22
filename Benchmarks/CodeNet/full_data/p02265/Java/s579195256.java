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
				continue;
			case "deleteLast":
				ll.deleteLast();
				continue;
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
		DoublyLL.Element e = ll.first;
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

		class Element {
//			Element previous;

			int key;

			Element next;

			Element(int key, Element next) {
				this.key = key;
				this.next = next;
//				this.previous = previous;
			}

			Element(int key) {
				this(key, null);
			}
		}

		// first element of this list
		Element first = null;

//		Element last = null;

		// the number of elements in this list
		int length = 0;

//		 constructor
//		DoublyLL(int x) {
//			this.first = new Element(x);
//			this.last = this.first;
//			this.first.previous = this.last;
//			this.first.next = this.last;
//			length = 1;
//		}
		// constructor
		DoublyLL() {}

		// insert x
		void insert(int x) {
//			if (length==0) {
////				DoublyLL temp = new DoublyLL(x);
//				this.first = new Element(x);
////				this.first.next = this.first.previous = this.first;
////				this.last = this.first;
//				length++;
//				return;
//			}
			Element newfirst = new Element(x, this.first);
//			this.first.previous = newfirst;
//			this.last.next = newfirst;
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

			if (length==0) return;

			if (length==1)
				if (this.first.key == x) {
//					this.first.previous = this.first.next = null;
					//?????±?????§??????
					this.first = null;
					length--;
					return;
				}


			Element e = this.first;
			Element en = e.next;
			if (e.key == x) {
				this.first = en;
			}

			for (int i = 1; i < length; i++) {
				if (en.key == x) {
//					Element p = e.previous;
//					Element n = e.next;
//					p.next = n;
//					n.previous = p;
//					if (i == 1) this.first = n;
//					else if (i == length) this.last = p;
//					//?????±?????§??????
//					e.next = e.previous = null;
					e.next = en.next;
					length--;
					return;
				} else {
					en = en.next;
					e = e.next;
				}
			}

			return;
		}

		void deleteFirst() {
//			if (length <= 1) {
//				this.first = this.last = null;
//				length = 0;
//				return;
//			}
//			Element n = this.first.next;
//			n.previous = this.last;
//			this.last.next = n;
//			//?????±?????§??????
//			this.first.next = this.first.previous = null;
			this.first = this.first.next;
			length--;
			return;
		}

		void deleteLast() {
//			if (length <= 1) {
//				this.first = this.last = null;
//				length = 0;
//				return;
//			}
//			Element p = this.last.previous;
//			p.next = this.first;
//			this.first.previous = p;
//			//?????±?????§??????
//			this.last.next = this.last.previous = null;
			Element e = this.first;
			for (int i=1; i <= length-2; i++) {
				e = e.next;
			}
			e.next = null;
//			this.last = p;
			length--;
			return;
		}
	}
}