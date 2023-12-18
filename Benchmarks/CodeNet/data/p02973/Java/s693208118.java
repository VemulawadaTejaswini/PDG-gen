import java.util.Scanner;

class Main {
  private static void solve(int n, int[] a) {
    int[] colors = new int[n];
    int color = 0;
    for (int i = 0; i < n; i++) {
      if (colors[i] > 0) {
        continue;
      }
      color += 1;
      colors[i] = color;
      int last = a[i];
      for (int j = i + 1; j < n; j++) {
        if (a[j] > last && colors[j] == 0) {
          colors[j] = color;
          last = a[j];
        }
      }
    }
    System.out.println(color);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.nextLine());
    }
    sc.close();
    solve(n, a);
  }
}