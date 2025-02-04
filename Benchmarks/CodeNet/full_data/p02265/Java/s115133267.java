import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		DLL dll = new DLL();
		for (int i = 0; i < n; i++) {
			String cmd = sc.next();
			if (cmd.equals("insert")) {
				dll.insert(sc.nextInt());
			} else if (cmd.equals("delete")) {
				dll.delete(sc.nextInt());
			} else if (cmd.equals("deleteFirst")) {
				dll.deleteFirst();
			} else if (cmd.equals("deleteLast")) {
				dll.deleteLast();
			}
			if (i % 1000 == 0) {
				System.gc();
			}
		}
    	
		StringBuffer printData = new StringBuffer();
		for (DLLelement next = dll.first; next != null; next = next.next) {
			printData.append(next.data);
			printData.append(" ");
		}
		printData.delete(printData.length() - 1, printData.length());
		System.out.println(printData);

		sc.close();
	}
}

class DLL {
	DLLelement first;
	DLLelement last;
	
	DLL() {
		first = null;
		last = null;
	}
	
	void insert(int x) {
		if (last == null) {
			first = new DLLelement(x, first, null);
			last = first;
		} else {
			first = new DLLelement(x, first, null);
			first.next.prev = first;
		}
	}

	void delete(int x) {
		for (DLLelement next = first; next != null; next = next.next) {
			if (next.data == x) {
				if (next.prev == null) {
					first = next.next;
					if (first == null) {
						last = null;
					} else {
						first.prev = null;
					}
				} else if (next.next == null) {
					last = next.prev;
					if (last == null) {
						first = null;
					} else {
						last.next = null;
					}
				} else {
					next.prev.next = next.next;
					next.next.prev = next.prev;
				}
				return;
			}
		}
//		System.out.println("not found");
	}

	void deleteFirst() {
		if (first == null) {
//			System.out.println("not found");
			return;
		} else {
			first = first.next;
			if (first == null) {
				last = null;
				return;
			}
			first.prev = null;
		}
	}

	void deleteLast() {
		if (last == null) {
//			System.out.println("not found");
			return;
		} else {
			last = last.prev;
			if (last == null) {
				first = null;
				return;
			}
			last.next = null;
		}
	}
}

class DLLelement {
	int data;
	DLLelement next;
	DLLelement prev;
	
	DLLelement(int x, DLLelement next, DLLelement prev) {
		data = x;
		this.next = next;
		this.prev = prev;
	}
}