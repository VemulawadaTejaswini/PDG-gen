import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    List<Pair> l = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        l.add(new Pair(i+1, sc.nextInt()));
    }

    Collections.sort(l, (Pair p, Pair q) -> p.b - q.b);

    StringBuffer sb = new StringBuffer();
    for (Pair x : l) sb.append(x.a + " ");

    System.out.println(sb.toString().trim());
  }
}

class Pair {
  public int a;
  public int b;

  public Pair(int a, int b) {
    this.a = a;
    this.b = b;
  }
}