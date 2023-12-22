import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

class card implements Comparable{
  private char mark;
  private int number;

  public void markset(char thismark){
    mark = thismark;
  }
  public void numset(int thisnum){
    number = thisnum;
  }
  public char retmark(){
    return mark;
  }
  public int retnum(){
    return number;
  }

  public int compareTo(Object other){
    card othercard = (card)other;
    return number - othercard.retnum();
  }

  public void printcard(){
    System.out.print(mark);
    System.out.print(" ");
    System.out.println(number);    
  }

}

class cardwithind implements Comparable{
  private char mark;
  private int number;
  private int index;

  public void markset(char thismark){
    mark = thismark;
  }
  public void numset(int thisnum){
    number = thisnum;
  }
  public void indset(int thisind){
    index = thisind;
  }
  public char retmark(){
    return mark;
  }
  public int retnum(){
    return number;
  }
  public int retind(){
    return index;
  }

  public int compareTo(Object other){
    cardwithind othercard = (cardwithind)other;
    if(number != othercard.retnum()){
      return number - othercard.retnum();      
    }
    return index - othercard.retind();
  }

}

 
public class Main {
  private static int partition(card[] cardArray, int left, int right){
    card x = cardArray[right];
    int i = left - 1;
    for(int j = left; j < right; j++){
      if(cardArray[j].compareTo(x) <= 0){
        i++;
        card keep = cardArray[i];
        cardArray[i] = cardArray[j];
        cardArray[j] = keep;
      }
    }
    card keep2 = cardArray[i+1];
    cardArray[i+1] = cardArray[right];
    cardArray[right] = keep2;
    return i+1;
  }

  private static void quicksort(card[] cardArray, int left, int right){
    if(left < right){
      int q = partition(cardArray, left, right);
      quicksort(cardArray, left, q-1);
      quicksort(cardArray, q+1, right);
    }
  }

  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    int n = sc.nextInt();
    card[] cards = new card[n];
    cardwithind[] cardswithind = new cardwithind[n];
    for(int i = 0; i < n; i++){
      char ch = sc.nextChar();
      int num = sc.nextInt();
      card newcard = new card();
      cardwithind newcardwithind = new cardwithind();
      newcard.markset(ch);
      newcard.numset(num);
      newcardwithind.markset(ch);
      newcardwithind.numset(num);
      newcardwithind.indset(i);
      cards[i] = newcard;
      cardswithind[i] = newcardwithind;
    }
    Arrays.sort(cardswithind);
    quicksort(cards, 0, n-1);
    boolean stablecheck = true;
    for(int i = 0; i < n; i++){
      if(cardswithind[i].retmark() != cards[i].retmark() || cardswithind[i].retnum() != cards[i].retnum()){
        stablecheck = false;
        break;
      }
    }
    System.out.println(stablecheck? "Stable" : "Not stable");
    for(int i = 0; i < n; i++){
      cards[i].printcard();
    }
  }
 
//nextChar を追加したよ！これをテンプレとして保存しよう！

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