import java.util.*;
import java.io.*;

class Main{
    static HashMap<Pair, Integer> colors;
    static ArrayList<Integer> edges[];
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        edges=new ArrayList[n];
        for(int i=0;i<n;i++) edges[i]=new ArrayList<Integer>(n);
        Pair[] pairs=new Pair[n-1];
        int dim=0;
        int st=0;
        for(int i=0;i<n-1;i++){
            int a=fsc.nextInt()-1, b=fsc.nextInt()-1;
            edges[a].add(b);
            edges[b].add(a);
            if(edges[a].size()>dim){dim=edges[a].size(); st=a;}
            if(edges[b].size()>dim){dim=edges[b].size(); st=b;}
            pairs[i]=new Pair(a, b);
        }
        fsc.close();
        colors=new HashMap<>();
        coloring(st, -1, 0);
        System.out.println(dim);
        for(int i=0;i<n-1;i++) System.out.println(colors.get(pairs[i]));
    }
    static void coloring(int v, int parent, int color){
        int c=1;
        for(int u:edges[v]){
            Pair pair=new Pair(u, v);
            if(u!=parent){
                if(color==c) c++;
                colors.put(pair, c);
                coloring(u, v, c);
                c++;
            }
        }
    }
}
class Pair{
    int id1, id2;
    public Pair(int id1, int id2){this.id1=id1; this.id2=id2;}
    @Override public boolean equals(Object o){
        if(! (o instanceof Pair)) return false;
        Pair p=(Pair) o;
        if((p.id1==id1 && p.id2==id2) || (p.id1==id2 && p.id2==id1)) return true;
        else return false;
    }
    @Override public int hashCode(){return id1*id2;}
}
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte(){
        if(ptr<buflen) return true;
        else{
            ptr = 0;
            try{
                buflen = in.read(buffer);
            }
            catch(IOException e){
                e.printStackTrace();
            }
            if(buflen<=0) return false;
        }
    return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }
            else if(b == -1 || !isPrintableChar(b)) return minus ? -n : n;
            else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
    public void close(){
        try{in.close();}
        catch(IOException e){e.printStackTrace();}
    }
}