import java.io.*;
import java.util.*;
import java.lang.*;



class ArrayLib{
    static<E extends Comparable<E>> E getOrDefault(E[] array, int index, E defaultValue){
        if(index<0 || index>=array.length) return defaultValue;
        return array[index];
    }

    static<E extends Comparable<E>> int maxIndexOfArray(E[] a){
        int ans = 0;
        for(int i=1;i<a.length;i++){
            if(a[i].compareTo(a[ans])>0) ans=i;
        }
        return ans;
    }
    static<E extends Comparable<E>> E maxValueOfArray(E[] a){
        return a[maxIndexOfArray(a)];
    }
    static<E extends Comparable<E>> int minIndexOfArray(E[] a){
        int ans = 0;
        for(int i=1;i<a.length;i++){
            if(a[i].compareTo(a[ans])<0) ans=i;
        }
        return ans;
    }
    static<E extends Comparable<E>> E minValueOfArray(E[] a){
        return a[minIndexOfArray(a)];
    }

    // minimum x st. array[x] >= elm
    static<E extends Comparable<E>> int lowerBound(E[] array, E elm){
        if(array[0].compareTo(elm)>=0) return 0;
        int min = 0, max = array.length;
        // array[min] < elm
        // array[max] >= elm
        while(min+1<max){
            int mid = (min+max)/2;
            if(array[mid].compareTo(elm) < 0) min = mid;
            else max = mid;
        }
        return max;
    }
    // minimum x st. array[x] > elm
    static<E extends Comparable<E>> int upperBound(E[] array, E elm){
        if(array[0].compareTo(elm)>0) return 0;
        int min = 0, max = array.length;
        // array[min] <= elm
        // array[max] > elm
        while(min+1<max){
            int mid = (min+max)/2;
            if(array[mid].compareTo(elm) <= 0) min = mid;
            else max = mid;
        }
        return max;
    }

    static boolean nextPermutation(List<Integer> list){
        int pivotPos = -1;
        int pivot = 0;
        for (int i=list.size()-2; i>=0; i--) {
            if (list.get(i) < list.get(i+1)) {
                pivotPos = i;
                pivot = list.get(i);
                break;
            }
        }

        if (pivotPos==-1 && pivot==0) return false;

        int L = pivotPos+1, R = list.size()-1;
        int minPos = -1;
        int min = Integer.MAX_VALUE;
        for (int i=R; i>=L; i--) {
            if (pivot < list.get(i)) {
                if (list.get(i) < min) {
                    min = list.get(i);
                    minPos = i;
                }
            }
        }

        Collections.swap(list, pivotPos, minPos);
        Collections.sort(list.subList(L, R+1));

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<list.size(); i++) sb.append(list.get(i));

        return true;
    }
}

class Pair<E extends Comparable<E>,F extends Comparable<F>> implements Comparable<Pair<E,F>>{
    E first;
    F second;
    public Pair(E first, F second){
        this.first=first;
        this.second=second;
    }
    public E getFirst(){return first;}
    public F getSecond(){return second;}
    public String toString(){
        return "<"+first.toString()+","+second.toString()+">";
    }
    public int hashCode(){
        return first.hashCode()*30011+second.hashCode()+2;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair another = (Pair) obj;
        return this.getFirst().equals(another.getFirst())&&this.getSecond().equals(another.getSecond());
    }

