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
        Node p = new Node(null);
        int x = 0;

        for(int i=0; i<o; i++) {
        	String line = sc.next();
        	if(line.equals("insert")) {
            	x = sc.nextInt();
        		insert(x, p);
        	}else if(line.equals("delete")) {
            	x = sc.nextInt();
        		delete(x, p);
        	}else if(line.equals("deleteFirst")) {
        		deleteFirst(p);
        	}else if(line.equals("deleteLast")) {
        		deleteLast(p);
        	}

        }
        showAll(p);
        sc.close();
    }

    public static void insert(int x, Node p) {
    	p = new Node(x);
    	p.next = head.next;
    	head.next.prev = p;
    	p.prev = head;
    	head.next = p;
    }

    public static void delete(int x, Node p) {
    	p = head.next;
    	while(true) {
    		if(p.value==x) {
    			p.next.prev = p.prev;
    			p.prev.next = p.next;
    			break;
    		}else if(p.value!=x){
    			p = p.next;
    		}

    		if(p.value==null){
    			break;
    		}
    	}
    }

    public static void deleteFirst(Node p) {
    	p = head.next;
    	p.next.prev = p.prev;
		p.prev.next = p.next;
    }

    public static void deleteLast(Node p) {
    	p = head.prev;
    	p.prev.next = head;
    	head.prev = p.prev;
    }

    public static void showAll(Node p) {
    	p = head.next;
    	while(true) {
    		if(p.value!=null) {
    			System.out.print(p.value);
    			if(p.next.value!=null) {
    				System.out.print(" ");
    			}
    			p = p.next;
    		}else if(p.value==null) {
    			break;
    		}
    	}
    	System.out.println();
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
