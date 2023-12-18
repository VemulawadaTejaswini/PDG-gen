
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
class UnionFindTree {
    int[] par;
    int[] rank;
    int[] size;
    UnionFindTree(int maxSize){
        par = new int[maxSize];
        rank = new int[maxSize];
        size = new int[maxSize];
        for(int i=0;i<maxSize;i++){
            par[i] = i;
            size[i] = 1;
        }
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

        if(x == y)return;
        
        if(rank[x] < rank[y]){
            par[x] = y;
            size[y]+=size[x];
        }else{
            par[y] = x;
            size[x]+=size[y];
            if(rank[x] == rank[y])rank[x]++;
        }
    }
    public boolean same(int x,int y){
        return find(x) == find(y);
    }
    public int size(int x){
        return size[par[x]];
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
        UnionFindTree railwayTree = new UnionFindTree(n);
        int s,t;
        for(int i=0;i<k;i++){
            s = fs.nextInt()-1;
            t = fs.nextInt()-1;
            roadTree.unite(s,t);
        }
        for(int i=0;i<l;i++){
            s = fs.nextInt()-1;
            t = fs.nextInt()-1;
            railwayTree.unite(s,t);
        }
        Map<Pair<Integer,Integer>,Integer> map = new HashMap<>();
        Integer tmp;
        Pair<Integer,Integer> pair;
        for(int i=0;i<n;i++){
            pair = new Pair<>(roadTree.find(i),railwayTree.find(i));
            tmp = map.get(pair);
            if(tmp == null){
                map.put(pair,1);
            }else{
                map.replace(pair,tmp+1);
            }
        }
        StringJoiner sj = new StringJoiner(" ");
        for(int i=0;i<n;i++){
            pair = new Pair<>(roadTree.find(i),railwayTree.find(i));
            sj.add(String.valueOf(map.get(pair)));
        }
        System.out.println(sj.toString());
    }
}
class Pair<K,V> {
    public final K first;
    public final V second;
    Pair(K first,V second){
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object obj){
        
        if(!(obj instanceof Pair)){
            return false;
        }else{
            Pair<?,?> p = (Pair<?,?>)obj;
            return this.first == p.first && this.second == p.second;
        }
    }
    @Override
    public int hashCode(){
        return first.hashCode()^second.hashCode();
    }
}