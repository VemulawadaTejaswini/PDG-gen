import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	DoublyLinkedList first;
	public static void main(String args[]) {
		new Main().run();
	}
	public void run() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		first = new DoublyLinkedList(-1);
		try {
			int n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				String line = br.readLine();
				String text[] = line.split(" ");
				String command = text[0];
				int num;
				switch(command.charAt(command.length() - 4)) {
				case 's'://insert
					num = Integer.parseInt(text[1]);
					insertHead(num);
					break;
				case 'l'://delete
					num = Integer.parseInt(text[1]);
					deleteKey(num);
					break;
				case 'i'://deleteFirst
					deleteFirst();
					break;
				case 'L'://deleteLast
					deleteLast();
					break;
				}
			}
			printList();
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public void insertHead(int n) {
		if (first.num >= 0){
			DoublyLinkedList dll = new DoublyLinkedList(n);
			dll.setNext(first);
			first.setBack(dll);
			first = dll;
		} else {
			first = new DoublyLinkedList(n);
		}
	}
	public void deleteKey(int n) {
		DoublyLinkedList dll = first;
		if (first.num == n) {
			deleteFirst();
			return;
		}
		while(dll != null) {
			if (dll.num == n) {
				if (dll.next != null) {
					dll.next.setBack(dll.back);
				}
				dll.back.setNext(dll.next);
				return;
			}
			dll = dll.next;
		}
	}
	public void deleteFirst() {
		if (first.next != null) {
			first = first.next;
		} else {
			first = new DoublyLinkedList(-1);
		}
	}
	public void deleteLast() {
		DoublyLinkedList dll = first;
		while (dll.next != null)
			dll = dll.next;
		if (dll != first) {
			dll.back.setNext(null);
		} else {
			first = new DoublyLinkedList(-1);
		}
	}
	public void printList() {
		DoublyLinkedList dll = first;
		boolean flag = true;
		while (dll != null) {
			System.out.print((flag?"":" ") + dll.num);
			dll = dll.next;
			flag = false;
		}
		System.out.println();
	}
}

class DoublyLinkedList {
	int num;
	DoublyLinkedList next,back;
	DoublyLinkedList(int n) {
		num = n;
	}
	public void setNext(DoublyLinkedList dll) {
		next = dll;
	}
	public void setBack(DoublyLinkedList dll) {
		back = dll;
	}
}
