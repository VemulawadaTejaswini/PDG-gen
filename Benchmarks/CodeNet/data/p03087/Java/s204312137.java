import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    int[] rui = new int[n + 1];
    for(int i = 0; i < n - 1; i++) {
      rui[i + 1] = rui[i];
      if((s.charAt(i) == 'A') && (s.charAt(i + 1) == 'C')) rui[i + 1] = rui[i] + 1;
    }
    for(int i = 0; i < q; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      System.out.println(rui[r - 1] - rui[l - 1]);
    }
  }
}