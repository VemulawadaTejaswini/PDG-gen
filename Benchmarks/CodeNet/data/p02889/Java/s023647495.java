import java.util.*;
import java.lang.*;


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

class Graph{
    static final Long INF = 5000000000000000L;
    static class InfiniteAnswerException extends Exception{
        public InfiniteAnswerException(){
            super();
        }
        public InfiniteAnswerException(String msg){
            super(msg);
        }
    }
    static class NoValidSotutionException extends Exception{
        public NoValidSotutionException(){
            super();
        }
        public NoValidSotutionException(String msg){
            super(msg);
        }
    }

    int nodeNum;
    Map<Integer, Long>[] connectedNode;

    public Graph(int N){
        nodeNum = N;
        connectedNode = new Map[nodeNum];
        for(int n=0; n<N; n++) connectedNode[n] = new HashMap<>();
    }
    void addDirectionalEdge(int from, int to, long weight){
        connectedNode[from].put(to, weight);
    }
    void addEdge(int u, int v, long weight){
        addDirectionalEdge(u, v, weight);
        addDirectionalEdge(v, u, weight);
    }
    void addEdge(int u, int v){
        addEdge(u,v, 1);
    }
    long edgeDistance(int from, int to){
        return connectedNode[from].getOrDefault(to, INF);
    }
    long pathDistance(int[] path){
        long ans = 0;
        for(int i=0; i<path.length-1; i++){
            ans += edgeDistance(path[i], path[i+1]);
        }
        return ans;
    }
    long pathDistance(Integer[] path){
        long ans = 0;
        for(int i=0; i<path.length-1; i++){
            ans += edgeDistance(path[i], path[i+1]);
        }
        return ans;
    }
    long pathDistance(List<Integer> path){
        return pathDistance(path.toArray(new Integer[path.size()]));
    }

    Graph copy(){
        Graph G = new Graph(this.nodeNum);
        for(int from=0; from<nodeNum; from++) for(int to:connectedNode[from].keySet()){
            G.addDirectionalEdge(from, to, this.edgeDistance(from,to));
        }
        return G;
    }
    Graph reverse(){
        Graph G = new Graph(this.nodeNum);
        for(int from=0; from<nodeNum; from++) for(int to:connectedNode[from].keySet()){
            G.addDirectionalEdge(to, from, this.edgeDistance(from,to));
        }
        return G;
    }

    long[] dijkstra(int start){
        long[] distance = new long[nodeNum];
        Arrays.fill(distance, INF);
        distance[start] = 0;
        int[] prev = new int[nodeNum];
        Arrays.fill(prev, -1);

        PriorityQueue<Pair<Long,Integer>> Q = new PriorityQueue<>();
        Q.add(new Pair<>(distance[start], start));

        while(!Q.isEmpty()){
            Pair<Long,Integer> pair = Q.poll();
            int u = pair.second;
            for(int v: connectedNode[u].keySet()){
                long nextDistance = distance[u] + edgeDistance(u,v);
                if(nextDistance < distance[v]){
                    distance[v] = nextDistance;
                    prev[v] = u;
                    Q.add(new Pair<>(distance[v], v));
                }
            }
        }
        return distance;
    }
    List<Integer> dijkstraPath(int start, int end) throws NoValidSotutionException {
        long[] distance = new long[nodeNum];
        Arrays.fill(distance, INF);
        distance[start] = 0;
        int[] prev = new int[nodeNum];
        Arrays.fill(prev, -1);

        PriorityQueue<Pair<Long,Integer>> Q = new PriorityQueue<>();
        Q.add(new Pair<>(distance[start], start));

        while(!Q.isEmpty()){
            Pair<Long,Integer> pair = Q.poll();
            int u = pair.second;
            for(int v: connectedNode[u].keySet()){
                long nextDistance = distance[u] + edgeDistance(u,v);
                if(nextDistance < distance[v]){
                    distance[v] = nextDistance;
                    prev[v] = u;
                    Q.add(new Pair<>(distance[v], v));
                }
            }
        }

        LinkedList<Integer> ans = new LinkedList<>();
        ans.push(end);
        int cur = end;
        while(cur!=start){
            if(cur==-1) throw new NoValidSotutionException("No path exist: "+start+" to "+end);
            ans.push(prev[cur]);
            cur = prev[cur];
        }
        return ans;
    }
    long[] bellmanford(int start) throws InfiniteAnswerException{
        //time order: O(nodeNum * edgeNum)
        long[] distance = new long[nodeNum];
        Arrays.fill(distance, INF);
        distance[start] = 0;

        for(int time=0; time<nodeNum-1; time++){
            for(int from=0; from<nodeNum; from++) for(int to: connectedNode[from].keySet()){
                long w = this.edgeDistance(from, to);
                if(distance[to] > distance[from] + w) distance[to] = distance[from] + w;
            }
        }
        for(int from=0; from<nodeNum; from++) for(int to: connectedNode[from].keySet()){
            long w = this.edgeDistance(from, to);
            if(distance[to] > distance[from] + w){
                throw new InfiniteAnswerException("this graph has negative cycles[BF-alg]");
            }
        }
        return distance;
    }
    List<Integer> DAGorder() throws NoValidSotutionException {
        Graph rev = this.reverse();
        LinkedList<Integer> L = new LinkedList<>();
        TreeSet<Integer> S = new TreeSet<>();
        for(int n=0; n<nodeNum; n++) if(rev.connectedNode[n].isEmpty()) S.add(n);
        if(S.isEmpty()) throw new NoValidSotutionException("loop found[DAG]");

        Integer[] enterEdge = new Integer[this.nodeNum];
        Arrays.fill(enterEdge, 0);

        while(!S.isEmpty()){
            int u = S.pollFirst();
            L.addLast(u);
            for(int v: this.connectedNode[u].keySet()){
                enterEdge[v]--;
                if(enterEdge[v]<=0) S.add(v);
            }
        }

        for(int n=0; n<this.nodeNum; n++) if(enterEdge[n]>0) throw new NoValidSotutionException("loop found[DAG]");
        return L;
    }
}


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long L = sc.nextLong();

        Graph road = new Graph(N);
        for(int m=0; m<M; m++){
            road.addEdge(sc.nextInt()-1, sc.nextInt()-1, sc.nextLong());
        }
        Graph car = new Graph(N);
        for(int n=0; n<N; n++){
            long[] distance = road.dijkstra(n);
            for(int m=0; m<M; m++) if(m!=n && distance[m]<=L) car.addEdge(m,n);
        }

        long[][] carDistance = new long[N][N];
        for(int n=0; n<N; n++){
            carDistance[n] = car.dijkstra(n);
        }

        int Q = sc.nextInt();
        for(int q=0; q<Q; q++){
            long dist = carDistance[sc.nextInt()-1][sc.nextInt()-1];
            if(dist>=Graph.INF) System.out.println(-1);
            else System.out.println(dist-1);
        }
    }
}
