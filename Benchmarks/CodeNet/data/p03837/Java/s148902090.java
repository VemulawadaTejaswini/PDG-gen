import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Queue;
class Edge{
    int to;
    long cost;
    Edge(int to,long cost){
        this.to = to;
        this.cost = cost;
    }
}

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int m = fs.nextInt();
        int[] a = new int[n];
        List<LinkedList<Edge>> graph = new ArrayList<>();
        List<LinkedList<Edge>> select = new ArrayList<>();
        boolean[] visited = new boolean[n];
        long[] kanban = new long[n];
        Arrays.fill(visited,true);
        for(int i=0;i<n;i++){
            graph.add(new LinkedList<>());
            select.add(new LinkedList<>());
        }
        int from,to,cost;
        for(int i=0;i<m;i++){
            from = fs.nextInt()-1;
            to = fs.nextInt()-1;
            cost = fs.nextInt();
            graph.get(from).add(new Edge(to,cost));
            graph.get(to).add(new Edge(from,cost));
        }
        for(int i = 0; i < n; i++){
          long inf = 1000000000000L;
          long[] dist = new long[n];
          Arrays.fill(dist,inf);
          Arrays.fill(kanban,inf);
          Queue<Integer> queue = new ArrayDeque<>();
          queue.add(i);
          dist[i] = 0;
        while(!queue.isEmpty()){
            int x = queue.poll();
            for(Edge e : graph.get(x)){
              System.out.println(x+"+"+e.to);
              if(visited[e.to]){
                visited[e.to] = false;
                queue.add(e.to);
              }
              if(Math.min(e.cost+dist[x],dist[e.to]) == e.cost+dist[x]){
                
                kanban[e.to] = x;
              }
              dist[e.to] = Math.min(e.cost+dist[x],dist[e.to]);
            }  
        }
          System.out.println("start");
          for(int j = 0; j < n; j++){
            System.out.println(kanban[j]);
          }
      }
  }
}
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte(){
        if(ptr < buflen){
            return true;
        }else{
            ptr = 0;
            try{
                buflen = in.read(buffer);
            }catch(IOException e){
                e.printStackTrace();
            }
            if(buflen <=0){
                return false;
            }
        }
        return true;
    }
 
    private int readByte(){
        if(hasNextByte())return buffer[ptr++];
        else return -1;
    }
 
    private static boolean isPrintableChar(int c){
        return 33<=c && c<=126;
    }
    public boolean hasNext(){
        while(hasNextByte() && !isPrintableChar(buffer[ptr]))ptr++;
        return hasNextByte();
    }
 
    public String next(){
        if(!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
 
    public long nextLong(){
        if(!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        if(b < '0' || '9' < b){
            throw new NumberFormatException();
        }
        while(true){
            if('0' <= b && b<='9'){
                n*=10;
                n+=b-'0';
            }else if(b==-1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt(){
        long nl = nextLong();
        if(nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDoutble(){return Double.parseDouble(next());}
}
