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
 
 
		int height = sc.nextInt();
    int width = sc.nextInt();
    String[] strs = new String[height];
    for(int i = 0; i < height; i++){
      strs[i] = sc.nextStr();
    }
    boolean[][] grid = new boolean[height+2][width+2];
    for(int i = 0; i <= height+1; i++){
      for(int j = 0; j <= width+1; j++){
        if(i*j == 0 || i == height+1 || j == width+1){
          grid[i][j] = false;
        }else if(strs[i-1].charAt(j-1) == '.'){
          grid[i][j] = true;
        }else{
          grid[i][j] = false;
        }
      }
    }
//オッケーなマスはtrue、壁＆障害物はfalse

    int[][] tate = new int[height+2][width+2];
    int[][] yoko = new int[height+2][width+2];
    for(int i = 0; i <= height+1; i++){
      for(int j = 0; j <= width+1; j++){
        tate[i][j] = 0;
        yoko[i][j] = 0;
      }
    }

    for(int i = 0; i <= height+1; i++){
      int counter = 0;
      for(int j = 0; j <= width+1; j++){
        if(grid[i][j]){
          counter++;
          tate[i][j] = counter; 
        }else{
          counter = 0;
        }
      }
      for(int j = width+1; j >= 0; j--){
        if(grid[i][j]){
          if(counter == 0){
            counter = tate[i][j];
          }
          tate[i][j] = counter;
        }else{
          counter = 0;
        }
      }
    }

    for(int j = 0; j <= width+1; j++){
      int counter = 0;
      for(int i = 0; i <= height+1; i++){
        if(grid[i][j]){
          counter++;
          yoko[i][j] = counter;
        }else{
          counter = 0;
        } 
      }
      for(int i = height+1; i >= 0; i--){
        if(grid[i][j]){
          if(counter == 0){
            counter = yoko[i][j];
          }
          yoko[i][j] = counter;
        }else{
          counter = 0;
        }
      }
    }

    int answer = 0;
    for(int i = 0; i <= height+1; i++){
      for(int j = 0; j <= width+1; j++){
        if(tate[i][j] + yoko[i][j] - 1 > answer){
          answer = tate[i][j] + yoko[i][j] - 1;
        }
      }
    }

    System.out.println(answer);
 
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