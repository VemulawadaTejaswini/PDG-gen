import java.util.*;

public class Main {
  public static void main(String[] srgs) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] edge = new int[n];
    for(int i = 0; i < n; i++) edge[i] = Integer.parseInt(sc.next());
    Arrays.sort(edge);
    long area = 0;
    long temp = 0;
    boolean flag = false;
    for(int i = n - 1; i > 0; i--) {
      if(!flag && edge[i] == edge[i - 1]) {
        temp = edge[i];
        edge[i - 1] = -1;
        flag =true;
      } else if(flag && edge[i] == edge[i - 1]) {
        area = temp * edge[i];
      }
    }
    System.out.println(area);
  }
}
