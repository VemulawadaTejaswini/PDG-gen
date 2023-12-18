import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.NumberFormatException;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    final FastScanner fs = new FastScanner();
    int n = fs.nextInt();
    long k = fs.nextLong();
    int[] a = new int[n];
    for (int i=0;i<n;i++) a[i] = fs.nextInt();
    Map<Node,Long> indxs = new HashMap<>();
    Map<Long,Node> nodes = new HashMap<>();
    LinkedList<Integer> list = new LinkedList<>();
    Set<Integer> set = new HashSet<>();
    long loop = -1L;
    long chain = -1L;
    indxs.put(new Node(new int[0]),0L);
    nodes.put(0L,new Node(new int[0]));
    for (long x=1L;x<k+1L;x++) {
      for (int i=0;i<n;i++) {
        if (set.contains(a[i])) {
          int v = list.pollLast();
          while (v != a[i]) {
            set.remove(v);
            v = list.pollLast();
          }
          set.remove(a[i]);
        } else {
          list.add(a[i]);
          set.add(a[i]);
        }
      }
      int[] b = new int[list.size()];
      int idx = 0;
      for (Iterator<Integer> it = list.iterator();it.hasNext();) {
        b[idx++] = it.next();
      }
      Node tmp = new Node(b);
      if (indxs.containsKey(tmp)) {
        chain = indxs.get(tmp);
        loop = x-chain;
        break;
      }
      indxs.put(tmp,x);
      nodes.put(x,tmp);
    }
    if (chain >= 0L) k = (k-chain)%loop+chain;
    int[] ans = nodes.get(k).arr;
    if (ans.length > 0) {
      StringBuilder sb = new StringBuilder();
      sb.append(ans[0]);
      for (int i=1;i<ans.length;i++) sb.append(" ").append(ans[i]);
      System.out.print(sb);
    }
    System.out.println();
  }
  private class Node {
    private int[] arr;
    Node(int[] arr) {
      this.arr = arr;
    }
    @Override
    public int hashCode() {
      return Arrays.hashCode(arr);
    }
    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null) return false;
      if (getClass() != obj.getClass()) return false;
      Node other = (Node)obj;
      return Arrays.equals(arr,other.arr);
    }
  }
}
class FastScanner {
  private final InputStream in = System.in;
  private final byte[] buffer = new byte[1024];
  private int ptr = 0;
  private int buflen = 0;
  private boolean hasNextByte() {
    if (ptr < buflen) return true;
    ptr = 0;
    try {
      buflen = in.read(buffer);
    } catch (IOException e) {
      e.printStackTrace();
    }
    if (buflen <= 0) return false;
    return true;
  }
  private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
  private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
  private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
  public boolean hasNext() { skipUnprintable(); return hasNextByte();}
  public int nextInt() { return (int)nextLong();}
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
    long n = 0L;
    boolean minus = false;
    int b = readByte();
    if (b == '-') {
      minus = true;
      b = readByte();
    }
    if (b < '0' || '9' < b) throw new NumberFormatException();
    while(true) {
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
}