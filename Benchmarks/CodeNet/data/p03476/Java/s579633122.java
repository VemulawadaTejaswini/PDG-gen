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
 
    int q = sc.nextInt();
    boolean[] primecheck = new boolean[100001];
    primecheck[0] = false;
    primecheck[1] = false;
    primecheck[2] = true;
    for(int i = 3; i < 100001; i++){
      boolean checker = true;
      for(int j = 2; j * j <= i; j++){
        if(i % j == 0){
          checker = false;
          break;
        }
      }
      primecheck[i] = checker;
    }

    boolean[] like2017 = new boolean[100001];
    like2017[0] = false;
    like2017[1] = false;
    for(int i = 2; i < 100001; i++){
      like2017[i] = (i % 2 == 1) && primecheck[i] && primecheck[(i + 1) / 2];
    }

    int[] imosu = new int[100001];
    imosu[0] = 0;
    for(int i = 1; i < 100001; i++){
      if(like2017[i]){
        imosu[i] = imosu[i - 1] + 1;
      }else{
        imosu[i] = imosu[i - 1];
      }
    }

    for(int i = 0; i < q; i++){
      int smaller = sc.nextInt();
      int bigger = sc.nextInt();
      System.out.println(imosu[bigger] - imosu[smaller - 1]);
    }


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