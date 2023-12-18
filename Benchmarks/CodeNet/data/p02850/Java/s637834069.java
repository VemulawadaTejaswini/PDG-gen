import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        //System.setIn(Main.class.getClassLoader().getResourceAsStream("input"));
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        int[] adj = new int[n];
        int[] res = new int[n-1];
        int[] last = new int[n];
        int k = 0;
        for (int i = 0; i < n-1; i++) {
            int ai = sc.nextInt();
            int bi = sc.nextInt();
            adj[ai-1]++;
            adj[bi-1]++;
            k = Math.max(k, Math.max(adj[ai-1], adj[bi-1]));
            if(adj[ai-1]< adj[bi-1]) {
                res[i] = (last[bi -1]+1)%k;
            }
            else {
                res[i] = (last[ai -1]+1)%k;
            }
            last[ai-1] = res[i];
            last[bi-1] = res[i];

        }
        writer.println(k);
        for (int i = 0; i < n-1; i++) {
            writer.println(res[i] + 1);
        }
        writer.flush();
        writer.close();
    }
}
