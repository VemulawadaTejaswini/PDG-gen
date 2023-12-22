import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

class inputinfo implements Comparable{
  int nums;
  int index;

  public int compareTo(Object other){
    inputinfo otherinfo = (inputinfo)other;
    if(nums != otherinfo.nums){
      return nums - otherinfo.nums;
    }else{
      return index - otherinfo.index;
    }
  }
}
 
public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    int n = sc.nextInt();
    int[] nums = new int[2000005];
    for(int i = 0; i < 2000005; i++){
      nums[i] = -1;
    }
    int nowleft = 2000005;
    int nowright = 2000004;
    TreeSet<inputinfo> lastinput = new TreeSet<inputinfo>();

    for(int zzz = 0; zzz < n; zzz++){
      String comm = sc.nextStr();
      if(comm.equals("insert")){
        nowleft--;
        int inpnum = sc.nextInt();
        inputinfo newnum = new inputinfo();
        newnum.nums = inpnum;
        newnum.index = nowleft;
        lastinput.add(newnum);
        nums[nowleft] = inpnum;
      }else if(comm.equals("delete")){
        int inpnum = sc.nextInt();
        inputinfo esa = new inputinfo();
        esa.nums = inpnum;
        esa.index = 0;
        int deleteind = lastinput.ceiling(esa).index;
        nums[deleteind] = -1;
        esa.index = deleteind;
        lastinput.remove(esa);
        while(true){
          if(nums[nowright] >= 0){
            break;
          }else{
            nowright--;
          }
        }
      }else if(comm.equals("deleteFirst")){
        while(true){
          if(nums[nowleft] >= 0){
            nums[nowleft] = -1;
            break;
          }else{
            nowleft++;
          }
          nowleft++;
        }
      }else if(comm.equals("deleteLast")){
        while(true){
          if(nums[nowright] >= 0){
            nums[nowright] = -1;
            nowright--;
            break;
          }else{
            nowright--;
          }
        }
        while(true){
          if(nums[nowright] >= 0){
            break;
          }else{
            nowright--;
          }
        }
      }else{
        System.out.println("Error!");
        break;
      }
    }

    for(int i = 0; i < nowright; i++){
      if(nums[i] >= 0){
        System.out.print(nums[i]);
        System.out.print(" ");
      }
    }
    System.out.println(nums[nowright]);
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