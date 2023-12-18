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
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int N = sc.nextInt();
    int A[] = new int[N];
    for(int i=0; i<N; i++) A[i] = sc.nextInt();
    int B[] = new int[N];
    int top = A[N-1];
    int bottom = 0;
    while(true){
      int middle = (top + bottom) / 2;
      B[0] = middle;
      for(int i=1; i<N; i++){
        B[i] = A[i-1] - B[i-1];
      }
      int tmp = B[0] + B[N-1];
      if(tmp == A[N-1]) break;
      if(tmp > A[N-1]) top = middle;
      else bottom = middle;
    }
    for(int i=0; i<N; i++){
      int z = B[i] * 2;
      out.print(z + " ");
    }
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}