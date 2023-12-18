import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.io.IOException;

public class Main {
    static class Edge {
        int to;
        boolean odd;

        Edge(int to, boolean odd) {
            this.to = to;
            this.odd = odd;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<List<Edge>> edges = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            edges.add(new ArrayList<>());
        }
        for(int i = 0; i < n - 1; i++) {
            String[] in = br.readLine().split(" ");
            int u = Integer.parseInt(in[0]) - 1;
            int v = Integer.parseInt(in[1]) - 1;
            int w = Integer.parseInt(in[2]);
            boolean odd = w % 2 == 1;
            edges.get(u).add(new Edge(v, odd));
            edges.get(v).add(new Edge(u, odd));
        }

        boolean[] odd = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        boolean[] checked = new boolean[n];
        checked[0] = true;
        while(!stack.isEmpty()) {
            int s = stack.pop();
            for(Edge e : edges.get(s)) {
                if(!checked[e.to]) {
                    odd[e.to] = odd[s] ^ e.odd;
                    stack.push(e.to);
                    checked[e.to] = true;
                }
            }
        }

        int[] color = new int[n];
        List<Integer> unchecked = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            unchecked.add(i);
        }

        while(!unchecked.isEmpty()) {
            int f = unchecked.remove(0);
            color[f] = 1;
            Stack<Integer> check = new Stack<>();
            check.push(f);
            while(!check.isEmpty()) {
                int s = check.pop();
                for(int t : unchecked) {
                    if(odd[s] ^ odd[t]) {
                        color[t] = color[s] == 1? 2 : 1;
                        unchecked.remove((Integer) t);
                        check.push(t);
                    }
                }
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.println(color[i] - 1);
        }

        br.close();
    }
}