import java.util.*;
import java.io.*;
import java.nio.file.Paths;

class DoublyLinkedList implements Iterable<Integer> {  

	private Node virtualNode;

	class Node {
		int value;
		Node prev;
		Node next;

		Node(int x) {
			value = x;
			prev = null;
			next = null;
		}
	}

	public DoublyLinkedList() {
		virtualNode = new Node(0);
		virtualNode.next = virtualNode;
		virtualNode.prev = virtualNode;
	}

	// insert to the front
	public void insert(int x) {
		Node node = new Node(x);
		node.next = virtualNode.next;
		virtualNode.next.prev = node;
		virtualNode.next = node;
		node.prev = virtualNode;
	}

	private Node linearSearch(int x) {
		Node currentNode = virtualNode.next;
		// there is no element
		if (currentNode == virtualNode)
			return null;
		while (currentNode != virtualNode) {
			if (currentNode.value != x)
				currentNode = currentNode.next;
			else 
				return currentNode;
		}

	// nothing matched found
		return null;
	}

	
	public void delete(int x) throws Exception {
		Node nodeDeleted = linearSearch(x);
		if (nodeDeleted == null) {
			return;
		}else {
			delete(nodeDeleted);
		}
	}

	private void delete(Node nodeDeleted) throws Exception {

		if (!isEmpty()){
			Node prevNode = nodeDeleted.prev;
			Node nextNode = nodeDeleted.next;
			prevNode.next = nextNode;
			nextNode.prev = prevNode;
		}else {
			throw new Exception("List is empty");
		}
		
	}

	public void deleteFirst() throws Exception {
		delete(virtualNode.next);
	}

	public void deleteLast() throws Exception {
		delete(virtualNode.prev);
	}

	public int pop() throws Exception {
		int v = virtualNode.next.value;
		deleteFirst();
		return v;			
	}

	private boolean isEmpty() {
		return virtualNode.next == virtualNode;
	}

	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			private Node currentNode = virtualNode.next;

			public boolean hasNext() {
				return currentNode != virtualNode;
			}

			public Integer next() {
				int v = currentNode.value;
				currentNode = currentNode.next;
				return v;
			}
		};
	}
}


public class Main
{
	public static void main(String[] args) {

		DoublyLinkedList list = new DoublyLinkedList();

		// BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try{
			int n = Integer.parseInt(reader.readLine());

			System.out.println(n+"");

			String line;

			for (int i = 0; i < n; i++) {

				line = reader.readLine();
			
				if (line.charAt(0) == 'i') {
					list.insert(Integer.parseInt(line.substring(7)));
				}else if (line.charAt(6) == ' ') {
					list.delete(Integer.parseInt(line.substring(7)));
				}else if (line.charAt(6) == 'F') {
					list.deleteFirst();
				}else {
					list.deleteLast();
				}

				System.out.println(line);
			}

			StringBuilder builder = new StringBuilder();
			builder.append(list.pop());

			for (int i: list) {
				builder.append(" " + i);
			}
			System.out.println(builder.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}