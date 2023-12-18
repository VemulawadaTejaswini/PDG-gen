import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.io.IOException;

class MyScanner {
    BufferedReader br;

    MyScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int intLine() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public String line() throws IOException {
        return br.readLine();
    }

    public int[] intArray() throws IOException {
        String[] in = br.readLine().split(" ");
        int n = in.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            res[i] = Integer.parseInt(in[i]);
        }
        return res;
    }
}

class Pair implements Comparable<Pair> {
    long t;
    int i;

    Pair(long t, int i) {
        this.t = t;
        this.i = i;
    }

    public int compareTo(Pair p) {
        return t > p.t? 1 : -1;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        MyScanner sc = new MyScanner();

        int[] in = sc.intArray();
        int n = in[0];
        int m = in[1];

        List<List<Integer>> job = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            job.add(new ArrayList<>());
        }
        for(int i = 0; i < n; i++) {
            in = sc.intArray();
            int a = in[0];
            int b = in[1];
            if(m - a >= 0) job.get(m - a).add(b);
        }

        long ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = m - 1; i >= 0; i--) {
            for(int x : job.get(i)) {
                pq.add(x);
            }
            if(!pq.isEmpty()) ans += pq.poll();
        }
        
        System.out.println(ans);

        sc.br.close();
    }
}
