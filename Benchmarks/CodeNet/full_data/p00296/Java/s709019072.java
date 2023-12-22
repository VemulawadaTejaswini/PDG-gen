import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		LinkList list = new LinkList();
		
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		int q = stdIn.nextInt();
		
		boolean[] XList = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			list.add(i);
		}
		list.now = list.dummy.next;
		for(int i = 0; i < m; i++) {
			int a = stdIn.nextInt();
			if(a%2 == 0) {
				for(int j = 0; j < a; j++) {
					list.now = list.now.next;
					if(list.now.id == -1) {
						j--;
					}
				}
			}
			else if(a %2 == 1) {
				for(int j = 0; j < a; j++) {
					list.now = list.now.prev;
					if(list.now.id == -1) {
						j--;
					}
				}
			}
			XList[list.now.id] = true;
			list.remove();
		}
		
		for(int i = 0; i < q; i++) {
			int qx = stdIn.nextInt();
			System.out.println((XList[qx])?"0":"1");
		}
		
	}

}

class LinkList {
	Node now;
	Node dummy;

	LinkList() {
		now = new Node(-1);
		dummy = now;
	}
	
	void add(int id) {
		Node tmp = new Node(id);
		now.next = tmp;
		tmp.prev = now;
		tmp.next = dummy;
		now = tmp;
	}
	
	void remove() {
		Node tmp = now;
		tmp.next.prev = tmp.prev;
		tmp.prev.next = tmp.next;
		
		now = tmp.next;
	}
}

class Node {
	int id;
	Node next;
	Node prev;
	
	Node(int id) {
		this.id = id;
	}
}