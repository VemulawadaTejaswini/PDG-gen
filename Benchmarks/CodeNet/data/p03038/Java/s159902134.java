import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    sc.nextLine();
    String line = sc.nextLine();
    Queue<Card> queue = new PriorityQueue<>();
    for (String s : line.split(" ")) {
      queue.add(new Card(Integer.parseInt(s), 1));
    }
    for (int i = 0; i < m; i++) {
      int b = sc.nextInt();
      int c = sc.nextInt();
      queue.add(new Card(c, b));
    }
    long sum = 0;
    int capacity = n;
    while (queue.size() != 0 && capacity > 0) {
      Card card = queue.poll();
      int num = card.num;
      if (num > capacity) num = capacity;
      sum += (long) card.no * (long) num;
      capacity -= num;
    }
    System.out.println(sum);
  }

  public static class Card implements Comparable<Card> {
    public final int no;
    public final int num;
    public Card(int no, int num) {
      this.no = no;
      this.num = num;
    }
    @Override
    public int compareTo(Card card) {
      return card.no - this.no;
    }
    @Override
    public String toString() {
      return String.format("No: [%d], Num: [%d]", no, num);
    }
  }
}