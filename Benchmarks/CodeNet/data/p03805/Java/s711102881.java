import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    static int count = 0;
    static boolean[] visited;
    static boolean[][] connected;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        connected = new boolean[n][n];
        visited = new boolean[n];
        
        for (int i = 0; i < m; i++) {
            String[] fromTo = br.readLine().split(" ");
            int from = Integer.parseInt(fromTo[0])-1;
            int to = Integer.parseInt(fromTo[1])-1;
            connected[from][to] = true;
        }
        
        dfs(0);
        
        System.out.println(count);
        
    }
    
    static boolean all_visited = true;
    static void dfs(int n) {
        visited[n] = true;
        
        for (int i = 0; i < visited.length; i++) {
            if (visited[i] != true) {
                all_visited = false;
                break;
            }
        }
        
        if (all_visited) {
            count++;
            return;
        }
        
        all_visited = true;
        
        for (int i = 0; i < connected[n].length; i++) {
            if ((connected[n][i] || connected[i][n]) && !visited[i]) {
                dfs(i);
                visited[i] = false;
            }
        }
    }
}
