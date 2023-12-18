import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
class Node {
    int x;
    long d;
    public Node(int x,long d){
        this.x=x;
        this.d=d;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Node){
            Node c = (Node)o;
            return x == c.x && d==c.d;
        }
        return false;
    }
    public int hashCode(){
        return (int)(x+d);//for simplicity reason
    }

}
    void solve() {
        int n=ni(),m=ni();
        graph=new ArrayList[n+1];
        for(int i=1;i<=n;i++) graph[i]=new ArrayList<>();
        while(m-->0){
            int x=ni(),y=ni();
            long d=ni();
            graph[x].add(new Node(y,d));
            graph[y].add(new Node(x,d));

        }
        tin=new int[n+1];
        cnt=new long[n+1];
        vis=new boolean[n+1];
        for(int i=1;i<=n;i++) if(!vis[i]) dfs(i,-1);
        if(ans) pw.println("Yes"); else pw.println("No");
    }
    ArrayList<Node> graph[];
    boolean ans=true;
    long cnt[];
    boolean vis[];
    Stack<Node> stk=new Stack<>();
    Stack<Node> stk2=new Stack<>();
    int tin[];
    int cc=0;
    boolean dfs(int v,int pr){
        vis[v]=true;


        tin[v]=++cc;
        for(Node p : graph[v]){
            int u=p.x;
            if(!vis[u]){
                stk.push(new Node(v,p.d));
                if(!dfs(u,v)) return false;
                stk.pop();
            }else if(u!=pr && tin[u]<tin[v]){
                long total=p.d;
                while(stk.peek().x!=u){
                    stk2.push(stk.pop());
                }
                stk2.push(stk.pop());
                for(Node n1 : stk2) total+=n1.d;
                boolean check=false;
                for(Node n1 : stk2){
                    if(total-n1.d==n1.d){
                        check=true;
                    }
                }
                if(total-p.d==p.d)check=true;
                if(!check) ans=false;
               // pw.println(total+" "+u+" "+v);
                while (!stk2.isEmpty()) stk.push(stk2.pop());
                if(!ans) return false;

            }
        }
        return true;


    }

    long M=(long)1e9+7;
    InputStream is;
    PrintWriter pw;
    String INPUT = "";
    void run() throws Exception {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        pw = new PrintWriter(System.out);
        long s = System.currentTimeMillis();
        solve();
        pw.flush();
        if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
    }

    public static void main(String[] args) throws Exception { new Main().run(); }

    private byte[] inbuf = new byte[1024];
    public int lenbuf = 0, ptrbuf = 0;

    private int readByte() {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf){
            ptrbuf = 0;
            try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
            if(lenbuf <= 0)return -1;
        }
        return inbuf[ptrbuf++];
    }

    private boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
    private int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }

    private double nd() { return Double.parseDouble(ns()); }
    private char nc() { return (char)skip(); }

    private String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n && !(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }

    private char[][] nm(int n, int m) {
        char[][] map = new char[n][];
        for(int i = 0;i < n;i++)map[i] = ns(m);
        return map;
    }

    private int[] na(int n) {
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = ni();
        return a;
    }

    private int ni() {
        int num = 0, b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }

        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }

        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private void tr(Object... o) { if(INPUT.length() > 0)System.out.println(Arrays.deepToString(o)); }
}