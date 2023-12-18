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
class deg{
    int from;
    int to;
    deg(int from,int to){
        this.from = from;
        this.to = to;
    }
}
public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int m = fs.nextInt();
        List<LinkedList<Edge>> graph = new ArrayList<>();
        boolean[] visited = new boolean[n];
        Arrays.fill(visited,true);
        List<LinkedList<deg>> D = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new LinkedList<>());
            D.add(new LinkedList<>());
            D.get(i).add(new deg(0,0));
        }
        int from,to,cost;
        for(int i=0;i<m;i++){
            from = fs.nextInt()-1;
            to = fs.nextInt()-1;
            cost = fs.nextInt();
            graph.get(from).add(new Edge(to,cost));
        }
        long inf = 100000000000000L;
        long[] dist = new long[n];
        Arrays.fill(dist,-inf);
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        dist[0] = 0;
        while(!queue.isEmpty()){
            int x = queue.poll();
            D.get(x).get(0).from = 1;
            for(Edge e : graph.get(x)){
              D.get(e.to).get(0).to = 1;
              if(visited[e.to]){
                visited[e.to] = false;
                queue.add(e.to);
              }
              if(D.get(e.to).get(0).from == 1){
                System.out.println("inf");
                System.exit(0);
              }
              dist[e.to] = Math.max(e.cost+dist[x],dist[e.to]);
            }  
        }
      
        System.out.println(dist[n-1]);
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