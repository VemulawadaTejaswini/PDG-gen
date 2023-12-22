import java.util.Scanner;
import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] processInfo = scanner.nextLine().split(" ");
        
        int processCount = Integer.parseInt(processInfo[0]);
        int quantum = Integer.parseInt(processInfo[1]);
        
        Queue queue = new Queue(processCount);
        
        for (int i = 0; i < processCount; i++) {
            String[] p = scanner.nextLine().split(" ");
            queue.push(new Process(p[0], p[1]));
        }
        int totalTime = 0;
        
        while (!queue.isEmpty()) {
            Process p = queue.poll();
            int spend = p.doTask(quantum);
            
            totalTime += spend;
            if (p.hasDone()) {
                System.out.printf("%s %d%n", p.getName(), totalTime);
            } else {
                queue.push(p);
            }

        }
        
    }
    
    private static class Queue {
        
        private Process[] data;
        private int top = 0;
        private int last = 0;
        
        public Queue(int size) {
            data = new Process[size + 1];
        }
        
        public void push(Process p) {
            data[last] = p;
            last++;
            
            if (last >= data.length) {
                last = 0;
            }
        }
        
        public Process poll() {
            Process p = data[top];
            data[top] = null;
            top++;
            if (top >= data.length) {
                top = 0;
            }
            
            return p;
        }
        
        public boolean isEmpty() {
            return top == last;
        }
        
    }
    
    private static class Process {
        private String name = null;
        private int time = 0;
        public Process(String name, String time) {
            this.name = name;
            this.time = Integer.parseInt(time);
        }
        
        public int doTask(int quantum) {
            int spend = quantum - Math.max(quantum - time, 0);
            time = Math.max(time - quantum, 0);
            return spend;
        }
        
        public String getName() {
            return name;
        }
        
        public boolean hasDone() {
            return time <= 0;
        }
    }
}
