import java.util.*;
import java.io.*;

class Main{
  static class Scnr{
    private final InputStream ins;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    Scnr(){
      this(System.in);
    }
    Scnr(InputStream in){
      ins = in;
    }
    private boolean hasNextByte(){
      if(ptr<buflen){
        return true;
      }else{
        ptr = 0;
        try{
          buflen = ins.read(buffer);
        }catch(IOException e){
          e.printStackTrace();
        }
        if(buflen<=0){
          return false;
        }
      }
      return true;
    }
    private int readByte(){
      if(hasNextByte()){
        return buffer[ptr++];
      }else{
        return -1;
      }
    }
    private static boolean isPrintableChar(int c){
      return 33<=c&&c<=126;
    }
    public boolean hasNext(){
      while(hasNextByte()&&!isPrintableChar(buffer[ptr])){
        ptr++;
      }
      return hasNextByte();
    }
    public String next(){
      return nextBuilder().toString();
    }
    public StringBuilder nextBuilder(){
      if(!hasNext()){
        throw new NoSuchElementException();
      }
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while(isPrintableChar(b)){
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb;
    }
    public double nextDouble(){
      return Double.parseDouble(next());
    }
    public long nextLong(){
      if(!hasNext()){
        throw new NoSuchElementException();
      }
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if(b=='-'){
        minus=true;
        b=readByte();
      }
      if(b<'0'||'9'<b){
        throw new NumberFormatException();
      }
      while(true){
        if('0'<=b&&b<='9'){
          n*=10;
          n+=b-'0';
        }else if(b==-1||!isPrintableChar(b)){
          return minus?-n:n;
        }else{
          throw new NumberFormatException();
        }
        b=readByte();
      }
    }
    public int nextInt(){
      long nl=nextLong();
      if(nl<Integer.MIN_VALUE||Integer.MAX_VALUE<nl){
        throw new NumberFormatException();
      }
      return (int) nl;
    }
  }
  static Scnr sc=new Scnr();
  static PrintWriter out=new PrintWriter(System.out);
  static int iMax=Integer.MAX_VALUE;
  static int n;
  static Node[] ns;
  static int[] dp;
  public static void main(String[] args){
    n=sc.nextInt();
    ns=Node.scan(n);
    for(int i=0;i<n-1;i++){
      int a=sc.nextInt()-1;
      int b=sc.nextInt()-1;
      ns[a].add(ns[b]);
      ns[b].add(ns[a]);
    }
    dp=new int[n+2];
    Arrays.fill(dp,iMax);
    dp[0]=0;
    calc(ns[0]);
    Node.printAns(ns);
  }
  static void calc(Node hr){
    int aaa=bs(dp,hr.v);
    int tmp=dp[aaa+1];
    dp[aaa+1]=Integer.min(hr.v,dp[aaa+1]);
    hr.ans=bs(dp,iMax);
    for(Node nx:hr.lin){
      if(nx.ans==0){
        calc(nx);
      }
    }
    dp[aaa+1]=tmp;
  }
  static class Node{
    int id;
    int v;
    int ans=0;
    List<Node> lin=new ArrayList<>();
    Node(int id,int v){
      this.id=id;
      this.v=v;
    }
    void add(Node n){
      lin.add(n);
    }
    static Node[] scan(int n){
      Node[] res=new Node[n];
      for(int i=0;i<n;i++){
        res[i]=new Node(i,sc.nextInt());
      }
      return res;
    }
    static void printAns(Node[] a){
      for(int i=0;i<a.length;i++){
        out.println(a[i].ans);
      }
      out.flush();
    }
  }
  static int bs(int[] a,int key){
    int ok=-1;
    int ng=a.length;
    while(ng-ok>1){
      int gaze=ok+(ng-ok)/2;
      if(a[gaze]<key){
        ok=gaze;
      }else{
        ng=gaze;
      }
    }
    return ok;
  }
}