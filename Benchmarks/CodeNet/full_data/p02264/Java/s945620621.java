import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AizuQueue solver = new AizuQueue();
        solver.solve(1, in, out);
        out.close();
    }

    static class AizuQueue {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int n = in.nextInt();
            final int q = in.nextInt();

			Queue queue = new Queue();
            for (int i = 0; i < n; i++) {
                final String id = in.next();
                final int t = in.nextInt();

                queue.enqueue(new Pair(id, t));
            }

            long curr = 0L;
            while (!queue.isEmpty()) {
                Pair p = queue.dequeue();

                if (p.t > q) {
                    curr += q;
                    p.t -= q;
                    queue.enqueue(p);
                } else {
                    curr += p.t;
                    out.printf("%s %d\n", p.id, curr);
                }
            }
        }

        static class Queue {
            private Node head;
            private Node tail;

            public Queue() {
                head = tail = null;
            }

            public void enqueue(final Pair p) {
                Node n = new Node(p, null, null);

                if (head == null) {
                    head = tail = n;
                } else {
                    tail.next = n;
                    n.prev = tail;
                    tail = n;
                }
            }

            public Pair dequeue() {
                if (head == null) {
                    throw new IllegalStateException("empty queue");
                }

                final Pair p = head.key;
                head = head.next;

                if (head == null) {
                    tail = null;
                }

                return p;
            }

            public boolean isEmpty() {
                return head == null;
            }

            static class Node {
				Pair key;
                Node next;
                Node prev;

                public Node(final Pair key, final Node prev, final Node next) {
                    this.key = key;
                    this.prev = prev;
                    this.next = next;
                }

            }

        }

        static class Pair {
            String id;
            int t;

            public Pair(final String id, final int t) {
                this.id = id;
                this.t = t;
            }

        }

    }
}


