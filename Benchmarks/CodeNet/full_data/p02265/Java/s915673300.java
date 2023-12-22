import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        DoublyLinkedList list = new DoublyLinkedList();
        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.equals("insert")) {
                int x = sc.nextInt();
                list.insert(x);
            } else if (s.equals("delete")) {
                int x = sc.nextInt();
                list.delete(x);
            } else if (s.equals("deleteFirst")) {
                list.deleteFirst();
            } else if (s.equals("deleteLast")) {
                list.deleteLast();
            }
        }

        list.printer();
    }

    // 双方向連結リストのノード
    static class Node {
        private int key;
        private Node prev;  // 一つ前
        private Node next;  // 一つ後

        Node(int x) {
            key = x;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getKey() {
            return key;
        }

        public Node getPrev() {
            return prev;
        }

        public Node getNext() {
            return next;
        }

        public void refresh() {
            prev = null;
            next = null;
        }
    }

    // 双方向連結リスト
    static class DoublyLinkedList {
        PrintWriter pw = new PrintWriter(System.out);
        Node first;
        Node last;

        // 連結リストの先頭にキーxを持つ要素を追加する
        void insert(int x) {
            Node tmp = new Node(x);
            if (first == null) {
                first = tmp;
                last = tmp;
            } else {
                first.setPrev(tmp);
                tmp.setNext(first);
                first = tmp;
            }
        }

        // キーxを持つ最初の要素を連結リストから消去する
        void delete(int x) {
            Node tmp = first;
            while (tmp.getKey() != x) {
                tmp = tmp.next;
                if (tmp == null)
                    break;
            }

            if (tmp != null) {
                if (tmp == first) {
                    deleteFirst();
                } else if (tmp == last) {
                    deleteLast();
                } else {
                    Node prev = tmp.getPrev();
                    Node next = tmp.getNext();
                    prev.setNext(next);
                    next.setPrev(prev);
                    tmp.refresh();
                }
            }
        }

        // 連結リストの先頭の要素を消去する
        void deleteFirst() {
            if (first.getNext() != null) {
                Node tmp = first.getNext();
                tmp.setPrev(null);
                first.refresh();
                first = tmp;
            } else {
                first = null;
                last = null;
            }
        }

        // 連結リストの末尾の要素を消去する
        void deleteLast() {
            if (last.getPrev() != null) {
                Node tmp = last.getPrev();
                tmp.setNext(null);
                last.refresh();
                last = tmp;
            } else {
                first = null;
                last = null;
            }
        }

        // リストの中身を表示する
        void printer() {
            Node tmp = first;
            while (true) {
                if (tmp.getNext() != null) {
                    pw.print(tmp.key + " ");
                    tmp = tmp.getNext();
                } else {
                    pw.println(tmp.getKey());
                    pw.flush();
                    break;
                }
            }
        }
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
