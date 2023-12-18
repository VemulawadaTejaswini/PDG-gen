import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void main(String args[]) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n  = sc.nextInt();
        int m = sc.nextInt();

        PriorityQueue<Integer> Q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            Q.add(sc.nextInt());
        }

        for(int i=0;i<m;i++){
            int max = Q.poll();
            Q.add(max/2);
        }

        int res = 0;
        for(int i=0;i<n;i++){
            res+=Q.poll();
        }
        
        pw.println(res);

        pw.flush();
    }
}