    public int compareTo(Pair<E,F> another){
        if(this.getFirst().equals(another.getFirst())){
            return this.getSecond().compareTo(another.getSecond());
        }
        return this.getFirst().compareTo(another.getFirst());
    }

}
class Edge implements Comparable<Edge>{
    Node end;
    Long weight;
    public Edge(Node end, long weight){
        this.end = end;
        this.weight = weight;
    }
    public Edge(Node end){
        this.end = end;
        this.weight = 1L;
    }
    public long getWeight(){
        return weight;
    }
    public Node getEnd(){
        return end;
    }
    public int compareTo(Edge another){
        if(this.getWeight()==another.getWeight()) return this.getEnd().compareTo(another.getEnd());
        else return Long.compare(this.getWeight(), new Long(another.getWeight()));
    }
    public String toString(){
        return "->"+end.toString()+"["+weight+"]";
    }
}
class Node implements Comparable<Node>{
    int id;
    List<Edge> edges;
    public Node(int id){
        this.id = id;
        this.edges = new LinkedList<>();
    }
    public void addEdge(Edge e){
        edges.add(e);
    }
    public void addEdge(Node n, long weight){
        this.addEdge(new Edge(n,weight));
    }
    public void addEdge(Node n){
        this.addEdge(n,1);
    }
    public void connect(Node n, long weight){
        edges.add(new Edge(n,weight));
    }
    public void connect(Node n){
        edges.add(new Edge(n));
    }
    public int getID(){
        return id;
    }
    public List<Edge> getEdges(){
        return edges;
    }
    public List<Node> getNeighbors(){
        LinkedList<Node> neighbors = new LinkedList<>();
        for(Edge e:this.getEdges()){
            neighbors.add(e.getEnd());
        }
        return neighbors;
    }
    public int compareTo(Node another){
        return this.getID()-another.getID();
    }
    public String toString(){
        return "N"+id;
    }
}
class Graph{
    int size;
    List<Node> nodes;//nodes[i] have ID "i"
    int edgeNum;

    static final Long INF = 5000000000000000L;

    public Graph(int size){
        this.size = size;
        nodes = new ArrayList<>(size);
        for(int i=0;i<size;i++){
            nodes.add(new Node(i));
        }
        this.edgeNum=0;
    }
    public void addNode(){
        nodes.add(new Node(size));
        size++;
    }
    public void addDirectionalEdge(int i, int j, long w){ // i->j
        if(i>=size || j>=size)return;
        nodes.get(i).addEdge(nodes.get(j),w);
        edgeNum++;
    }
    public void addDirectionalEdge(int i, int j){ // i->j
        if(i>=size || j>=size)return;
        nodes.get(i).addEdge(nodes.get(j));
        edgeNum++;
    }
    public void addEdge(int i, int j, long w){
        addDirectionalEdge(i,j,w);
        addDirectionalEdge(j,i,w);
    }
    public void addEdge(int i, int j){
        addDirectionalEdge(i,j);
        addDirectionalEdge(j,i);
    }
    public int getSize(){
        return size;
    }
    public List<Edge> getEdges(int i){
        return nodes.get(i).getEdges();
    }
    public List<Node> getNeighbors(int i){
        return nodes.get(i).getNeighbors();
    }
    public long getDistance(int i, int j){
        long ans = INF;
        for(Edge e:this.getEdges(i)){
            if(e.getEnd().getID()==j) ans = Math.min(ans,e.getWeight());
        }
        return ans;
    }
    public long pathDistance(int[] nodes){
        long ans = 0;
        for(int n=1;n<nodes.length;n++){
            ans += this.getDistance(nodes[n-1],nodes[n]);
        }
        return ans;
    }
    public long pathDistance(Integer[] nodes){
        long ans = 0;
        for(int n=1;n<nodes.length;n++){
            ans += this.getDistance(nodes[n-1],nodes[n]);
        }
        return ans;
    }
    public long pathDistance(List<Integer> nodes){
        return pathDistance(nodes.toArray(new Integer[0]));
    }

    public Graph copy(){
        Graph G = new Graph(this.size);
        for(Node n: this.nodes) for(Edge e: n.getEdges()){
            G.addDirectionalEdge(n.getID(), e.getEnd().getID(), e.getWeight());
        }
        return G;
    }

