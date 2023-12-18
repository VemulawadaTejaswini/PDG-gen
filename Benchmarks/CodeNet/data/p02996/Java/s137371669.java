import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        PriorityQueue<Task> queue = new PriorityQueue<>(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return Integer.compare(o1.b, o2.b);
            }
        });

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            queue.add(new Task(a, b));
        }

        boolean isFinish = true;
        int time = 0;
        while (!queue.isEmpty()){
            Task task = queue.poll();
            time += task.a;
            if (time > task.b) {
                isFinish = false;
                break;
            }
        }

        System.out.println(isFinish ? "Yes" : "No");
    }

    static class Task {
        int a, b;

        Task(int a, int b) {
            this.a = a;
            this.b = b;
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