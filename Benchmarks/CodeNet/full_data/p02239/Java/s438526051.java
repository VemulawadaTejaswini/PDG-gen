import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.io.*;
//import java.util.stream.IntStream;



public class Main {

    public static class Node{
        Queue<Integer> child = new ArrayDeque<>();
    }
    static Node[] nodes;
    static int[] colors;
    static int[] d;
    static int distance;


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //try{}
        
        int n = sc.nextInt();
        nodes = new Node[n+1];
        colors = new int[n+1];
        d = new int[n+1];


        for(int i=1;i<=n;i++){
            int id = sc.nextInt();
            int numChild = sc.nextInt();
            nodes[id] = new Node();
            for(int j=0;j<numChild;j++){
                int child = sc.nextInt();
                nodes[id].child.add(child);
            }
        }

        // 島を分けないのでfor文は使わない
         bfs(1);
         for(int i=2;i<=n;i++){
             if(d[i] == 0){d[i] = -1;}
         }


        StringBuffer buf = new StringBuffer();
        for(int i=1;i<=n;i++){
            buf.append(i + " " + d[i] + '\n');
        }
        System.out.print(buf);

    }

    public static void bfs(int id){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(id);
        colors[id] = 1;
        d[id] = distance;

        while(!queue.isEmpty()){
            int u = queue.poll();
            
            int numChild = nodes[u].child.size();

            for(int i=0;i<numChild;i++){
                Integer v = nodes[u].child.poll();
                if(v != null && colors[v] == 0){
                    queue.add(v);
                    d[v] = d[u] + 1;
                    colors[v] = 1;
                }
            }
        }

    }
}



