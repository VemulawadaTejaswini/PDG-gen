import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{

	public static class Node {
		int value;
		Node previousNode;
		Node nextNode;

		public Node(int value) {
			this.value = value;
			this.previousNode = null;
			this.nextNode = null;
		}

		public void setPreviousNode(Node node) {
			this.previousNode = node;
		}

		public void setNextNode(Node node) {
			this.nextNode = node;
		}
	}

	static Node head = null;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Scanner s = new Scanner(System.in);
		int cnt = new Integer(br.readLine()).intValue();
		for(int i=0 ; i<cnt ; i++) {
			String[] str = br.readLine().split(" ");
			if("insert".equals(str[0])) {
				insert(new Integer(str[1]).intValue());
			}else if("delete".equals(str[0])) {
				delete(new Integer(str[1]).intValue());
			}else if("deleteFirst".equals(str[0])) {
				deleteFirst();
			}else if("deleteLast".equals(str[0])) {
				deleteLast();
			}
		}
		if(br!=null) {
			br.close();
			br = null;
		}
		StringBuilder b = new StringBuilder();
		while(head!=null){
			b.append(head.value).append(" ");
			head = head.nextNode;
		}
		System.out.println(b.toString().trim());
	}

	public static void insert(int value) {
		if(head == null) {
			head = new Node(value);
			return;
		}
		Node current = new Node(value);
		head.previousNode = current;
		current.nextNode = head;
		head = current;
	}

	public static void delete(int value) {
		if(head == null) {
			return;
		}
		Node n = head;
		while(n != null) {
			if(n.value == value && n.nextNode!=null && n.previousNode!=null) {
				n.nextNode.previousNode = n.previousNode;
				n.previousNode.nextNode = n.nextNode;
				n = null;
				System.gc();
				break;
			}else if(n.value==value && n.previousNode==null && n.nextNode!=null){
				deleteFirst();
				break;
			}

			else if(n.value==value && n.nextNode==null && n.previousNode!=null){
				deleteLast();
				break;
			}


			n = n.nextNode;
		}
	}

	public static void deleteFirst() {
		if(head == null)
			return;
		if(head.nextNode == null) {
			head = null;
			return;
		}
		Node d = head.nextNode;
		head.nextNode = null;
		head = null;
		d.previousNode = null;
		//?????¢????§£???
		System.gc();
		head = d;

	}

	public static void deleteLast() {
		if(head == null)
			return;

		if(head.nextNode == null){
			head = null;
			return;
		}

		Node n = head;
		while(n.nextNode != null) {
			n = n.nextNode;
		}
		n.previousNode.nextNode = null;
		//?????¢????§£???
		n = null;
		System.gc();
	}
}