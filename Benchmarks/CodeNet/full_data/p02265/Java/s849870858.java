import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static class DoublyLinkedList<T> {
        class Node<T> {
            T value;
            Node<T> prev;
            Node<T> next;
        }

        final Node<T> nil;

        DoublyLinkedList() {
            nil = new Node<T>();
            nil.prev = nil;
            nil.next = nil;
        }

        void insert(T x) {
            Node<T> n = new Node<>();
            n.value = x;
            n.prev = nil;
            n.next = nil.next;
            nil.next.prev = n;
            nil.next = n;
        }

        void delete(T x) {
            Node<T> c = nil.next;
            while (c != nil) {
                if (c.value.equals(x)) {
                    // find
                    delete(c);
                    return;
                }
                c = c.next;
            }
        }

        void deleteFirst() {
            delete(nil.next);
        }

        void deleteLast() {
            delete(nil.prev);
        }

        void delete(Node<T> n) {
            if (n == nil) return;
            n.prev.next = n.next;
            n.next.prev = n.prev;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<T> c = nil.next;
            boolean append = false;
            while (c != nil) {
                if (append) {
                    sb.append(" ");
                }
                sb.append(c.value);
                c = c.next;
                append = true;
            }
            return sb.toString();
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        for (int i = 0; i < n; i++) {
            String[] command = sc.readLine().split(" ");
            switch (command[0]) {
                case "insert":
                    list.insert(Integer.parseInt(command[1]));
                    break;
                case "delete":
                    list.delete(Integer.parseInt(command[1]));
                    break;
                case "deleteFirst":
                    list.deleteFirst();
                    break;
                case "deleteLast":
                    list.deleteLast();
                    break;
            }
        }
        System.out.println(list);
    }
}
