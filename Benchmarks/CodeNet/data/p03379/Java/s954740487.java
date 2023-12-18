import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();

    int[] arr = new int[n];
    int[] sorted = new int[n];

    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      arr[i] = num;
      sorted[i] = num;
    }

    Arrays.sort(sorted);
    int upper = n / 2;
    int lower = n / 2 - 1;
    double median = (sorted[upper] + sorted[lower]) / 2.0;
    for (int i = 0; i < n; i++) {
      int removed = arr[i];
      if (removed < median) {
        System.out.println(sorted[upper]);
      } else {
        System.out.println(sorted[lower]);
      }
    }
  }
}
