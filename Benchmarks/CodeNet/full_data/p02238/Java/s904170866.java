import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.io.*;
//import java.util.stream.IntStream;



public class Main {

    public static class Node{
        Queue<Integer> child = new ArrayDeque<>();
    }

    static int colors[];
    static int d[];
    static int f[];
    static Node[] nodes;
    static int time = 0;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //try{}
        
        int n = sc.nextInt();
        nodes = new Node[n+1];
        for(int i=0;i<=n;i++){
            nodes[i] = new Node();
        }
        colors = new int[n+1];
        d = new int[n+1];
        f = new int[n+1];

        
        // Node[]で、各ノード番号の要素にListで近接ノードを保存
        for(int i=0;i<n;i++){
            int id= sc.nextInt();
            int numChild = sc.nextInt();
            for(int j=0;j<numChild;j++){
                int child = sc.nextInt();
                nodes[id].child.add(child);
            }
        }

        for(int i=1;i<=n;i++){
            if(colors[i] == 0){
                d[i] = ++time;
                dfs(i);
            }
        }

        StringBuffer buf = new StringBuffer();
        for(int i=1;i<=n;i++){
            buf.append(i + " " + d[i] + " " + f[i] + '\n');
        }
        System.out.print(buf);

    }

    public static void dfs (int id){
        Stack<Integer> stack = new Stack<>();

        stack.push(id);
        colors[id] = 1; // stackに入ったノードをGRAYとする

        while(!stack.empty()){
            int u = stack.peek();
            Integer v = nodes[u].child.poll();

            if(v == null){
                stack.pop();
                colors[u] = 2;
                f[u] = ++time;
                continue;
            }
            if(colors[v] == 0){
                stack.push(v);
                colors[v] = 1;
                d[v] = ++time;
            }

        }

    }
}



