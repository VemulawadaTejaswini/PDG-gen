import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Graph g = input();
        boolean[] bools = new boolean[g.getSize()];
        Arrays.fill(bools,false);
        System.out.println(dfs(g,0,0,bools));
    }

    private static Graph input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Graph ret = new Graph(n);
        for(int i = 0; i < m;i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            ret.addEdge(a,b);
            ret.addEdge(b,a);
        }
        sc.close();
        return ret;
    }

    private static int dfs(Graph g, int s, int dist, boolean[] bools){
        if(dist == bools.length){
            return 1;
        }
        if(bools[s]){
            return 0;
        }
        bools[s] = true;
        int ans = 0;
        LinkedList<Integer> al = g.getAdjacencyList(s);
        for(int i: al){
            ans += dfs(g,i,dist+=1,bools);
        }
        bools[s] = false;
        return ans;
    }
}

     class Graph {
        private ArrayList<LinkedList<Integer>> adjacencyList;
        public Graph(int numberNodes) {
            adjacencyList = new ArrayList<LinkedList<Integer>>(numberNodes);
            for (int i = 0; i < numberNodes; i++) {
                adjacencyList.add(new LinkedList<Integer>());
            }
        }
        private boolean isValidNode(int index) {
            return index >= 0 && index < adjacencyList.size();
        }
        public void addEdge(int to, int from) {
            if (!isValidNode(to) || !isValidNode(from)) {
                throw new IndexOutOfBoundsException();
            }
            adjacencyList.get(from).addLast(to);
        }
        public int getSize(){
            return adjacencyList.size();
        }
        public LinkedList<Integer> getAdjacencyList(int i){
            return adjacencyList.get(i);
        }
    }