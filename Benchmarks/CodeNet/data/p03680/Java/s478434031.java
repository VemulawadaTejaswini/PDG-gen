import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N+1];
    for (int i = 1; i <= N; i++) {
      a[i] = sc.nextInt();
    }
    int count = 0;
    int i = 1;
    while (i != 2 && a[i] != 0) {
      int next = a[i];
      a[i] = 0;
      i = next;
      count++;
    }
    System.out.println(i == 2 ? count : -1);
  }
}