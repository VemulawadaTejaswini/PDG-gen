import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nq = br.readLine().split(" ");
        int n = Integer.parseInt(nq[0]);
        int quantime = Integer.parseInt(nq[1]);

        MyQueue queue = new MyQueue();
        for (int i = 0; i < n; i++) {
            String[] processStr = br.readLine().split(" ");
            queue.enqueue(new Process(processStr[0], Integer.parseInt(processStr[1]), quantime));
        }

        int sum = 0;
        while (!queue.isEmpty()) {
            Process process = queue.dequeue();
            int consume = process.work();
            sum += consume;
            if (process.isDone()) {
                System.out.println(process.getName() + " " + sum);
            } else {
                queue.enqueue(process);
            }
        }
    }

    private static class MyQueue {
        private Process[] processes;
        private int head;
        private int tail;

        public MyQueue() {
            this.processes = new Process[100000];
            this.head = 0;
            this.tail = 0;
        }

        public void enqueue(Process process) {
            this.processes[this.tail] = process;
            if (this.tail + 1 >= 100000) {
                this.tail = 0;
            } else {
                this.tail++;
            }
        }

        public Process dequeue() {
            if (isEmpty()) throw new RuntimeException();

            int head = this.head;
            if (head + 1 >= 100000) {
                this.head = 0;
            } else {
                this.head++;
            }
            return this.processes[head];
        }

        public boolean isEmpty() {
            return this.tail == this.head;
        }
    }

    private static class Process {
        private String name;
        private int restTime;
        private int quantime;

        public Process(String name, int restTime, int quantime) {
            this.name = name;
            this.restTime = restTime;
            this.quantime = quantime;
        }

        public int work() {
            if (quantime <= restTime) {
                restTime -= quantime;
                return quantime;
            }
            int consume = restTime;
            restTime = 0;
            return consume;
        }

        public boolean isDone() {
            return this.restTime == 0;
        }

        public String getName() {
            return name;
        }
    }
}

