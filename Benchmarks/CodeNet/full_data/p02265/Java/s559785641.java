import java.io.IOException;
import java.util.Scanner;
public class Main {

	static Node head;

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        head = new Node(null);
        head.next = head;
        head.prev = head;

        int o = sc.nextInt();

        for(int i=0; i<o; i++) {
        	String line = sc.next();
        	if(line.equals("insert")) {
            	int x = sc.nextInt();
        		insert(x);
        	}else if(line.equals("delete")) {
            	int x = sc.nextInt();
        		delete(x);
        	}else if(line.equals("deleteFirst")) {
        		deleteFirst();
        	}else if(line.equals("deleteLast")) {
        		deleteLast();
        	}
        }
        showAll();
        sc.close();
    }

    public static void insert(int x) {
    	Node p = new Node(x);
    	p.next = head.next;
    	head.next.prev = p;
    	p.prev = head;
    	head.next = p;
    }

    public static void delete(int x) {
    	Node p = head.next;
    	while(true) {
    		if(p.value==x) {
    			p.next.prev = p.prev;
    			p.prev.next = p.next;
    			break;
    		}else if(p.value!=x){
    			p = p.next;
    		}else if(p.value==null){
    			break;
    		}
    	}
    }

    public static void deleteFirst() {
    	Node p = head.next;
    	p.next.prev = p.prev;
		p.prev.next = p.next;
    }

    public static void deleteLast() {
    	Node p = head.prev;
    	p.prev.next = head;
    	head.prev = p.prev;
    }

    public static void showAll() {
    	Node p = head.next;
    	while(true) {
    		if(p.value!=null) {
    			System.out.print(p.value + " ");
    			p = p.next;
    		}else if(p.value==null) {
    			break;
    		}
    	}
    }
}

class Node {
	Integer value;
	Node prev;
	Node next;

	Node(Integer value){
		prev = next = null;
		this.value = value;
	}
}
