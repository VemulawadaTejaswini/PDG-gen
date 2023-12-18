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
    public int[] nextAInt(int n){
      int[] a = new int[n];
      nextAInt(a,n);
      return a;
    }
    public void nextAInt(int[] a,int n){
      nextAInt(a,0,n);
    }
    public void nextAInt(int[] a,int off,int len){
      for(int i=off;i<off+len;i++){
        a[i] = nextInt();
      }
    }
    public long[] nextALong(int n){
      long[] a = new long[n];
      nextALong(a,n);
      return a;
    }
    public void nextALong(long[] a,int n){
      nextALong(a,0,n);
    }
    public void nextALong(long[] a,int off,int len){
      for(int i=off;i<off+len;i++){
        a[i] = nextLong();
      }
    }
    public double[] nextADouble(int n){
      double[] a = new double[n];
      nextADouble(a,n);
      return a;
    }
    public void nextADouble(double[] a,int n){
      nextADouble(a,0,n);
    }
    public void nextADouble(double[] a,int off,int len){
      for(int i=off;i<off+len;i++){
        a[i] = nextDouble();
      }
    }
    public List<Integer> nextLInt(int n){
      List<Integer> l = new ArrayList<>(n);
      for(int i=0;i<n;i++){
        l.add(sc.nextInt());
      }
      return l;
    }
    public List<Long> nextLLong(int n){
      List<Long> l = new ArrayList<>(n);
      for(int i=0;i<n;i++){
        l.add(sc.nextLong());
      }
      return l;
    }
    public List<Double> nextLDouble(int n){
      List<Double> l = new ArrayList<>(n);
      for(int i=0;i<n;i++){
        l.add(sc.nextDouble());
      }
      return l;
    }
  }
  static Scnr sc = new Scnr();
  static PrintWriter out = new PrintWriter(System.out);
  public static void main(String[] args){
    int n=sc.nextInt();
    int wmax=sc.nextInt();
    int[] w = new int[n];
    int[] v = new int[n];
    for(int i=0;i<n;i++){
      w[i]=sc.nextInt();
      v[i]=sc.nextInt();
    }
    long[][] dp = new long[n+1][100001];
    for(int i=0;i<=n;i++){
      Arrays.fill(dp[i],Integer.MAX_VALUE);
    }
    dp[0][0]=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<=100000;j++){
        if(dp[i][j]!=Integer.MAX_VALUE){
          dp[i+1][j]=Math.min(dp[i][j],dp[i+1][j]);
          dp[i+1][j+v[i]]=Math.min(dp[i][j]+w[i],dp[i+1][j+v[i]]);
        }
      }
    }
    long max=0;
    for(int i=0;i<100001;i++){
      if(dp[n][i]<=wmax){
        max=Math.max(i,max);
      }
    }
    out.println(max);
    out.flush();
  }
}