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
    static<E extends Comparable<E>> int minIndexOfArray(E[] a){
        int ans = 0;
        for(int i=1;i<a.length;i++){
            if(a[i].compareTo(a[ans])<0) ans=i;
        }
        return ans;
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

    public Graph toRootedTree(int root){
        Graph tree = new Graph(size);
        LinkedList<Integer> toCheck = new LinkedList<>();
        Set checked = new HashSet<Integer>();
        toCheck.add(root);
        while(!toCheck.isEmpty()){
            int x = toCheck.pop();
            checked.add(x);
            for(Node ng : this.getNeighbors(x)){
                if(!checked.contains(ng.getID())){
                    toCheck.add(ng.getID());
                    tree.addDirectionalEdge(x,ng.getID());
                }
            }
        }
        return tree;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();
        int[] visit = new int[R];
        for(int r=0; r<R; r++) visit[r]=sc.nextInt()-1;

        Graph G = new Graph(N);
        for(int m=0; m<M; m++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            long c = sc.nextLong();
            G.addEdge(a,b,c);
        }

        Graph small = new Graph(R);
        for(int i=0; i<R; i++) for(int j=i+1; j<R; j++){
            small.addEdge(i,j, G.pathDistance(G.dijkstra(visit[i],visit[j])));
        }

        List<Integer> plan = new ArrayList<>();
        for(int r=0; r<R; r++) plan.add(r);

        long ans = 5000000000000000L;
        do{
            ans = Math.min(ans, small.pathDistance(plan));
        }while(ArrayLib.nextPermutation(plan));

        System.out.println(ans);
    }
}
