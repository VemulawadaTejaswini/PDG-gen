import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
//        in.nextLine();
        DoublyLinkedList list = new DoublyLinkedList();
        for (int i = 0; i < n; i++) {
            String command = in.readLine();
            list.readCommand(command);
        }
        in.close();
        System.out.println(list);
    }
}

class DoublyLinkedList {
    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void insert(int x) {
        if (head == null) {
            head = new Node(x);
            head.next = head;
            head.prev = head;
        } else {
            Node node = new Node(x);
            head.prev.next = node;
            node.next = head;
            node.prev = head.prev;
            head.prev = node;
            head = node;
        }
    }

    void delete(int x) {
        Node node = head;
        do {
            if (node.data == x) {
                if (node.next.equals(node)) {
                    head = null;
                } else {
                    if (node.equals(head)) {
                        head = node.next;
                    }
                    node.prev.next = node.next;
                    node.next.prev = node.prev;
                }

                node.prev = null;
                node.next = null;
                return;
            }
            node = node.next;
        } while (!node.equals(head));
    }

    void deleteFirst() {
        Node node = head;

        if (node.next.equals(node)) {
            head = null;
        } else {
            head = node.next;
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        node.prev = null;
        node.next = null;
    }

    void deleteLast() {
        Node node = head.prev;

        if (node.next.equals(node)) {
            head = null;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        node.prev = null;
        node.next = null;
    }

    void readCommand(String command) {
        String[] split = command.split(" ");
        switch (split[0]) {
            case "insert": insert(Integer.parseInt(split[1]));break;
            case "delete": delete(Integer.parseInt(split[1])); break;
            case "deleteFirst": deleteFirst(); break;
            case "deleteLast": deleteLast(); break;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        do {
            stringBuilder.append(node.data).append(" ");
            node = node.next;
        } while (!node.equals(head));
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
