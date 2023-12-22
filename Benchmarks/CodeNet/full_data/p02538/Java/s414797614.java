import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));static PrintWriter out = new PrintWriter(System.out);
    //static BufferedReader reader;static PrintWriter out;static { try { reader = new BufferedReader(new FileReader("input.txt"));out=new PrintWriter(new BufferedWriter(new FileWriter("output.txt"))); } catch (Exception e) { e.printStackTrace(); } }
    //static long[] tree;
    static int m = 998244353;
    public static void main(String[] args) throws Exception {
        //Scanner sc=new Scanner(System.in);
        Reader sc = new Reader();
        int n=sc.nextInt();
        int q=sc.nextInt();
        tree=new int[4*(n+1)];
        lazy=new int[4*(n+1)];
        Arrays.fill(lazy,-1);
        built(1,0,n-1);
        for (int i = 0; i <q ; i++) {
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            int c=sc.nextInt();
            update(1,0,n-1,a,b,c);
            out.println(tree[1]);

        }





        out.close();
    }

    static int[] tree;
    static int[] lazy;
    static int left(int p){ return p<<1;}
    static int right(int p){ return (p<<1)+1;}
    static int corner(int i,int j,int n){
        BigInteger pw=new BigInteger("10").pow(n).multiply(BigInteger.valueOf(i));
        pw=pw.add(BigInteger.valueOf(j)).mod(BigInteger.valueOf(m));
        return Integer.parseInt(String.valueOf(pw));
    }
    static void built(int p,int l,int r){
        if(l==r)tree[p]=1;
        else{
            built(left(p),l,(l+r)/2);
            built(right(p),(l+r)/2+1,r);
            tree[p]=corner(tree[left(p)],tree[right(p)],r-(l+r)/2);
        }
    }
    static int help(int v,int x){
        BigInteger tmp=BigInteger.valueOf(10).pow(x).subtract(BigInteger.ONE);
        tmp=tmp.divide(BigInteger.valueOf(9));
        tmp=tmp.multiply(BigInteger.valueOf(v)).mod(BigInteger.valueOf(m));
        return Integer.parseInt(String.valueOf(tmp));
    }
    static void propagate(int p, int l, int r) {
        if(lazy[p]!=-1){
            int mid=(l+r)/2;
            tree[left(p)]=help(lazy[p],mid-l+1);
            tree[right(p)]=help(lazy[p],r-(mid+1)+1);
            lazy[left(p)]=lazy[right(p)]=lazy[p];
            lazy[p]=-1;
        }
    }
    static void update(int p,int l,int r,int i,int j,int v){
        propagate(p,l,r);
        if(i>r||j<l)return;
        if(l>=i&&r<=j){
            lazy[p]=v;
            tree[p]=help(v,r-l+1);
            return;
        }
        update(left(p),l,(l+r)/2,i,j,v);
        update(right(p),(l+r)/2+1,r,i,j,v);
        tree[p]=corner(tree[left(p)],tree[right(p)],r-(l+r)/2);
    }



}

class node implements Comparable<node> {
    Integer no;
    Integer cost;
    Vector<node> adj = new Vector<>();

    public node(Integer no, Integer cost) {
        this.no = no;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "node{" +
                "no=" + no +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int compareTo(node o) {
        return o.cost - this.cost;
    }
}

class edge implements Comparable<edge> {
    tuple u;
    Double cost;

    public edge(tuple u, Double cost) {
        this.u = u;
        this.cost = cost;
    }

    @Override
    public int compareTo(edge o) {
        return this.cost.compareTo(o.cost);
    }

    @Override
    public String toString() {
        return "edge{" +
                "u=" + u +
                ", cost=" + cost +
                '}';
    }
}

///*
class tuple implements Comparable<tuple> {
    Integer a;
    Integer b;

    public tuple(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(tuple o) {
        return (int) (this.b - o.b);
    }

    @Override
    public String toString() {
        return "tuple{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}


//*/
class Reader {
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public Reader() {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public Reader(String file_name) throws IOException {
        din = new DataInputStream(new FileInputStream(file_name));
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    public String readLine() throws IOException {
        byte[] buf = new byte[64];
        int cnt = 0, c;
        while ((c = read()) != -1) {
            if (c == '\n') break;
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
    }

    public int nextInt() throws IOException {
        int ret = 0;
        byte c = read();
        while (c <= ' ') c = read();
        boolean neg = (c == '-');
        if (neg) c = read();
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');
        if (neg) return -ret;
        return ret;
    }

    public long nextLong() throws IOException {
        long ret = 0;
        byte c = read();
        while (c <= ' ') c = read();
        boolean neg = (c == '-');
        if (neg) c = read();
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');
        if (neg) return -ret;
        return ret;
    }

    public double nextDouble() throws IOException {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ') c = read();
        boolean neg = (c == '-');
        if (neg) c = read();
        do {
            ret = ret * 10 + c - '0';
        } while ((c = read()) >= '0' && c <= '9');
        if (c == '.') while ((c = read()) >= '0' && c <= '9') ret += (c - '0') / (div *= 10);
        if (neg) return -ret;
        return ret;
    }

    private void fillBuffer() throws IOException {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1) buffer[0] = -1;
    }

    private byte read() throws IOException {
        if (bufferPointer == bytesRead) fillBuffer();
        return buffer[bufferPointer++];
    }

    public void close() throws IOException {
        if (din == null) return;
        din.close();
    }
}