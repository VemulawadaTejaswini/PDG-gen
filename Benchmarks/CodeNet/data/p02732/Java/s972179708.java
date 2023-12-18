import java.util.*;
import java.io.*;
 
public class Main {
  public static void main(String[] args) throws Exception{
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n];
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < n; ++i) {
      int now = sc.nextInt();
      num[i] = now;
      if(!map.containsKey(now)) map.put(now, 0);
      map.put(now, map.get(now) + 1);
    }
    new Solution(n, map, num);
  }
}

class Solution {  
  public Solution(int n, HashMap<Integer, Integer> map, int[] num) {
    long res = 0;
    for(Map.Entry<Integer, Integer> set : map.entrySet()) {
      int count = set.getValue();
      if(count >= 2) res += count * (count - 1) / 2;
    }
    for(int i : num) {
      int count = map.get(i);
      long prt = res;
      if(count >= 2) prt -= count * (count - 1) / 2;
      if(count > 2) prt += (count - 2) * (count - 1) / 2;
      System.out.println(prt);
    }
    // System.out.println(res);
  }
}

class FastScanner {
  private final InputStream in;
  private final byte[] buffer = new byte[1024];
  private int ptr = 0;
  private int buflen = 0;

  public FastScanner(InputStream source) {
    in = source;
  }

  private boolean hasNextByte() {
    if (ptr < buflen) {
      return true;
    } else {
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

  private int readByte() {
    if (hasNextByte()) return buffer[ptr++];
    else return -1;
  }

  private static boolean isPrintableChar(int c) {
    return 33 <= c && c <= 126;
  }

  public boolean hasNext() {
    while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    return hasNextByte();
  }

  public String next() {
    if (!hasNext()) throw new NoSuchElementException();
    StringBuilder sb = new StringBuilder();
    int b = readByte();
    while (isPrintableChar(b)) {
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
    while (true) {
      if ('0' <= b && b <= '9') {
        n *= 10;
        n += b - '0';
      } else if (b == -1 || !isPrintableChar(b)) {
        return minus ? -n : n;
      } else {
        throw new NumberFormatException();
      }
      b = readByte();
    }
  }

  public int nextInt() {
    long nl = nextLong();
    if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
      throw new NumberFormatException();
    return (int) nl;
  }

  public double nextDouble() {
    return Double.parseDouble(next());
  }
}