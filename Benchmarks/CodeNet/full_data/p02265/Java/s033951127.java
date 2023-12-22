import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	MyDoublyLinkedList list = new MyDoublyLinkedList();
	for (int i = 0; i < n; i++) {
	    String[] input  = scan.nextLine().split(" ");
	    String command = input[0];
	    switch (command) {
	    case "insert":
		list.insert(Integer.parseInt(input[1]));
		break;
	    case "delete":
		list.delete(Integer.parseInt(input[1]));
		break;
	    case "deleteFirst":
		list.deleteFirst();
		break;
	    case "deleteLast":
		list.deleteLast();
		break;
	    }
	}
	list.printList();
    }
}

class Node {
    Node next;
    Node prev;
    int key;
    Node (int key) {
	this.key = key;
    }
}

class MyDoublyLinkedList {
    Node head;
    int size;
    MyDoublyLinkedList () {
	head = new Node(-1);
	head.next = head;
	head.prev = head;
	this.size = 0;
    }
    void insert (int x) {
	Node n = new Node(x);
	n.next = head.next;
	n.prev = head;
	head.prev = n;
	head.next = n;
	size++;
    }
    void delete (int x) {
	Node n = head;
	while (n.next.key != x){
	    n = n.next;
	}
	n.next = n.next.next;
	n.next.next.prev = n;
	size--;
    }
    void deleteFirst () {
	Node n = head.next;
	n.next.prev = head;
	head.next = n.next;
	size--;
    }
    void deleteLast () {
	Node n = head.prev;
	n.prev.next = head;
	head.prev = n.prev;
	size--;
    }
    void printList () {
	Node n = head.next;
	for (int i = 0; i < size - 1; i++){
	    System.out.print(n.key + " ");
	    n = n.next;
	}
	System.out.println(n.key);
    }
}