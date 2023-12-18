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
    int[] as = new int[n];
    int[] bs = new int[n];
    for(int i = 0; i < n; i++){
      as[i] = i + 1;
      bs[i] = n - i;
    }

    int nowmin = 0;
    for(int i = 0; i < n; i++){
      int nowp = sc.nextInt() - 1;
      int nowab = as[nowp] + bs[nowp];
      if(nowab <= nowmin){
        int sa = nowmin - nowab + 1;
        for(int j = nowp; j < n; j++){
          as[j] += sa;
        }
        for(int j = nowp; j >= 0; j--){
          bs[j] += sa;
        }        
      }
      nowmin = as[nowp] + bs[nowp];
    }

    for(int i = 0; i < n - 1; i++){
      System.out.print(as[i]);
      System.out.print(" ");
    }
    System.out.println(as[n - 1]);
    for(int i = 0; i < n - 1; i++){
      System.out.print(bs[i]);
      System.out.print(" ");
    }
    System.out.println(bs[n - 1]);

  }
 
//nextChar を追加したよ！

//System.out.printf("? %d %d\n", i, j);

  
// LinkedList<Integer>[] setsu = new LinkedList[n];
// for(int i = 0; i < n; i++){
//   setsu[i] = new LinkedList<Integer>();
// } 

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