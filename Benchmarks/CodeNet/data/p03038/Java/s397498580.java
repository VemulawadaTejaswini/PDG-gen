
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);
    int n = cin.nextInt();
    int m = cin.nextInt();
    PriorityQueue<Integer> card = new PriorityQueue();
    for (int i = 0; i < n; i++) {
      card.add(cin.nextInt());
    }
    for (int i = 0; i < m; i++) {
      int b = cin.nextInt();
      int c = cin.nextInt();
      for (int j = 0; j < b; j++) {
        if (card.peek() < c) {
          card.poll();
          card.add(c);
        }
        else
          break;
      }
    }
    long res = 0;
    for (int i : card)
      res += i;
    System.out.println(res);

  }

}