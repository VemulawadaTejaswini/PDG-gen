import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] a = new int[m][2];
    for(int i = 0; i < m; i++) {
      a[i][0] = sc.nextInt();
      a[i][1] = sc.nextInt();
    }
    Arrays.sort(a, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return Integer.compare(o1[1], o2[1]);
      }
    });
    int ans = 0;
    int x = 0;
    for(int i = 0; i < m; i++) {
      if(x < a[i][0]) {
        x = a[i][1] - 1;
        ans++;
      }
    }
    System.out.println(ans);
  }
}