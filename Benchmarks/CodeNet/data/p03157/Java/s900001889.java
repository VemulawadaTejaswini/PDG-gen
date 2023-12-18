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
 
 
    int h = sc.nextInt();
    int w = sc.nextInt();

    String[] strs = new String[h];
    for(int i = 0; i < h; i++){
      strs[i] = sc.nextStr();
    }

    char[][] table = new char[h][w];
    for(int i = 0; i < h; i++){
      for(int j = 0; j < w; j++){
        table[i][j] = strs[i].charAt(j);
      }
    }

    int ans = 0;

    for(int i = 0; i < h; i++){
      for(int j = 0; j < w; j++){
        if(table[i][j] == '.'){continue;}//白やったら無視

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        LinkedList<Integer> x = new LinkedList<Integer>();
        LinkedList<Integer> y = new LinkedList<Integer>();
        TreeSet<Integer> xed = new TreeSet<Integer>();
        TreeSet<Integer> yed = new TreeSet<Integer>();
        //addとpollでやっていこうな
        x.add(i);
        y.add(j);
        while(x.size() > 0){
          int nowx = x.poll();
          int nowy = y.poll();

          for(int k = 0; k < 4; k++){
            int nextx = nowx + dx[k];
            int nexty = nowy + dy[k];
            if(0 <= nextx && nextx < h && 0 <= nexty && nexty < w && table[nextx][nexty] != table[nowx][nowy] && !(table[nextx][nexty] == '.' && xed.contains(nextx) && yed.contains(nexty))){
              x.add(nextx);
              y.add(nexty);

              if(table[nextx][nexty] == '.'){
                ans++;
                xed.add(nextx);
                yed.add(nexty);
              }

            }
          }
        }
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