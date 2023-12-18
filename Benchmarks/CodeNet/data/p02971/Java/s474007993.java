import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int max = 0;

    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        if(i == j) continue;
        max = Math.max(max,a[j]);
      }
      System.out.println(max);
      max = 0;
    }
  }

}
