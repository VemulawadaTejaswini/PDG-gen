//PC充電きれそうなのでメモのため提出

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
 
 
 
public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    long n = sc.nextLong();
    int x = sc.nextInt();
    int m = sc.nextInt();

    int[] nearest_apper = new int[m];
    for(int i = 0; i < m; i++){
      nearest_apper[i] = -1;
    }
    int[] seq = new int[2 * m];
    seq[0] = x;
    nearest_apper[x] = 0;
    int startpoint = 0;
    int endpoint = 0;
    for(int i = 1; i < 2 * m; i++){
      long prenum = seq[i - 1];
      long nextnum = (prenum * prenum) % m;
      seq[i] = (int)nextnum;
      if(nearest_apper[seq[i]] >= 0){
        startpoint = nearest_apper[seq[i]];
        endpoint = seq[i];
        break;
      }else{
        nearest_apper[seq[i]] = i;
      }
//      System.out.println(seq[i]);
    }

    long ans = 0;
    if(n <= startpoint){
      for(int i = 0; i < n; i++){
        ans += seq[i];
      }
    }else{
      for(int i = 0; i < startpoint; i++){
        ans += seq[i];
      }
      long loop_sum = 0;
      for(int i = startpoint; i < endpoint; i++){
        loop_sum += seq[i];
      }
      long loop_count = (n - startpoint) / (endpoint - startpoint);
      ans += loop_sum * loop_count;
      long loop_amari = (n - startpoint) % (endpoint - startpoint);
      for(int i = startpoint; i < startpoint + loop_amari; i++){
        ans += seq[i];
      }
    }
    System.out.println(ans);


  }
 
 //ここからテンプレ
  static class InputReader {
      private InputStream stream;
      private byte[] buf = new byte[1024];
      private int curChar;
      private int numChars;
      private SpaceCharFilter filter;
 
      public InputReader(InputStream stream) {
          this.stream = stream;
      }
 
      public int next() {
          if (numChars == -1)
              throw new InputMismatchException();
          if (curChar >= numChars) {
              curChar = 0;
              try {
                  numChars = stream.read(buf);
              } catch (IOException e) {
                  throw new InputMismatchException();
              }
              if (numChars <= 0)
                  return -1;
          }
          return buf[curChar++];
      }
 
      public String nextStr() {
        int c = next();
        while(isSpaceChar(c)){c = next();}
        StringBuffer str = new StringBuffer();
        do{
          str.append((char)c);
          c = next();
        }while(!isSpaceChar(c));
        return str.toString();
      }
 
      public char nextChar() {
        int c = next();
        while(isSpaceChar(c)){c = next();}
        char ret;
        do{
          ret = (char)c;
          c = next();
        }while(!isSpaceChar(c));
        return ret;
      }
 
      public int nextInt() {
          int c = next();
          while (isSpaceChar(c))
              c = next();
          int sgn = 1;
          if (c == '-') {
              sgn = -1;
              c = next();
          }
          int res = 0;
          do {
              if (c < '0' || c > '9')
                  throw new InputMismatchException();
              res *= 10;
              res += c - '0';
              c = next();
          } while (!isSpaceChar(c));
          return res * sgn;
      }

      public long nextLong() {
          int c = next();
          while (isSpaceChar(c))
              c = next();
          int sgn = 1;
          if (c == '-') {
              sgn = -1;
              c = next();
          }
          long res = 0;
          do {
              if (c < '0' || c > '9')
                  throw new InputMismatchException();
              res *= 10;
              res += c - '0';
              c = next();
          } while (!isSpaceChar(c));
          return res * sgn;
      } 

      public boolean isSpaceChar(int c) {
          if (filter != null)
              return filter.isSpaceChar(c);
          return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
      }
 
      public interface SpaceCharFilter {
          public boolean isSpaceChar(int ch);
      }
  }
}