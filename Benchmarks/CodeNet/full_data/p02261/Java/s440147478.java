import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Card {
  String suit;
  int value;
  int storedNo;

  public Card( String suit, int value, int storedNo ) {
    this.suit  = suit;
    this.value = value;
    this.storedNo = storedNo;
  }
  public Card( Card card ) {
    this(card.suit, card.value, card.storedNo);
  }

  @Override
  public String toString() {
    return suit + String.valueOf(value);
  }
}

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      Card[][] cards = new Card[2][n];
      String[] line = br.readLine().split(" ");
      for (int i=0; i < n; i++) {
        cards[0][i] = new Card(
          line[i].substring(0, 1),
          Integer.parseInt(line[i].substring(1)),
          i );
        cards[1][i] = new Card(cards[0][i]);
      }

      bubbleSort(cards[0], n);
      dispIntArray(cards[0]);
      System.out.println(isStableSorted(cards[0], n) ? "Stable" : "Not stable");
      selectionSort(cards[1], n);
      dispIntArray(cards[1]);
      System.out.println(isStableSorted(cards[2], n) ? "Stable" : "Not stable");
    }
  }

  static int bubbleSort(Card[] a, int n) {
    int count=0;
    Card t;

    for(int i=0,f=1; f==1 || i<n; i++ ) {
      f=0;
      for(int j=n-1; j>0; j-- ) {
        if( a[j].value < a[j-1].value) {
          t = a[j]; a[j] = a[j-1]; a[j-1] = t;
          count++;
          f=1;
        }
      }
    }

    return count;
  }

  static int selectionSort(Card a[], int n) {
    int count = 0;
    Card t;

    for(int i=0,min; i<n-1; i++ ) {
      min = i;
      for(int j=i+1; j<n; j++ ) {
        if( a[min].value > a[j].value) min = j;
      }
      if( min != i ) {
        t = a[i]; a[i] = a[min]; a[min] = t;
        count++;
      }
    }

    return count;
  }

  static boolean isStableSorted(Card[] sorted, int n) {
    boolean ret = true;

    for (int i=0, max=n-1; i < max; i++) {
      if( sorted[i].value == sorted[i+1].value
        && sorted[i].storedNo > sorted[i+1].storedNo )
        ret = false;
    }

    return ret;
  }

  public static void dispIntArray(Card[] a) {
    StringBuilder s = new StringBuilder();

    for (Card c : a) { s.append(c.toString()).append(" "); }
    s.setLength(s.length()-1);

    System.out.println(s);
  }
}
