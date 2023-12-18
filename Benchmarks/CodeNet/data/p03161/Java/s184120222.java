import java.util.*;
import java.io.*;

class Node implements Comparable<Node>{
    int i;
    int d;
    public Node(int i, int d){
        this.i = i;
        this.d = d;
    }
    public int compareTo(Node n){
        return Integer.compare(this.d, n.d);
    }
}

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(input.readLine());
     	int N = Integer.parseInt(st.nextToken());
      	int K = Integer.parseInt(st.nextToken());
      	st = new StringTokenizer(input.readLine());
        int[] arr = new int[N];
        boolean[] visited = new boolean[N];
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        pq.add(new Node(1, Math.abs(arr[0] - arr[1])));
        if(N>2)
            pq.add(new Node(2, Math.abs(arr[0] - arr[2])));

        while(!pq.isEmpty()){
            Node n = pq.poll();
            if(visited[n.i]) continue;
            visited[n.i] = true;
            if(n.i == N-1){
                output.println(n.d);
                break;
            }
          	for(int k = 1; k<K; k++){
              if(n.i+k<N)
                  pq.add(new Node(n.i+k, n.d + Math.abs(arr[n.i] - arr[n.i+k])));
           }
        }
        output.close();
    }
}
