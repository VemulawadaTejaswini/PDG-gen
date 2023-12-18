import org.omg.CORBA.INTERNAL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static ArrayList<ArrayList<Integer>> nextNode = new ArrayList<>();
    static int cnt = 0;

    static void dfs(int recent, int depth, boolean[] visied){

        if(depth == nextNode.size()-1){
            cnt++;
            return;
        }

        for(Integer next: nextNode.get(recent)){
            visied[recent] = true;
            if(!visied[next]) dfs(next, depth+1, visied);
            visied[recent] = false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);

        for(int i=0; i<n; i++) nextNode.add(new ArrayList<>());

        for(int i=0; i<m; i++){
            in = br.readLine().split(" ");
            int node1 = Integer.parseInt(in[0]) - 1;
            int node2 = Integer.parseInt(in[1]) - 1;
            nextNode.get(node1).add(node2);
            nextNode.get(node2).add(node1);
        }

        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        dfs(0, 0, visited);
        System.out.println(cnt);
    }
}