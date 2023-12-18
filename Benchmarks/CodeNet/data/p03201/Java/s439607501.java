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
    int[] inp = new int[n+1];
    for(int i = 0; i < n; i++){
      inp[i] = sc.nextInt();
    }
    inp[n] = 1000000001;
    Arrays.sort(inp);

    int nanko = 0;
    for(int i = 0; i < n; i++){
      if(inp[i] != inp[i + 1]){
        nanko++;
      }
    }

    //数字が何種類あるかをカウントし、新たな配列を作る
    //そのため、一番でかい数字を自分で入れている


    int[] nums = new int[nanko];
    int[] counts = new int[nanko];

    int kugiri = -1;
    int nowindex = 0;

    for(int i = 0; i < n; i++){
      if(inp[i] != inp[i + 1]){
        nums[nowindex] = inp[i];
        counts[nowindex] = i - kugiri;
        nowindex++;
        kugiri = i;
      }
    } 



    int ans = 0;

    for(int i = nanko - 1; i >= 0; i--){
      if(counts[i] == 0){
        continue;
      }else{

        int targetpower = 1;
        while(nums[i] >= targetpower){
          targetpower *= 2;
        }

        int targetind = Arrays.binarySearch(nums, targetpower - nums[i]);
        if(targetind >= 0){
          if(targetind == i && counts[i] >= 2){
            counts[i] -= 2;
            ans++;
            i++;
          }else if(targetind != i && counts[targetind] > 0){
            counts[i]--;
            counts[targetind]--;
            ans++;
            i++;
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