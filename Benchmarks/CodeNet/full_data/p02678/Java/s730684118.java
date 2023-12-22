import java.util.*;

public class Main {
  static int m;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    m = sc.nextInt();
    Road roads[] = new Road[m];
    int res[] = new int[n];
    Arrays.fill(res, -1);
    for (int i = 0; i < m; i++) {
      roads[i] = new Road(sc.nextInt(), sc.nextInt());
    }
    point(1, roads, res);
    for (int i = 1; i < n; i ++) {
      if (res[i] == -1) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
    for (int i = 1; i < n; i++)  {
      System.out.println(res[i]);
    }
    sc.close();
  }

  static void point(int to, Road roads[], int array[]) {
    ArrayList<Integer> nexts = new ArrayList<>();
    for (int i = 0; i < m; i ++) {
      if (roads[i].a == to && array[roads[i].b-1] == -1 && roads[i].b != 1) {
        array[roads[i].b-1] = to;
        nexts.add(roads[i].b);
      } 
      if (roads[i].b == i && array[roads[i].a-1] == -1 && roads[i].a != 1) {
        array[roads[i].a-1] = i;
        nexts.add(roads[i].a);
      }
    }
    for (int e: nexts) {
      point(e, roads, array);
    }
  }

  static class Road {
    int a, b;
    Road (int a, int b) {
      this.a = a;
      this.b = b;
    }
  }
}