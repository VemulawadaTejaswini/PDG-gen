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
 
    int n = sc.nextInt();
    int k = sc.nextInt();

    int[][] cango = new int[k][2];
    for(int i = 0; i < k; i++){
      int smaller = sc.nextInt();
      int larger = sc.nextInt();
      cango[i][0] = smaller;
      cango[i][1] = larger;
    }

    int[] imos = new int[n+1];
    imos[0] = 0;
    imos[1] = 1;
    imos[2] = -1;
    for(int i = 3; i <= n; i++){
      imos[i] = 0;
    }
    int pattern = 0;
    for(int i = 1; i <= n; i++){
      pattern = (pattern + imos[i]) % 998244353;
      imos[i] = pattern;
      for(int j = 0; j < k; j++){
        int smaller = cango[j][0];
        int larger = cango[j][1];
        if(i + smaller <= n){
          imos[i + smaller] = (imos[i + smaller] + imos[i]) % 998244353;
        }
        if(i + larger + 1 <= n){
          imos[i + larger + 1] = (imos[i + larger + 1] - imos[i]) % 998244353;
        }
      }
    }

    System.out.println((imos[n] + 998244353) % 998244353);


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