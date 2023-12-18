import java.util.*;
import java.io.*;
import static java.lang.System.*;

class FastScanner {
  private final InputStream in = System.in;
  private final byte[] buffer = new byte[1024];
  private int ptr = 0;
  private int buflen = 0;
  private boolean hasNextByte() {
      if (ptr < buflen) {
          return true;
      }else{
          ptr = 0;
          try {
              buflen = in.read(buffer);
          } catch (IOException e) {
              e.printStackTrace();
          }
          if (buflen <= 0) {
              return false;
          }
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
      if (b < '0' || '9' < b) {
          throw new NumberFormatException();
      }
      while(true){
          if ('0' <= b && b <= '9') {
              n *= 10;
              n += b - '0';
          }else if(b == -1 || !isPrintableChar(b)){
              return minus ? -n : n;
          }else{
              throw new NumberFormatException();
          }
          b = readByte();
      }
  }
  public int nextInt() {
      long nl = nextLong();
      if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
      return (int) nl;
  }
  public double nextDouble() { return Double.parseDouble(next());}
}

class Node extends ArrayList<Integer>{
}
  
class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int N = sc.nextInt();
    int Q = sc.nextInt();
    List<Node> edges = new ArrayList<Node>(N);
    for(int i=0; i<N; i++){
      Node a = new Node();
      edges.add(a);
    }
    int count[] = new int[N];
    for(int i=0; i<N-1; i++){
      int a = sc.nextInt()-1;
      int b = sc.nextInt()-1;
      edges.get(a).add(b);
      edges.get(b).add(a);
    }
    boolean use[] = new boolean[N];
    for(int i=0; i<Q; i++){
      int p = sc.nextInt()-1;
      int x = sc.nextInt();
      count[p] += x;
    }
    Queue<Integer> queue = new ArrayDeque<>();
    queue.add(0);
    while(!queue.isEmpty()){
      int tmp = queue.poll();
      for(int a : edges.get(tmp)){
        if(!use[a]){
          count[a] += count[tmp];
          queue.add(a);
        }
      }
      use[tmp] = true;
    }
    for(int i=0; i<N; i++) out.print(count[i] + " ");
  }
}