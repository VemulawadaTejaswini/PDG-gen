import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder output = new StringBuilder();
    String crlf = System.getProperty("line.separator");
    
    String cards;
    int count, shuffle;
    
    while (in.hasNext()) {
      cards = in.next();
      if (cards.equals("-")) break;
      count = in.nextInt();
      
      for (int i = 0; i < count; i++) {
        shuffle = in.nextInt();
        cards = shuffle(cards, shuffle);
      }
      System.out.println(cards);
    }
  }
  public static String shuffle(String cards, int shuffle) {
    StringBuilder output = new StringBuilder();
    String first = cards.substring(0, shuffle);
    String last = cards.substring(shuffle, cards.length());
    cards = output.append(last).append(first).toString();
    return cards;
  }
}