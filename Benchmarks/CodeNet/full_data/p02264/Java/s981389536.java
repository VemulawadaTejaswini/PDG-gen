import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.next());
        int quantum = Integer.parseInt(scanner.next());
        int sum = 0;
        Queue queue = new Queue();
        for (int i = 0; i < size; i++) {
            String name = scanner.next();
            int time = Integer.parseInt(scanner.next());
            if (time <= quantum) {
                sum += time;
                System.out.println(name + " " + sum);
            } else {
                sum += quantum;
                queue.enqueue(new Process(name, time - quantum));
            }
        }

        while (!queue.isEmpty()) {
            Process process = queue.dequeue();
            if (process.quantum <= quantum) {
                sum += process.quantum;
                System.out.println(process.name + " " + sum);
            } else {
                sum += quantum;
                queue.enqueue(new Process(process.name, process.quantum - quantum));
            }
        }
    }

    static class Queue {
        static final int SIZE = 100000;
        Process[] array = new Process[SIZE];
        int head = 0;
        int tail = 0;

        Process dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("You dequeued from empty " +
                        "queue.");
            }
            Process value = array[tail];
            tail += 1;
            if (tail == SIZE) {
                tail -= SIZE;
            }
            return value;
        }

        void enqueue(Process process) {
            if (isFull()) {
                throw new IllegalStateException("You enqueued to full queue.");
            }
            array[head] = process;
            head += 1;
            if (head == SIZE) {
                head -= SIZE;
            }
        }

        boolean isFull() {
            return head + 1 == (tail % SIZE);
        }

        boolean isEmpty() {
            return head == tail;
        }
    }

    static class Process {
        String name;
        int quantum;

        Process(String name, int quantum) {
            this.name = name;
            this.quantum = quantum;
        }
    }
}