import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int res[] = new int[n-1];
    Arrays.fill(res, 0);
    ArrayList<Road> list = new ArrayList<>();
    for (int i = 1; i < n; i++) {
      for (int j = i+1; j <= n; j++) {
        list.add(new Road(i, j, j-i));
      }
    }
    for (Road e: list) {
      e.len = Math.min(e.len, Math.abs(x-e.st)+1+Math.abs(y-e.en));
      res[e.len-1]++;
    }
    for (int i = 0; i < n-1; i++) {
      System.out.println(res[i]);
    }
    sc.close();
  }

  static class Road {
    int st, en, len;
    Road (int st, int en, int len) {
      this.st = st; this.en = en; this.len = len;
    }
  }
}