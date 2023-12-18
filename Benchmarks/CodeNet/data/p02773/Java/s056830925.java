import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        Map<String, Integer> map = new HashMap();
        for(int i = 0; i < N; i++) {
            String str = scan.next();
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<Map.Entry<String, Integer>>(
            (e1, e2) -> e1.getValue() != e2.getValue() ? e2.getValue() - e1.getValue() : e1.getKey().compareTo(e2.getKey())
        );
        for(Map.Entry<String, Integer> e : map.entrySet()) {
            pq.offer(e);
        }
        int max = pq.peek().getValue();
        while(!pq.isEmpty()) {
            Map.Entry<String, Integer> e = pq.poll();
            if(e.getValue() != max)
                return;
            os.println(e.getKey());
        }
    }
}