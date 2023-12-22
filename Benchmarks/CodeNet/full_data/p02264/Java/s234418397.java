import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int q = sc.nextInt();

        Queue queue = new Queue(n);
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int time = sc.nextInt();
            Process x = new Process(name, time);
            queue.enqueue(x);
        }

        int time = 0;
        while (!queue.isEmpty()) {
            Process x = queue.dequeue();
            if (x.time - q <= 0) {
                time += x.time;
                pw.print(x.name + " ");
                pw.println(time);
            } else {
                time += q;
                x.time -= q;
                queue.enqueue(x);
            }
        }

        pw.flush();
    }

    static class Process {
        String name;
        int time;

        Process(String name, int time) {
            this.name = new String(name);
            this.time = time;
        }
    }

    static class Queue {
        Process[] Q;
        int lastIndex;
        int head;
        int tail;

        Queue(int n) {
            Q = new Process[n + 1];
            lastIndex = n;
            head = 0;
            tail = 0;
        }

        void enqueue(Process x) {
            Q[tail++] = new Process(x.name, x.time);
            if (tail > lastIndex)
                tail = 0;
        }

        Process dequeue() {
            Process x = Q[head++];
            if (head > lastIndex)
                head = 0;
            return x;
        }

        boolean isEmpty() {
            return head == tail ? true : false;
        }
    }
}
