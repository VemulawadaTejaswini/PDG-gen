import java.util.*;
import java.io.*;

class Main{
  static Scnr sc = new Scnr(System.in);
  public static void main(String[] args){
    int  n = sc.nextInt();
    Deque<Integer>[] dq = new Deque[n];
    for(int i=0;i<n;i++){
      dq[i]=new ArrayDeque<Integer>(n-1);
      for(int j=0;j<n-1;j++){
        dq[i].addLast(sc.nextInt()-1);
      }
    }
    int days=0;
    Set<Integer> match = new HashSet<>();
    while(true){
      for(int i=0;i<n;i++){
        if(!dq[i].isEmpty()&&!dq[dq[i].getFirst()].isEmpty()&&dq[dq[i].getFirst()].getFirst()==i){
          match.add(i);
        }
      }
      if(match.isEmpty()){
        for(int j=0;j<n;j++){
          if(!dq[j].isEmpty()){
            System.out.println(-1);
            return;
          }
        }
        System.out.println(days);
        return;
      }else{
        for(int j:match){
          dq[j].removeFirst();
        }
      }
      days++;
      match.clear();
    }
  }
  static class Scnr{
    private final InputStream ins;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
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
      if(!hasNext()){
        throw new NoSuchElementException();
      }
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while(isPrintableChar(b)){
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
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
      for(int i=0;i<n;i++){
        a[i] = nextInt();
      }
      return a;
    }
    public long[] nextALong(int n){
      long[] a = new long[n];
      for(int i=0;i<n;i++){
        a[i] = nextLong();
      }
      return a;
    }
    public double[] nextADouble(int n){
      double[] a = new double[n];
      for(int i=0;i<n;i++){
        a[i]=nextDouble();
      }
      return a;
    }
  }
}