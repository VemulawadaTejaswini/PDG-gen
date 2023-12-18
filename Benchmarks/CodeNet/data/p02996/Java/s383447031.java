import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.io.IOException;

public class Main {
    static class Task implements Comparable<Task> {
        int a, b;

        Task(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Task t) {
            return b - t.b;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Task> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++) {
            String[] in = br.readLine().split(" ");
            int a = Integer.parseInt(in[0]);
            int b = Integer.parseInt(in[1]);
            pq.add(new Task(a, b));
        }
        long time = 0;
        boolean flag = true;
        while(!pq.isEmpty()) {
            Task t = pq.poll();
            if(time + t.a > t.b) {
                flag = false;
                break;
            }
            time += t.a;
        }

        System.out.println(flag? "Yes" : "No");
    }
}