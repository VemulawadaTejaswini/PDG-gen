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
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
      nums[i] = sc.nextInt();
    }

    int nowg, count;
    Random rnd = new Random();
    LinkedList<Integer> queue = new LinkedList<Integer>();
    int sizelimit;
    if(n >= 100){
      sizelimit = 99;
    }else{
      sizelimit = n;
    }

    while(true){
      for(int i = 0; i < n; i++){
        a[i] = nums[i];
      }
      queue.clear();
      nowg = rnd.nextInt(sizelimit) + 1;
      while(nowg > 0){
        queue.offer(nowg);
        nowg = rnd.nextInt(nowg);
      }
      count = 0;

      for(int ind = 0; ind < queue.size(); ind++){
        int g = queue.get(ind);
        for(int i = g; i < n; i++){
          int v = a[i];
          int j = i - g;
          while(j >= 0 && a[j] > v){
            a[j+g] = a[j];
            j -= g;
            count++;
          }
          a[j+g] = v;
        }
      }

      boolean sortcheck = true;
      for(int i = 0; i < n-1; i++){
        if(a[i] > a[i+1]){
          sortcheck = false; break;
        }
      }
      if(sortcheck && count <= Math.ceil(Math.pow((double)n, 1.5))){
        for(int i = 0; i < n; i++){
          nums[i] = a[i];
        }
        break;
      }
    }

    System.out.println(queue.size());
    for(int i = 0; i < queue.size()-1; i++){
      System.out.print(queue.get(i));
      System.out.print(" ");
    }
    System.out.println(queue.get(queue.size()-1));
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