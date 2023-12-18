import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
 
class hen implements Comparable{
  int startpoint;
  int endpoint;
  int length;
 
  public int compareTo(Object other){
    hen otherhen = (hen)other;
    return length - otherhen.length;
  }
} 
 
public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[][] hens = new int[n][n];
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        hens[i][j] = 0;
      }
    }

    hen[] es = new hen[m];
    for(int i = 0; i < m; i++){
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      int c = sc.nextInt();
      hen newhen = new hen();
      newhen.startpoint = a;
      newhen.endpoint = b;
      newhen.length = c;
      es[i] = newhen;
    }
    Arrays.sort(es);

    boolean[] check = new boolean[n];
    for(int i = 0; i < n; i++){
      check[i] = false;
    }
    int count = 0;

    int nowindex = 0;

    for(nowindex = 0; nowindex < m; nowindex++){
      int start = es[nowindex].startpoint;
      int end = es[nowindex].endpoint;
      int len = es[nowindex].length;
      if(!check[start]){
        check[start] = true;
        count++;
      }
      if(!check[end]){
        check[end] = true;
        count++;
      }
      hens[start][end] = len;
      hens[end][start] = len;
      if(count == n){
        nowindex++;
        break;
      }
    }//これで一旦全部の点がカバーされた

    //System.out.println(nowindex);

    int answer = 0;

    //ここからは、各辺が結ぶ2点が最短距離になるかを確認していく作業
    for(; nowindex < m; nowindex++){
      boolean[] reached = new boolean[n];
      for(int i = 0; i < n; i++){
        reached[i] = false;
      }
      int nowstart = es[nowindex].startpoint;
      int nowend = es[nowindex].endpoint;
      int nowlen = es[nowindex].length;
      reached[nowstart] = true;
      LinkedList<Integer> pointqueue = new LinkedList<Integer>();
      LinkedList<Integer> lengthqueue = new LinkedList<Integer>();
      pointqueue.addLast(nowstart);
      lengthqueue.addLast(0);

      while(!pointqueue.isEmpty()){
        int thispoint = pointqueue.pollFirst();
        int thislength = lengthqueue.pollFirst();
        for(int i = 0; i < n; i++){
          if(hens[thispoint][i] > 0 && !reached[i]){
            reached[i] = true;
            pointqueue.addLast(i);
            lengthqueue.addLast(thislength + hens[thispoint][i]);

            if(i == nowend){
              if(thislength + hens[thispoint][i] > nowlen){
                hens[nowstart][nowend] = nowlen;
                hens[nowend][nowstart] = nowlen;
              }else{
                answer++;
              }
              break;
            }
          }
        }
      }
      if(!reached[nowend]){
        hens[nowstart][nowend] = nowlen;
        hens[nowend][nowstart] = nowlen;
        reached[nowend] = true;
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