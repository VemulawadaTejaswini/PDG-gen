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

    int[] as = new int[n/2];
    int[] bs = new int[n/2];

    for(int i = 0; i < n/2; i++){
      as[i] = sc.nextInt();
      bs[i] = sc.nextInt();
    }

    Arrays.sort(as);
    Arrays.sort(bs);

    int maxa = 1;
    int maxnum = 0;
    int count = 1;
    for(int i = 0; i < n/2 - 1; i++){
      if(as[i] == as[i+1]){
        count++;
        if(maxa < count){
          maxa = count;
          maxnum = as[i+1];
        }
      }else{
        count = 1;
      }
    }

    int seconda = 0;
    int secondmaxa = 0;

    count = 1;
    if(as[0] != maxnum){
      seconda = 1;
    }

    for(int i = 0; i < n/2 - 1; i++){
      if(as[i] == as[i+1] && as[i] != maxnum){
        count++;
        if(seconda < count){
          seconda = count;
          secondmaxa = as[i+1];
        }
      }else if(as[i + 1] != maxnum && seconda == 0){
        seconda = 1;
      }else{
        count = 1;
      }
    }



    int maxb = 1;
    int maxnumb = 0;
    count = 1;
    for(int i = 0; i < n/2 - 1; i++){
      if(bs[i] == bs[i+1]){
        count++;
        if(maxb < count){
          maxb = count;
          maxnumb = bs[i+1];
        }
      }else{
        count = 1;
      }
    }

    int secondb = 0;
    int secondmaxb = 0;

    count = 1;
    if(bs[0] != maxnumb){
      secondb = 1;
    }

    for(int i = 0; i < n/2 - 1; i++){
      if(bs[i] == bs[i+1] && bs[i] != maxnumb){
        count++;
        if(secondb < count){
          secondb = count;
          secondmaxb = bs[i+1];
        }
      }else if(bs[i + 1] != maxnumb && secondb == 0){
        secondb = 1;
      }else{
        count = 1;
      }
    }



    if(maxnum != maxnumb){
      System.out.println(n - maxa - maxb);
    }else{
      if(maxa > maxb){
        System.out.println(n - maxa - secondb);
      }else{
        System.out.println(n - maxb - seconda);        
      }
    }
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