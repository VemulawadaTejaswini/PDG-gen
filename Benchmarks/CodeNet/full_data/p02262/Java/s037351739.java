import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;

 
public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i = 0; i < n; i++){
      nums[i] = sc.nextInt();
    }

    int[] sorted = new int[n];

    int count = 0;
    Random rnd = new Random();
    
    int m;
    int[] gss = new int[n];
    while(true){
      for(int i = 0; i < n; i++){
        sorted[i] = nums[i];
      }
      count = 0;

      if(n > 1){
        m = rnd.nextInt(n-1) + 1;
      }else{
        m = 1;
      }
      int[] gs = new int[m];
      for(int i = 0; i < m; i++){
        gs[i] = i+1;
      }

      for(int i = m-1; i >= 0; i--){
        int nowg = gs[i];
        for(int j = nowg; j < n; j++){
          int v = sorted[j];
          int k = j - nowg;
          while(k >= 0 && sorted[k] > v){
            sorted[k+nowg] = sorted[k];
            k -= nowg;
            count++;
          }
          sorted[k+nowg] = v;
        }
      }
      if(count <= Math.ceil(Math.pow((double)n, 1.5))){
        for(int i = 0; i < m; i++){
          gss[i] = gs[i];
        }
        for(int i = 0; i < n; i++){
          nums[i] = sorted[i];
        }
        break;
      }
    }



    System.out.println(m);
    for(int i = m-1; i > 0; i--){
      System.out.print(gss[i]);
      System.out.print(" ");
    }
    System.out.println(gss[0]);
    System.out.println(count);
    for(int i = 0; i < n; i++){
      System.out.println(nums[i]);
    }
  }
 
  
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