import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class C {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = new Node(0, null, null);
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
        head.next = node;

        if (size == 0) {
          head.pre = node;
          node.next = head;
        } else {
          node.next.pre = node;
        }

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

    public static Node deleteFirst(Node head) {
        Node deletedNode = head.next;
        deletedNode.next.pre = head;
        head.next = deletedNode.next;
        return deletedNode;
    }

    public static Node deleteLast(Node head) {
        Node deletedNode = head.pre;
        head.pre = deletedNode.pre;
        deletedNode.pre.next = head;
        return deletedNode;
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

