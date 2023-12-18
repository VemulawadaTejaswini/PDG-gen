import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if (N == 0) {
      System.out.println(0);
      return;
    }
    int M = sc.nextInt();
    List<Integer> items = new ArrayList<Integer>(N);
    for (int i = 0; i < N; i++)
      items.add(sc.nextInt());
    Collections.sort(items, Collections.reverseOrder());
    for (int i = 0; i < M; i++) {
      items.set(0, items.get(0) / 2);
      Collections.sort(items, Collections.reverseOrder());
    }
    long sum = 0;
    for (int item : items)
      sum += item;
    System.out.println(sum);
  }
}