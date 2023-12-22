import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
 
public class Main {
  private static String marks = "SHCD";
 
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    Card[] cards = new Card[count];
    for (int n = 0; n < count; n++) {
      cards[n] = new Card(br.readLine());
    }
    Arrays.sort(cards, new DataComparator());

    int c = 0;
    for (int mark = 0; mark < 4; mark++) {
      for (int num = 1; num < 14; num++) {
        if (cards[c].toString().equals(marks.charAt(mark) + " " + num)){
          c++;
        } else {
          System.out.println(cards[c]);
        }
      }
    }
  }
 
  private static class Card {
    String mark;
    int num;

    Card(String str) {
      mark = str.split(" ")[0];
      num = Integer.parseInt(str.split(" ")[1]);
    }
 
    public String bySort(){
      return marks.indexOf(mark) + " " + (num < 10 ? ("0" + num) : num);
    }

    @Override
    public String toString(){
      return mark + " " + num;
    }
  }

  private static class DataComparator implements Comparator<Card>{
    @Override
    public int compare(Card c1, Card c2) {
        return c1.bySort().compareTo(c2.bySort());
    }
  }
}