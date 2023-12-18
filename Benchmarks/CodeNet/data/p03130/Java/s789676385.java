//package atcoder.yahoo;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<Integer, ArrayList<Integer>> adjacency = new HashMap<>();
        for (int i = 1; i <= 4; i++) {
            adjacency.put(i, new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            ArrayList<Integer> list = adjacency.get(a);
            list.add(b);
            adjacency.put(a, list);
            list = adjacency.get(b);
            list.add(a);
            adjacency.put(b, list);
        }
        
        boolean[] visited = new boolean[5];
        dfs(1, visited, adjacency);
        boolean bool = true;
        for (int i = 1; i < 5; i++) {
            if(!visited[i]) {
                bool = false;
                break;
            }
        }

        if(!bool) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    private static void dfs(int num, boolean[] visited, HashMap<Integer, ArrayList<Integer>> adjacency) {
        visited[num] = true;
        ArrayList<Integer> adj = adjacency.get(num);
        boolean bool = false;
        for (int i = 0; i < adj.size(); i++) {
            if(!visited[adj.get(i)] && !bool){
                dfs(adj.get(i), visited, adjacency);
                bool = true;
            }
        }
    }
}
