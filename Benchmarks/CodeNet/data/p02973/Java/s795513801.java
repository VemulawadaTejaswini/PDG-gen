import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
  private static void solve(int n, int[] a) {
    List<ArrayList<Integer>> colors = new ArrayList<ArrayList<Integer>>();
    for (int val : a) {
      boolean found = false;
      for (int i = 0; i < colors.size(); i++) {
        List<Integer> color = colors.get(i);
        int last = color.get(color.size() - 1);
        if (last < val) {
          found = true;
          color.add(val);
          break;
        }
      }
      if (!found) {
        ArrayList<Integer> newColor = new ArrayList<>();
        newColor.add(val);
        colors.add(newColor);
      }
    }
    System.out.println(colors.size());
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