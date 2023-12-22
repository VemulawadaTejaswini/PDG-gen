public class Main {
	
	public static void main(String[] args) {
		List list = new List();
		
		int n = nextInt();
		
		for (int i = 0; i < n; i ++) {
			next();
			if(nextlen > 7) {
				if (nextbuf[6] == 'F') {
					list.deleteFirst();
				} else {
					list.deleteLast();
				}
			} else if (nextbuf[0] == 'd') {
				list.delete(nextInt());
			} else {
				list.insert(nextInt());
			}
		}
		
		List.Node cur = list.nil.next;
		System.out.print(cur.key);
		cur = cur.next;
		
		for (; cur != list.nil; cur = cur.next) {
			System.out.print(" ");
			System.out.print(cur.key);
		}
		System.out.println();
	}
	
	private static class List {
		private static class Node {
			int key;
			Node next, prev;
		}
		
		private Node nil;
		
		private List() {
			nil = new Node();
			nil.next = nil;
			nil.prev = nil;
		}
		
		private void insert(int key) {
			Node x = new Node();
			x.key = key;
			x.next = nil.next;
			nil.next.prev = x;
			nil.next = x;
			x.prev = nil;
		}
		
		private void deleteNode(Node t) {
			t.prev.next = t.next;
			t.next.prev = t.prev;
		}
		
		private void delete(int key) {
			Node cur = nil.next;
			while(cur.key != key) {
				if (cur == nil) return;
				cur = cur.next;
			}
			deleteNode(cur);
		}
		
		private void deleteFirst() {
			deleteNode(nil.next);
		}
		
		private void deleteLast() {
			deleteNode(nil.prev);
		}
	}
	
	private static byte[] buf = new byte[1 << 20];
	private static int len = 0;
	private static int ptr = 0;
	
	private static byte read() {
		if (ptr >= len) {
			try {
				len = System.in.read(buf);
			} catch (Exception e) {
			}
			ptr = 0;
		}
		
		return buf[ptr++];
	}
	
	private static int nextInt() {
		int num = 0;
		
		byte b = read();
		while(!Character.isDigit(b)) b = read();
		while(Character.isDigit(b)) {
			num *= 10;
			num += b - '0';
			b = read();
		}
		
		return num;
	}
	
	private static byte[] nextbuf = new byte[11];
	private static int nextlen;
	
	private static void next() {
		nextlen = 0;
		
		byte b = read();
		while(!Character.isAlphabetic(b) && !Character.isDigit(b)) b = read();
		while(Character.isAlphabetic(b) || Character.isDigit(b)) {
			nextbuf[nextlen++] = b;
			b = read();
		}
	}
}

