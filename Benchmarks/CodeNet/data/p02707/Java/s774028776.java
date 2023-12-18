import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Tree {
        int root;
        int vertices;
        ArrayList<ArrayList<Edge>> al;

        public Tree(int vertices, int root) {
            this.root = root;
            this.vertices = vertices;
            al = new ArrayList<>(vertices);
            for (int i = 0; i < vertices; i++) {
                al.add(new ArrayList<Edge>());
            }
        }
        public static void addEdgeUndirected(ArrayList<ArrayList<Edge>> al, int source, int destination, int weight) {
            al.get(source).add(new Edge(source, destination, weight));
            al.get(destination).add(new Edge(destination, source, weight));
        }

        public static void addEdgeDirected(ArrayList<ArrayList<Edge>> al, int source, int destination, int weight) {
            // this function adds an edge from vertex u to vertex v in directed graph
            al.get(source).add(new Edge(source, destination, weight));
        }
        public static void bfs(ArrayList<ArrayList<Edge>> al, int v, int root) {
            boolean[] visited = new boolean[v];
            Queue<Integer> q = new LinkedList<>();
            visited[root] = true;
            q.add(root);
            while (!q.isEmpty()) {
                int u = q.poll();
                System.out.print(u + " ");
                for (int i = 0; i < al.get(u).size(); i++) {
                    if (!visited[al.get(u).get(i).destination]) {
                        visited[al.get(u).get(i).destination] = true;
                        q.add(al.get(u).get(i).destination);
                    }
                }
            }
        }
        public static void recursiveDFS(ArrayList<ArrayList<Edge>> al, int root, boolean[] visited) {
            visited[root] = true;
            System.out.print(root + " ");
            for (int i = 0; i < al.get(root).size(); i++) {
                if (!visited[al.get(root).get(i).destination]) {
                    visited[al.get(root).get(i).destination] = true;
                    recursiveDFS(al, al.get(root).get(i).destination, visited);
                }
            }
        }

        public static void dfs(ArrayList<ArrayList<Edge>> al, int v, int root) {
            boolean[] visited = new boolean[v];
            recursiveDFS(al, root, visited);
        }

        //function to calculate shortest path from root to all other nodes in a directed graph using BFS

        public static void shortestpath(ArrayList<ArrayList<Edge>> al, int v, int root) {
            boolean[] visited = new boolean[v];
            int[] dist = new int[v];
            dist[root] = 0;
            Queue<Integer> q = new LinkedList<>();
            visited[root] = true;
            q.add(root);
            while (!q.isEmpty()) {
                int u = q.poll();
                for (int i = 0; i < al.get(u).size(); i++) {
                    if (!visited[al.get(u).get(i).destination]) {
                        visited[al.get(u).get(i).destination] = true;
                        q.add(al.get(u).get(i).destination);
                        dist[al.get(u).get(i).destination] = dist[u] + 1;
                    }
                }
            }
            for (int i = 0; i < dist.length; i++) {
                System.out.print(dist[i] + " ");
            }
        }

        static int height(ArrayList<ArrayList<Edge>> al,int root){
            if (al.get(root).size()==0) return 1;
            int maxdepth = 0;
            for (int i=0;i<al.get(root).size();i++)
                maxdepth = Math.max(maxdepth,
                        height(al,al.get(root).get(i).destination));

            return maxdepth+1;
        }


        public static int getMax(ArrayList<ArrayList<Edge>> al,int root){
            int max = Integer.MIN_VALUE;
            Queue<Integer> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                int current = q.poll();
                max = Math.max(max,current);
                for (int i = 0; i < al.get(current).size(); i++) {
                    q.add(al.get(current).get(i).destination);
                }

            }return max;
        }
        public static int getMin(ArrayList<ArrayList<Edge>> al,int root){
            int min = Integer.MAX_VALUE;
            Queue<Integer> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                int current = q.poll();
                min = Math.min(min,current);
                for (int i = 0; i < al.get(current).size(); i++) {
                    q.add(al.get(current).get(i).destination);
                }

            }return min;
        }

        //function to print all nodes at Kth distance from the root.
        public static void nodesKdist(ArrayList<ArrayList<Edge>> al,int root,int k){
            if(al.get(root).size()==0 && k>0) return;
            if(k==0) System.out.print(root + " ");
            else{
                for(int i=0;i<al.get(root).size();i++) nodesKdist(al,al.get(root).get(i).destination,k-1);
            }
        }

        //function to print left view of a tree,i.e. to print the leftmost node at all the levels
        public static void leftView(ArrayList<ArrayList<Edge>> al,int root){
            if(al.get(root).size()==0) return;
            Queue<Integer> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                int count = q.size();
                for(int i=0;i<count;i++){
                    int current = q.poll();
                    if(i==0) System.out.print(current + " ");
                    for(int j=0;j<al.get(current).size();j++) q.add(al.get(current).get(j).destination);
                }
            }
        }
        //function to find width-->max num of nodes present at s given level in tree
        public static int width(Tree t){
            int width = 0;
            Queue<Integer> q = new LinkedList<>();
            q.add(t.root);
            while(!q.isEmpty()){
                width = Math.max(width,q.size());
                int current_size = q.size();
                for(int i=0;i<current_size;i++){
                    int u = q.poll();
                    for(int j=0;j<t.al.get(u).size();j++) q.add(t.al.get(u).get(j).destination);
                }
            }
            return width;
        }

        //function to find the lca of 2 nodes n1 & n2
        public static boolean findpath(Tree t,int root,ArrayList<Integer> path,int n){
            if(root==n) return true;
            if(t.al.get(root).size()==0) return false;
            path.add(root);
            for(int i=0;i<t.al.get(root).size();i++){
                if(findpath(t,t.al.get(root).get(i).destination,path,n)) return true;
            }
            path.remove(path.size()-1);
            return false;
        }
        public static int lca(Tree t,int n1,int n2){
            int ans = -1;
            ArrayList<Integer> path1 = new ArrayList<>();
            ArrayList<Integer> path2 = new ArrayList<>();
            findpath(t,t.root,path1,n1);
            findpath(t,t.root,path2,n2);
            if(path1.size()!=0) path1.add(n1);
            if(path2.size()!=0) path2.add(n2);
            if(path1.size()==0 || path2.size()==0) return ans;
            for(int i=0;i<Math.min(path1.size(),path2.size());i++){
                if(path1.get(i) == path2.get(i)){
                    ans = path1.get(i);
                }else break;
            }
            return ans;
        }
    }

    public static void main(String[] args) throws IOException {
       Reader r = new Reader();
       int n = r.nextInt();
       Tree t = new Tree(n+1,1);
       for(int i=0;i<n-1;i++){
           int temp = r.nextInt();
           t.addEdgeDirected(t.al,temp,i+2,0);
       }
       for(int i=1;i<t.al.size();i++){
           System.out.println(t.al.get(i).size());
       }
    }
}
