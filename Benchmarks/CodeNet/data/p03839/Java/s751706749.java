import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int positiveCount = 0;
        int maxQueueCount = 0;
        int queuePositiveCount = 0;
        MyQueue queue = new MyQueue(k);
        for (int i = 0; i < k; i++) {
            int e = scanner.nextInt();
            if (e > 0)
                positiveCount += e;
            queue.add(e);
        }
        for (int i = 0; i < n - k; i++) {
            int e = scanner.nextInt();
            if (e > 0)
                positiveCount += e;
            queue.add(e);
            if (queue.count >= maxQueueCount) {
                maxQueueCount = queue.count;
                queuePositiveCount = queue.positiveCount();
            }
        }
        System.out.println(positiveCount-queuePositiveCount+maxQueueCount);
    }

    static class MyQueue {
        Node first;
        Node last;
        int cap;
        int size;
        int count;

        MyQueue(int cap) {
            this.cap = cap;
        }

        void add(int e) {
            Node newNode = new Node();
            newNode.value = e;
            if (size == 0) {
                last = newNode;
                first = last;
                size++;
                count += e;
            } else if (size < cap) {
                newNode.prev = last;
                last.next = newNode;
                last = newNode;
                size++;
                count += e;
            } else {
                newNode.prev = last;
                last.next = newNode;
                last = newNode;
                count += e;
                count -= first.value;
                first = first.next;
                first.prev = null;
            }
        }

        int positiveCount() {
            Node cur = first;
            int result = 0;
            while (cur != null) {
                if (cur.value > 0)
                    result += cur.value;
                cur = cur.next;
            }
            return result;
        }
    }

    static class Node {
        Node prev, next;
        int value;
    }
}