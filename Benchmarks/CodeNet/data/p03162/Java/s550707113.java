import java.util.*;
import java.io.*;

class Node{
    int i;
    int d;
    int p;
    public Node(int i, int d, int p){
        this.i = i;
        this.d = d;
        this.p = p;
    }
}

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        int N = Integer.parseInt(input.readLine());
        int[][] grid = new int[N][3];
        for(int n = 0; n<N; n++){
            StringTokenizer st = new StringTokenizer(input.readLine());
            grid[n][0] = Integer.parseInt(st.nextToken());
            grid[n][1] = Integer.parseInt(st.nextToken());
            grid[n][2] = Integer.parseInt(st.nextToken());
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(new Node(0, grid[0][0], -1));
        q.add(new Node(0, grid[0][1], -1));
        q.add(new Node(0, grid[0][2], -1));
        int max = 0;
        while(!q.isEmpty()){
            Node n = q.poll();
            if(n.i < N-1){
                for(int i = 0; i<3; i++){
                    if(i!=n.p)
                        q.add(new Node(n.i+1, n.d+grid[n.i+1][i], i));
                }
            }
            else{
                if(n.d>max) max = n.d;
            }
        }
        output.println(max);
        output.close();
    }
}