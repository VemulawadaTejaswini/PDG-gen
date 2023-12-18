import java.util.*;
import java.io.*;
 
public class Main {
  public static void main(String[] args) throws Exception{
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    
    new Solution(n, s);
  }
}

class Solution {
  public Solution(int n, String s) {
    List<Integer> r = new ArrayList<>();
    List<Integer> g = new ArrayList<>();
    List<Integer> b = new ArrayList<>();
    HashSet<Integer> rs = new HashSet<>();
    HashSet<Integer> gs = new HashSet<>();
    HashSet<Integer> bs = new HashSet<>();
    for(int i = 0; i < n; ++i) {
      if(s.charAt(i) == 'R') {
        r.add(i);
        rs.add(i);
      }
      if(s.charAt(i) == 'G') {
        g.add(i);
        gs.add(i);
      }
      if(s.charAt(i) == 'B') {
        b.add(i);
        bs.add(i);
      }
    }
    long res = 0;
    for(int i = 0; i < n; ++i) {
      if(s.charAt(i) == 'R') {
        int gi = higherBs(g, i);
        int bi = higherBs(b, i);
        if(gi == -1 || bi == -1) break;
        res += (g.size() - gi) * (b.size() - bi);
        for(int j = gi; j < g.size(); ++j) {
          if(bs.contains(2 * g.get(j) - i)) res--;
        }
        for(int j = bi; j < b.size(); ++j) {
          if(gs.contains(2 * b.get(j) - i)) res--;
        }
      }
      if(s.charAt(i) == 'G') {
        int gi = higherBs(r, i);
        int bi = higherBs(b, i);
        if(gi == -1 || bi == -1) break;
        res += (r.size() - gi) * (b.size() - bi);
        for(int j = gi; j < r.size(); ++j) {
          if(bs.contains(2 * r.get(j) - i)) res--;
        }
        for(int j = bi; j < b.size(); ++j) {
          if(rs.contains(2 * b.get(j) - i)) res--;
        }
      }
      if(s.charAt(i) == 'B') {
        int gi = higherBs(g, i);
        int bi = higherBs(r, i);
        if(gi == -1 || bi == -1) break;
        res += (g.size() - gi) * (r.size() - bi);
        for(int j = gi; j < g.size(); ++j) {
          if(rs.contains(2 * g.get(j) - i)) res--;
        }
        for(int j = bi; j < r.size(); ++j) {
          if(gs.contains(2 * r.get(j) - i)) res--;
        }
      }
    }
    System.out.println(res);
  }

  public int higherBs(List<Integer> num, int tar) {
    int ans = -1;
    int n = num.size();
    int l = 0, r = n - 1;
    while(l <= r) {
        int mid = l + (r - l) / 2;
        if(num.get(mid) <= tar) {
            l = mid + 1;
        } else {
            ans = mid;
            r = mid - 1;
        }
    }
    return ans;
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