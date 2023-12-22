import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;


 
public class Main {

  private static int pow(int n, int r){
    if(r == 0){return 1;}
    if(r == 1){return n;}
    return n * pow(n, r - 1);
  }

  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    int n = sc.nextInt();
    int x = sc.nextInt();
    int m = sc.nextInt();
    int[][] counts = new int[m][3];
    for(int i = 0; i < m; i++){
      counts[i][0] = sc.nextInt() - 1;
      counts[i][1] = sc.nextInt() - 1;
      counts[i][2] = sc.nextInt();      
    }
    int[] lions = new int[n];
    int maxcount = 0;
    int[] maxcomb = new int[n];
    boolean clear = false;
    for(int i = 0; i < pow(x + 1, n); i++){
      int[] thiscount = new int[n];
      int num = i;
      for(int j = 0; j < n; j++){
        thiscount[j] = num % (x + 1);
        num /= x + 1;
      }

      boolean correct = true;
      for(int j = 0; j < m; j++){
        int thislions = 0;
        for(int k = counts[j][0]; k <= counts[j][1]; k++){
          thislions += thiscount[k];
        }
        if(thislions != counts[j][2]){
          correct = false;
          break;
        }
      }
      if(correct){
        clear = true;
        int sum = 0;
        for(int j = 0; j < n; j++){
          sum += thiscount[j];
        }
        if(sum > maxcount){
          maxcount = sum;
          for(int j = 0; j < n; j++){
            maxcomb[j] = thiscount[j];
          }
        }
      }
    }

    if(clear){
      for(int i = 0; i < n; i++){
        System.out.print(maxcomb[i]);
        if(i != n - 1){
          System.out.print(" ");
        }else{
          System.out.println("");
        }
      }
    }else{
      System.out.println("-1");
    }
  }
 
  
 
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