package ABC126;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

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
class Edge{
    int to ;
    int len;
    Edge(int to,int len){
        this.to = to;
        this.len = len;
    }
}
public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        List<LinkedList<Edge>> graph = new ArrayList<>();
        for(int i=0;i<n;i++)graph.add(new LinkedList<>());
        int s,t,w;
        for(int i=0;i<n-1;i++){
            s = fs.nextInt()-1;
            t = fs.nextInt()-1;
            w = fs.nextInt();
            graph.get(s).add(new Edge(t,w));
            graph.get(t).add(new Edge(s,w));
        }

        int[] color = new int[n];
        boolean[] visited = new boolean[n];
        
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        color[0] = 0;
        visited[0] = true;
        int tmp;
        while(!queue.isEmpty()){
            tmp = queue.poll();
            for(Edge e: graph.get(tmp)){
                if(!visited[e.to]){
                    if(e.len%2==0){
                        color[e.to] = color[tmp];
                    }else{
                        color[e.to] = 1-color[tmp];
                    }
                    visited[e.to] = true;
                    queue.add(e.to);
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(color[i]);
        }
        System.out.flush();
    }
}