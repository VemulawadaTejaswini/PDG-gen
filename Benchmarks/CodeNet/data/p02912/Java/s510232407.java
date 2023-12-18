import java.util.Scanner;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    Queue<Integer> items = new PriorityQueue<Integer>(Collections.reverseOrder());
    for (int i = 0; i < N; i++)
      items.add(sc.nextInt());
    while (M > 0) {
      items.add(items.poll() / 2);
      M--;
    }
    long sum = 0;
    for (int item : items)
      sum += item;
    System.out.println(sum);
  }
}