import java.util.*;
import java.io.*;

public class Main{
  static int repow(int b,int p){
    long a = b;
    long res=1;
    while(p>0){
      if(p%2==1){
        res*=a;
      }
      a*=a;
      p/=2;
    }
    return (int)res;
  }
  static int repow(int b,int p,int modder){
    long a = b%modder;
    long res=1;
    while(p>0){
      if(p%2==1){
        res=(res*a)%modder;
      }
      a=(a*a)%modder;
      p/=2;
    }
    return (int)res;
  }
  static long repow(long b,long p){
    long a = b;
    long res=1;
    while(p>0){
      if(p%2==1){
        res*=a;
      }
      a*=a;
      p/=2;
    }
    return res;
  }
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
    public String[] nextA(int n){
      String[] a = new String[n];
      nextA(a,n);
      return a;
    }
    public void nextA(String[] a,int n){
      nextA(a,0,n);
    }
    public void nextA(String[] a,int off,int len){
      for(int i=off;i<off+len;i++){
        a[i]=next();
      }
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
  public static void main(String args[]){
    int mod=1_000_000_007;
    int n=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    long all=repow(2,n,mod)-1;
    long[] nck=new long[b+1];
    long[] inv=new long[b+2];
    nck[0]=1;
    inv[1]=1;
    for(int i=1;i<b+1;i++){
      nck[i]=((nck[i-1]*(n-i+1))%mod*inv[i])%mod;
      inv[i+1]=mod-inv[(int)(mod%(i+1))]*(mod/(i+1))%mod;
    }
//    System.err.println(Arrays.toString(inv));
//    System.err.println(Arrays.toString(nck));
    out.println((all+mod-nck[a]+mod-nck[b])%mod);
    out.flush();
  }
}