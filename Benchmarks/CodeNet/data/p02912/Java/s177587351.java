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

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static int[] heap;		// データの配列
  public static int num;		// 現在の要素数
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int N = sc.nextInt();
    int M = sc.nextInt();
    int A[] = new int[N];
    heap = new int[N+10];
    num = 0;
    for(int i=0; i<N; i++){
      A[i] = sc.nextInt();
      insert(A[i]);
    }
    for(int i=0; i<M; i++){
      int a = deletemax();
      a /= 2;
      insert(a);
    }
    long ans = 0;
    for(int i=0; i<N; i++){
      ans += heap[i];
    }
    out.println(ans);
  }
  
  public static void insert(int a){
    heap[num++]=a;
    int i=num,j=i/2;
    while(i>1 && heap[i-1]>heap[j-1]){
      int t=heap[i-1];
      heap[i-1]=heap[j-1];
      heap[j-1]=t;
      i=j;
      j=i/2;
    }
  }

  /*
   * 先頭の要素を取り除き、返す
   */
  public static int deletemax(){
    int r=heap[0];
    heap[0]=heap[--num];
    int i=1,j=i*2;
    while(j<=num){
      if(j+1<=num && heap[j-1]<heap[j]) j++;
      if(heap[i-1]<heap[j-1]){
	int t=heap[i-1];
	heap[i-1]=heap[j-1];
	heap[j-1]=t;
      }
      i=j;
      j=i*2;
    }
    return r;
  }
  
}