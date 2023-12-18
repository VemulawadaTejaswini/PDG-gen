import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

import java.util.*;

public class Main{
  static final boolean DEBUG = true;

  public static void main(String[] args){
    FastScanner sc = new FastScanner();

    int[] a = new int[3];
    a[0] = sc.nextInt();
    a[1] = sc.nextInt();
    a[2] = sc.nextInt();

    Arrays.sort(a);
    int ans = 0;
    if(a[0] == a[1] && a[1] == a[2]){
      ans = 0;
    }
    else if(a[0] == a[1] || a[1] == a[2]){
      int diff = Math.max(a[1] - a[0], a[2] - a[1]);
      ans = (diff + ((diff % 2 == 1) ? 1 : 0)) / 2 + ((diff % 2 == 1) ? 1 : 0);
    }
    else{
      int diff = a[1] - a[0];
      int aa = diff / 2 + ((diff % 2 == 1) ? 1 : 0);
      aa += (a[2] - a[1] + ((diff % 2 == 1) ? 1 : 0));
      diff = a[2] - a[1];
      int bb = diff / 2 + ((diff % 2 == 1) ? 1 : 0);
      diff = (a[2] - a[0] + ((diff % 2 == 1) ? -1 : 0));
      bb += (diff + ((diff % 2 == 1) ? 1 : 0)) / 2 + ((diff % 2 == 1) ? 1 : 0);
      ans = Math.min(aa, bb);
    }

    System.out.println(ans);
  }
}

class FastScanner {
  private static final InputStream in = System.in;
  private static final PrintWriter out = new PrintWriter(System.out);
  private final byte[] buffer = new byte[2048];
  private int p = 0;
  private int buflen = 0;

  public FastScanner(){
  }

  private boolean hasNextByte() {
    if(p < buflen){
      return true;
    }
    p = 0;
    try{
      buflen = in.read(buffer);
    }catch (IOException e) {
      e.printStackTrace();
    }
    if(buflen <= 0){
      return false;
    }
    return true;
  }

  public boolean hasNext() {
    while(hasNextByte() && !isPrint(buffer[p])){
      p++;
    }
    return hasNextByte();
  }

  private boolean isPrint(int ch) {
    if(ch >= '!' && ch <= '~'){
      return true;
    }
    return false;
  }

  private int nextByte() {
    if(!hasNextByte()){
      return -1;
    }
    return buffer[p++];
  }

  public String next() {
    if(!hasNext()){
      throw new NoSuchElementException();
    }
    StringBuilder sb = new StringBuilder();
    int b = -1;
    while(isPrint((b = nextByte()))){
      sb.appendCodePoint(b);
    }
    return sb.toString();
  }

  public int nextInt() {
    return Integer.parseInt(next());
  }

  public long nextLong() {
    return Long.parseLong(next());
  }

  public double nextDouble() {
    return Double.parseDouble(next());
  }
}
