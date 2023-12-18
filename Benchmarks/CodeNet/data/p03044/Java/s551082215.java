import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<List<Integer>> edge = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            edge.add(new ArrayList<>());
        }
        for(int i = 0; i < n - 1; i++) {
            String[] in = br.readLine().split(" ");
            int[] parsed = new int[3];
            for(int j = 0; j < 3; j++) parsed[j] = Integer.parseInt(in[j]);
            if(parsed[2] % 2 == 1) {
                edge.get(parsed[0] - 1).add(parsed[1] - 1);
                edge.get(parsed[1] - 1).add(parsed[0] - 1);
            }
        }

        int[] color = new int[n];
        for(int i = 0; i < n; i++) {
            if(color[i] != 0) continue;
            color[i] = 1;
            Stack<Integer> stack = new Stack<>();
            stack.push(i);
            while(!stack.isEmpty()) {
                int s = stack.pop();
                for(int t : edge.get(s)) {
                    if(color[t] == 0) {
                        color[t] = color[s] == 1? 2 : 1;
                        stack.push(t);
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