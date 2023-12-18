import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] a=new int[m];
        int[] b=new int[m];
        for(int i=0;i<m;i++){
            a[i]=scanner.nextInt()-1;
            b[i]=scanner.nextInt()-1;
        }
        int result=0;
        for(int i=0;i<m;i++){
            int[][] graph=new int[n][n];
            for(int j=0;j<m;j++){
                graph[a[j]][b[j]]=1;
                graph[b[j]][a[j]]=1;
            }
            graph[a[i]][b[i]]=0;
            graph[b[i]][a[i]]=0;
            Graph g=new Graph.AdjacencyMatrixGraph.UnDirectedGraph(graph);
            if(!((Graph.AdjacencyMatrixGraph.UnDirectedGraph) g).isRenketu())result++;

        }
        put(result);

    }

    public static void put(Object object) {
        System.out.println(object);
    }
    public static String format(String string, Object... args) {
        return String.format(string, args);
    }
}

final class Scanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

final class Pair {
    final public int x, y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return x+y;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result=super.equals(obj);
        if(obj.getClass()!=this.getClass()){
            return false;
        }
        Pair pair=(Pair)obj;
        if(this.x==pair.x&&this.y==pair.y) return true;
        return false;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }
}
final class Tuple<T,V>{
    final public T t;
    final public V v;
    Tuple(T t,V v){
        this.t=t;
        this.v=v;
    }

    @Override
    public int hashCode() {
        return (t.hashCode()+v.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass()!=this.getClass()){
            return false;
        }
        Tuple<T,V> tuple=(Tuple)obj;
        return tuple.t.equals(this.t)&&tuple.v.equals(this.v);
    }

    @Override
    public String toString() {
        return String.format("<Tuple>=<%s,%s>",t,v);
    }
}
final class LowerBoundComparator<T extends Comparable<? super T>>
        implements Comparator<T>
{
    public int compare(T x, T y)
    {
        return (x.compareTo(y) >= 0) ? 1 : -1;
    }
}

final class UpperBoundComparator<T extends Comparable<? super T>>
        implements Comparator<T>
{
    public int compare(T x, T y)
    {
        return (x.compareTo(y) > 0) ? 1 : -1;
    }
}

abstract class Graph {
    final int n;
    protected Graph(int n){
        this.n = n;
    }
    static class AdjacencyMatrixGraph extends Graph{
        final int[][] graph;
        AdjacencyMatrixGraph(int[][] graph){
            super(graph.length);
            this.graph=new int[n][n];
            for(int i = 0; i< n; i++){
                for(int j = 0; j< n; j++){
                    this.graph[i][j]=graph[i][j];
                }
            }
        }
        final static class UnDirectedGraph extends AdjacencyMatrixGraph{
            public UnDirectedGraph(int[][] graph) {
                super(graph);
                for(int i = 0; i< n; i++){
                    if(graph[i][i]!=0) throw new IllegalArgumentException(String.format("値が0でなければならない:::graph[%d,%d]=%d",i,i,graph[i][i]));
                    for(int j = 0; j< n; j++){
                        if(graph[i][j]!=graph[j][i]) throw new IllegalArgumentException("無向グラフではない");
                        if(graph[i][j]!=0&&graph[i][j]!=1) throw new IllegalArgumentException("値が1でも0でもない:::"+String.format("graph[%d,%d]=%d",i,j,graph[i][j]));
                    }
                }
            }
            boolean is2buGraph(){
                class Local{
                    int[] color=new int[n];
                    boolean bfs(int v,int c){
                        color[n]=c;
                        for(int i=0;i<n;i++){
                            if(graph[v][i]==0) continue;
                            if(color[i]==c) return false;
                            if(color[i]==0){
                                if(!bfs(i,-c)) return false;
                            }
                        }
                        return true;
                    }
                }
                return new Local().bfs(0,1);
            }
            boolean isRenketu(){
                class Local{
                    final boolean[] flag=new boolean[n];
                    void bfs(int v){
                        if(flag[v])return;
                        flag[v]=true;
                        for(int i=0;i<n;i++){
                            if(graph[v][i]==0) continue;
                            bfs(i);
                        }
                    }
                    boolean isAllTrue(){
                        boolean result=true;
                        for(int i=0;i<n;i++){
                            result=result&&flag[i];
                        }
                        return result;
                    }
                }
                Local l=new Local();
                l.bfs(0);
                return l.isAllTrue();
            }

        }
        final static class DirectedGraph extends AdjacencyMatrixGraph{
            public DirectedGraph(int[][] graph){
                super(graph);
                for(int i = 0; i< n; i++){
                    for(int j = 0; j< n; j++){
                        if(graph[i][j]!=0&&graph[i][j]!=1) throw new IllegalArgumentException("値が1でも0でもない:::"+String.format("graph[%d,%d]=%d",i,j,graph[i][j]));
                    }
                }
            }

        }
        final static class WeightedUnDirectedGraph extends AdjacencyMatrixGraph{
            WeightedUnDirectedGraph(int[][] graph){
                super(graph);
                for(int i = 0; i< n; i++){
                    for(int j = 0; j< n; j++){
                        if(graph[i][j]!=graph[j][i]) throw new IllegalArgumentException("無向グラフではない");
                    }
                }
            }
        }
        final static class WeightedDirectedGraph extends AdjacencyMatrixGraph{
            WeightedDirectedGraph(int[][] graph){
                super(graph);
            }
        }
    }
    static class AdjacencyListGraph extends Graph{
        final Map<Integer, List<Integer>> graph;
        AdjacencyListGraph(Map<Integer,List<Integer>> graph){
            super(graph.size());
            this.graph=new HashMap<>();
            for(Map.Entry<Integer,List<Integer>> e:graph.entrySet()){
                List<Integer> list=new ArrayList<>(e.getValue());
                this.graph.put(e.getKey(),list);
            }
        }
        final static class UnDirectedGraph extends AdjacencyListGraph{
            public UnDirectedGraph(Map<Integer,List<Integer>> graph) {
                super(graph);
                for(Map.Entry<Integer,List<Integer>> e:graph.entrySet()){
                    if(!e.getValue().contains(e.getKey())) throw new IllegalArgumentException("無向グラフではない");
                }
            }
        }
        final static class DirectedGraph extends AdjacencyListGraph{
            public DirectedGraph(Map<Integer,List<Integer>> graph){
                super(graph);
            }

        }
        final static class WeightedUnDirectedGraph extends AdjacencyListGraph{
            WeightedUnDirectedGraph(Map<Integer,List<Integer>> graph){
                super(graph);
                for(Map.Entry<Integer,List<Integer>> e:graph.entrySet()){
                    if(!e.getValue().contains(e.getKey())) throw new IllegalArgumentException("無向グラフではない");
                }
            }
        }
        final static class WeightedDirectedGraph extends AdjacencyListGraph{
            WeightedDirectedGraph(Map<Integer,List<Integer>> graph){
                super(graph);
            }
        }
    }



}
