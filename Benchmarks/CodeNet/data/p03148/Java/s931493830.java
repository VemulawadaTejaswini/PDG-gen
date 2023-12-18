import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    Sushi[] sushis = new Sushi[N];
    for (int i = 0; i < N; i++) sushis[i] = new Sushi(scanner.nextInt(), scanner.nextInt());

    Arrays.sort(sushis);
    reverse(sushis);

    HashSet<Integer> tset = new HashSet<>();
    boolean[] first = new boolean[N];
    for (int i = 0; i < N; i++) {
      if (!tset.contains(sushis[i].t)) {
        first[i] = true;
        tset.add(sushis[i].t);
      }
    }

    long sum = 0;
    long tt = 0;
    Stack<Sushi> stack = new Stack<>();
    for (int i = 0; i < K; i++) {
      sum += sushis[i].d;
      if (first[i]) {
        sum += tt * 2 + 1;
        tt++;
      } else {
        stack.push(sushis[i]);
      }
    }
    long max = sum;
    for (int i = K; i < N && !stack.isEmpty(); i++) {
      if (first[i]) {
        sum += sushis[i].d - stack.pop().d + tt * 2 + 1;
        max = Math.max(max, sum);
        tt++;
      }
    }
    System.out.println(max);
  }

  private static class Sushi implements Comparable<Sushi> {
    public final int t;
    public final int d;

    private Sushi(int t, int d) {
      this.t = t;
      this.d = d;
    }

    @Override public int compareTo(Sushi sushi) {
      return this.d - sushi.d;
    }
  }

  private static void reverse(Sushi[] list) {
    int i = 0;
    int j = list.length - 1;
    while (i < j) {
      Sushi tmp = list[i];
      list[i] = list[j];
      list[j] = tmp;
      i++;
      j--;
    }
  }
}
