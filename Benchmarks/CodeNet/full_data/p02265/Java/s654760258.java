import java.io.*;
import java.util.Scanner;
 
class Element {
    Element next;
    Element prev;
    int key;
    Element(int a) {
        key = a;
    }
}
  
class DoubleyLinkedList {
    Element head;
    DoubleyLinkedList() {
        head = new Element(-1);
        head.next = head;
        head.prev = head;
    }
      
    void insert(int key) {
        Element e = new Element(key);
        e.next = head.next;
        e.prev = head;
        e.next.prev = e;
        head.next = e;
    }

    void delete(int key) {
        for (Element e = head.next; e != head; e = e.next) {
            if (e.key == key) {
                e.prev.next = e.next;
                e.next.prev = e.prev;
                break;
            }
        }
    }

    void deleteFirst() {
        Element e = head.next;
        e.next.prev = head;
        head.next = e.next;
    }
    
    void deleteLast() {
        Element e = head.prev;
        e.prev.next = head;
        head.prev = e.prev;
    }
      
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Element e = head.next; e != head; e = e.next) {
            sb.append(e.key);
            sb.append(' ');
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append('\n');
        return sb.toString();
    }
}
  
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        DoubleyLinkedList list = new DoubleyLinkedList();
        for (int i = 0; i < n; i++) {
        	String op=sc.next();
            if (op.equals("insert")) {
                int x=sc.nextInt();
            	list.insert(x);
            } else if (op.equals("delete")) {
            	int x=sc.nextInt();
            	list.delete(x);
            } else if (op.equals("deleteFirst")) {
                list.deleteFirst();
            } else if (op.equals("deleteLast")) {
                list.deleteLast();
            }
        }
        System.out.print(list.toString());
    }
}