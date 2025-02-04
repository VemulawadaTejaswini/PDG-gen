import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
 

class way implements Comparable{
  int town1;
  int town2;
 
  public int compareTo(Object other){
    way anoherway = (way)other;
    if(town1 == anoherway.town1){
      return town2 - anoherway.town2;
    }
    return town1 - anoherway.town1;
  }
}

 
public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] rootnums = new int[n];
    for(int i = 0; i < n; i++){
      rootnums[i] = i;
    }

    way[] ways = new way[m];

    for(int i = 0; i < m; i++){
      int smaller = sc.nextInt() - 1;
      int larger = sc.nextInt() - 1;

      way newway = new way();
      newway.town1 = smaller;
      newway.town2 = larger;
      ways[i] = newway;

    }
    Arrays.sort(ways);

    for(int i = 0; i < m; i++){
      int smaller = ways[i].town1;
      int larger = ways[i].town2;
      while(rootnums[smaller] != smaller){
        smaller = rootnums[smaller];
      }
      rootnums[larger] = smaller;      
    }



    boolean[] mintown = new boolean[n];
    for(int i = 0; i < n; i++){
      mintown[i] = false;
    }
    for(int i = 0; i < n; i++){
      mintown[rootnums[i]] = true;
    }

    int groupcount = 0;
    for(int i = 0; i < n; i++){
      if(mintown[i]){
        groupcount++;
      }
    }

    System.out.println(groupcount - 1);
 
 
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