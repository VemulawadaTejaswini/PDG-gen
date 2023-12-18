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
    int x = sc.nextInt(); 

    int[] nums = new int[n];
    boolean[] check = new boolean[n];
    for(int i = 0; i < n; i++){
      nums[i] = sc.nextInt();
      check[i] = true;
    }

    long ans = 0;

    for(int i = n-1; i >= 0; i--){
      if(!check[i]){continue;}
      ans += (long)nums[i];
      ans += (long)x;
      check[i] = false;

      int nowhave = 1;

      for(int j = i - 1; j >= 0; j--){
        int sa = nums[j + 1] - nums[j];
        int ruijou = (nowhave + 1) * (nowhave + 1);
        ans += (long)sa * (long)ruijou;
        if(check[j]){//ゴミがまだある
          int nokori = nums[j];
          int nextruijou = (nowhave + 2) * (nowhave + 2);
          long dontget = (long)nokori * 4 + (long)x + (long)nokori + (long)x + (long)nokori * 4 + x;
          long getthis = (long)x + (long)nextruijou * (long)nokori + (long)x;
          if(dontget > getthis){
            ans += (long)x;
            nowhave++;
            check[j] = false;
          }
        }
      }
      int lasthave = (nowhave + 1) * (nowhave + 1);
      ans += (long)nums[0] * (long)lasthave;
      ans += (long)x;
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