import java.util.*;

class Node {
    public int key;
    public Node next, pre;
    Node(int key) {
        this.key = key;
        next = pre = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Node head = new Node(0);
        Node last = new Node(0);
        head.next = last;
        last.pre = head;
        while(N-- > 0) {
            String ope = scan.next();
            if(ope.equals("insert")) {
                int num = scan.nextInt();
                Node node = new Node(num);
                node.pre = head;
                node.next = head.next;
                node.pre.next = node;
                node.next.pre = node;
            } else if(ope.equals("delete")) {
                int num = scan.nextInt();
                for(Node p = head.next; p != last; p = p.next) {
                    if(p.key == num) {
                        p.pre.next = p.next;
                        p.next.pre = p.pre;
                        break;
                    }
                }
            } else if(ope.equals("deleteFirst")) {
                head.next.next.pre = head;
                head.next = head.next.next;
            } else if(ope.equals("deleteLast")) {
                last.pre.pre.next = last;
                last.pre = last.pre.pre;
            }
        }
        for(Node p = head.next; p != last; p = p.next) {
            if(p != head.next) System.out.print(" ");
            System.out.print(p.key);
        }
        System.out.println();
    }
}