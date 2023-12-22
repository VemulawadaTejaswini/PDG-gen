import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = new Node(0, null, null);
        head.next = head;
        head.pre = head;
        int size = 0;

        for (int i = 0; i < n; i++) {
            String command = sc.next();
            int key;

            switch(command) {
              case "insert" :
                  key = sc.nextInt();
                  insert(key, head, size);
                  size++;
                  break;
              case "delete" :
                  key = sc.nextInt();
                  if(delete(key, head, size) != null) {
                      size--;
                  }
                  break;
              case "deleteFirst" :
                  deleteFirst(head);
                  size--;
                  break;
              case "deleteLast" :
                  deleteLast(head);
                  size--;
                  break;
            }
        }

        Node node = head.next;
        while (true) {
            System.out.print(node.key);
            node = node.next;

            if (node == head) {
                System.out.println();
                break;
            }

            System.out.print(" ");
        }
    }

    public static Node insert(int key, Node head, int size) {
        Node node = new Node(key, head.next, head);
        head.next.pre = node;
        head.next = node;

        return node;
    }

    public static Node delete(int key, Node head, int size) {
      Node node = head.next;
      while (true) {
          if (key == node.key) {
              node.pre.next = node.next;
              node.next.pre = node.pre;
              return node;
          }

          node = node.next;
          if (node == head) {
              return null;
          }
      }
    }

    public static void deleteFirst(Node head) {
        head.next = head.next.next;
        head.next.pre = head;
    }

    public static void deleteLast(Node head) {
        head.pre = head.pre.pre;
        head.pre.next = head;
    }
}

class Node {
    int key;
    Node next;
    Node pre;

    public Node(int key, Node next, Node pre) {
        this.key = key;
        this.next = next;
        this.pre = pre;
    }
}