    public List<Integer> queueDijkstra(int start, int end){
        long[] distance = new long[size];
        for(int n=0;n<size;n++) distance[n]=INF;
        distance[start]=0;
        int[] prev = new int[size];
        for(int n=0;n<size;n++) prev[n]=-1;

        PriorityQueue<Pair<Long,Integer>> A = new PriorityQueue<>();
        A.add(new Pair<>(distance[start],start));
        while(A.size()>0){
            Pair<Long,Integer> pair = A.poll();
            int u = pair.getSecond();
            if(pair.getFirst()>distance[u])continue;
            for(Edge e:getEdges(u)){
                int v = e.getEnd().getID();
                long newDistance = distance[u] + e.getWeight();
                if(distance[v]>newDistance){
                    A.remove(new Pair<>(distance[v],v));
                    distance[v] = newDistance;
                    prev[v] = u;
                    A.add(new Pair<>(distance[v],v));
                }
            }
        }
        LinkedList<Integer> ans = new LinkedList<>();
        ans.push(end);
        int cur = end;
        while(cur!=start){
            ans.push(prev[cur]);
            cur = prev[cur];
        }
        return ans;
    }
    public List<Integer> normalDijkstra(int start, int end){
        long[] distance = new long[size];
        for(int n=0;n<size;n++) distance[n]=INF;
        distance[start]=0;
        int[] prev = new int[size];
        for(int n=0;n<size;n++) prev[n]=-1;

        LinkedList<Integer> A = new LinkedList<>();
        A.add(start);
        while(A.size()>0){
            int best = A.peek();
            for(int p:A){
                if(distance[p]<distance[best]) best=p;
            }
            if(best==end) break;
            A.remove(new Integer(best));
            for(Edge e:getEdges(best)){
                int w = e.getEnd().getID();
                if(distance[w]==INF){
                    distance[w] = distance[best] + e.getWeight();
                    A.add(w);
                    prev[w] = best;
                }else if(distance[best]+e.getWeight() < distance[w]){
                    distance[w] = distance[best]+e.getWeight();
                    prev[w] = best;
                }
            }
        }
        LinkedList<Integer> ans = new LinkedList<>();
        ans.push(end);
        int cur = end;
        while(cur!=start){
            ans.push(prev[cur]);
            cur = prev[cur];
        }
        return ans;
    }
    public List<Integer> dijkstra(int start, int end){
        if(size*size < 2 * edgeNum + size * Math.log(size)) return normalDijkstra(start,end);
        else return queueDijkstra(start,end);
    }
    public long[] bellmanford(int start) throws IllegalArgumentException {
        long[] distance = new long[size];
        for(int i=0;i<size;i++) distance[i]=INF;
        distance[start]=0;
        for(int time=0;time<size-1;time++){
            for(Node u:nodes)for(Edge e:u.getEdges()){
                Node v = e.getEnd();
                if(distance[v.getID()]>distance[u.getID()]+e.getWeight()){
                    distance[v.getID()] = distance[u.getID()]+e.getWeight();
                }
            }
        }
        for(Node u:nodes)for(Edge e:u.getEdges()){
            Node v = e.getEnd();
            if(distance[u.getID()]+e.getWeight()<distance[v.getID()])
                throw new IllegalArgumentException();
        }
        return distance;
    }

    public Graph toRootedTree(int root){ //parent -> children only
        Graph tree = new Graph(size);
        LinkedList<Integer> toCheck = new LinkedList<>();
        Set checked = new HashSet<Integer>();
        toCheck.add(root);
        while(!toCheck.isEmpty()){
            int x = toCheck.pop();
            checked.add(x);
            for(Edge e : this.getEdges(x)){
                Node ng = e.getEnd();
                if(!checked.contains(ng.getID())){
                    toCheck.add(ng.getID());
                    tree.addDirectionalEdge(x,ng.getID(), e.weight);
                }
            }
        }
        return tree;
    }

    public Graph reverse(){
        Graph rev = new Graph(this.size);
        for(Node n:this.nodes){
            for(Edge e:n.getEdges()){
                rev.addDirectionalEdge(e.end.getID(), n.getID(), e.getWeight());
            }
        }
        return rev;
    }
    public List<Integer> toDAG() throws Exception{
        Graph rev = this.reverse();
        LinkedList<Integer> L = new LinkedList<>();
        TreeSet<Integer> S = new TreeSet<>();
        for(Node n:rev.nodes) if(n.getEdges().isEmpty()) S.add(n.getID());
        if(S.isEmpty()) throw new Exception("loop found");

        Integer[] enterEdge = new Integer[this.size];  Arrays.fill(enterEdge, 0);
        for(Node n:this.nodes) for(Edge e: n.getEdges()) enterEdge[e.getEnd().getID()]++;

        while(!S.isEmpty()){
            int n = S.pollFirst();
            L.addLast(n);
            for(Edge e: this.nodes.get(n).getEdges()){
                enterEdge[e.getEnd().getID()]--;
                if(enterEdge[e.getEnd().getID()]<=0) S.add(e.getEnd().getID());
            }
        }
        if(enterEdge[ArrayLib.maxIndexOfArray(enterEdge)]>0) throw new Exception("loop found");

        return L;
    }
}

