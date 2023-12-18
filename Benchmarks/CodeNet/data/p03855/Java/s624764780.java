
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
class UnionFindTree {
    int[] par;
    int[] rank;
    UnionFindTree(int size){
        par = new int[size];
        rank = new int[size];
        for(int i=0;i<size;i++)par[i] = i;
    }

    public int find(int x){
        if(par[x] == x){
            return x;
        }else{
            return par[x] = find(par[x]);
        }
    }
    public void unite(int x,int y){
        x = find(x);
        y = find(y);
        if(rank[x] < rank[y]){
            par[x] = y;
        }else{
            par[y] = x;
            if(rank[x] == rank[y])rank[x]++;
        }
    }
    public boolean same(int x,int y){
        return find(x) == find(y);
    }
    public int size(int x){
        x = find(x);
        return rank[x];
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
public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int k = fs.nextInt();
        int l = fs.nextInt();
        UnionFindTree roadTree = new UnionFindTree(n);
        UnionFindTree resTree = new UnionFindTree(n);
        List<LinkedList<Integer>> road = new ArrayList<>();
        List<LinkedList<Integer>> railway = new ArrayList<>();
        for(int i=0;i<n;i++){
            road.add(new LinkedList<>());
            railway.add(new LinkedList<>());
        }
        Integer s,t;
        for(int i=0;i<k;i++){
            s = fs.nextInt()-1;
            t = fs.nextInt()-1;
            road.get(s).add(t);
            road.get(t).add(s);
        }
        for(int i=0;i<l;i++){
            s = fs.nextInt()-1;
            t = fs.nextInt()-1;
            railway.get(s).add(t);
            railway.get(t).add(s);
        }

        boolean[] isVisited = new boolean[n];
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(!isVisited[i]){
                queue.add(i);
                isVisited[i] = true;
                while(!queue.isEmpty()){
                    s = queue.poll();
                    for(Integer u : road.get(s)){
                        if(!isVisited[u]){
                            isVisited[u] = true;
                            queue.add(u);
                            roadTree.unite(i, u);
                        }
                    }
                }
            }
        }
        Arrays.fill(isVisited,false);
        for(int i=0;i<n;i++){
            if(!isVisited[i]){
                isVisited[i] = true;
                queue.add(i);
                while(!queue.isEmpty()){
                    s = queue.poll();
                    for(Integer u:railway.get(s)){
                        if(!isVisited[u]){
                            isVisited[u] = true;
                            queue.add(u);
                            if(roadTree.same(s, u)){
                                resTree.unite(u, i);
                            }
                            
                        }
                    }
                }
            }
        }
        StringJoiner sj = new StringJoiner(" ");
        for(int i=0;i<n;i++){
            sj.add(String.valueOf(resTree.size(i)+1));
        }
        System.out.println(sj.toString());
    }
}