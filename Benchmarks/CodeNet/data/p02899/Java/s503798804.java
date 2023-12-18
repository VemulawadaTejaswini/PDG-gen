import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] member = new int[n];
    for(int i = 1; i <= n; i++) {
      member[Integer.parseInt(sc.next())-1] = i;
    }
    StringBuilder sb = new StringBuilder();
    sb.append(member[0]);
    for(int i = 1; i < n; i++) sb.append(" " + member[i]);
    System.out.println(sb.toString());
  }
}
