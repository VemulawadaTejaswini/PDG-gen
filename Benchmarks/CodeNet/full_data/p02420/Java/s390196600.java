import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String card;
    while (!(card = reader.next()).equals("-")) {
      int n = reader.nextInt();
      for (int i = 0; i < n; i++) {
        int m = reader.nextInt();
        String card1 = card.substring(0, m);
        String card2 = card.substring(m, card.length());
        card = card2 + card1;
      }
      System.out.println(card);
    }
  }
}