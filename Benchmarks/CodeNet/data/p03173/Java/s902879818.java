import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

import static java.lang.System.in;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int n = Integer.parseInt(reader.readLine());
        String[] lo = reader.readLine().split(" ");
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0; i <n ; i++) {
            pq.add(Long.parseLong(lo[i]));
        }
        long cost = 0;
        while(pq.size()>1){
            long a = pq.poll();
            long b = pq.poll();
            cost += (a+b);
            pq.add((a+b));
         }
        System.out.println(cost);
    }
}