class Input extends BufferedReader{

    public Input(InputStream in){
        super(new InputStreamReader(in));
    }

    public String[] nextStringArray(int size) throws IOException{
        String[] array = new String[size];
        String line = super.readLine();
        StringTokenizer st = new StringTokenizer(line);
        for(int i=0; i<size; i++) array[i] = st.nextToken();
        return array;
    }
    public int[] nextIntArray(int size) throws IOException{
        int[] array = new int[size];
        String[] st = nextStringArray(size);
        for(int i=0; i<size; i++) array[i] = Integer.parseInt(st[i]);
        return array;
    }
    public long[] nextLongArray(int size) throws IOException{
        long[] array = new long[size];
        String[] st = nextStringArray(size);
        for(int i=0; i<size; i++) array[i] = Long.parseLong(st[i]);
        return array;
    }
    public double[] nextDoubleArray(int size) throws IOException{
        double[] array = new double[size];
        String[] st = nextStringArray(size);
        for(int i=0; i<size; i++) array[i] = Double.parseDouble(st[i]);
        return array;
    }



}
class Output extends PrintWriter {

    public Output(PrintStream io) {
        super(io);
    }

    public void printArray(int[] array, String space, String end) {
        int N = array.length;
        for(int n=0; n<N-1; n++){
            super.print(array[n]);
            super.print(space);
        }
        super.print(array[N-1]);
        super.print(end);
        super.flush();
    }
    public void printArray(int[] array){
        this.printArray(array, " ", "\n");
    }
    public void printArray(long[] array, String space, String end) {
        int N = array.length;
        for(int n=0; n<N-1; n++){
            super.print(array[n]);
            super.print(space);
        }
        super.print(array[N-1]);
        super.print(end);
        super.flush();
    }
    public void printArray(long[] array){
        this.printArray(array, " ", "\n");
    }
    public void printArray(double[] array, String space, String end) {
        int N = array.length;
        for(int n=0; n<N-1; n++){
            super.print(array[n]);
            super.print(space);
        }
        super.print(array[N-1]);
        super.print(end);
        super.flush();
    }
    public void printArray(double[] array){
        this.printArray(array, " ", "\n");
    }
    public void printArray(char[] array, String space, String end) {
        int N = array.length;
        for(int n=0; n<N-1; n++){
            super.print(array[n]);
            super.print(space);
        }
        super.print(array[N-1]);
        super.print(end);
        super.flush();
    }
    public void printArray(char[] array){
        this.printArray(array, " ", "\n");
    }
    public void printArray(Object[] array, String space, String end) {
        int N = array.length;
        for(int n=0; n<N-1; n++){
            super.print(array[n]);
            super.print(space);
        }
        super.print(array[N-1]);
        super.print(end);
        super.flush();
    }
    public void printArray(Object[] array){
        this.printArray(array, " ", "\n");
    }

}

public class Main {
    static int battleNumber(int i, int j, int N){
        if(i<j) return i*N+j;
        else return j*N+i;
    }
    public static void main(String[] args) throws IOException{
        Input in = new Input(System.in);
        Output out = new Output(System.out);

        int N = in.nextIntArray(1)[0];

        int[][] A = new int[N][N-1];
        for(int n=0; n<N; n++) A[n] = in.nextIntArray(N-1);
        for(int n=0; n<N; n++) for(int m=0; m<N-1; m++) A[n][m]--;


        //[i]vs[j] <-> node (i*N+j)
        Graph plan = new Graph(N*N);

        for(int n=0; n<N; n++)for(int i=0; i<N-2; i++){
            plan.addDirectionalEdge(battleNumber(n, A[n][i], N), battleNumber(n, A[n][i+1], N));
        }


        try{
            List<Integer> schedule = plan.toDAG();

            Integer[] date = new Integer[N*N];  Arrays.fill(date, 1);
            for(int b:schedule){
                for(Node n: plan.getNeighbors(b)){
                    date[n.getID()] = Math.max(date[n.getID()], date[b]+1);
                }
            }
            out.println(ArrayLib.maxValueOfArray(date));
        }catch(Exception e){
            out.println(-1);
        }

        out.flush();
    }
}
