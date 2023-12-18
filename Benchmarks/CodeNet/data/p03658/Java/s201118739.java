import java.util.*;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws Exception {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int sum = 0;
  int[] arr = new int[n];
  for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
  }
  int count = 0;
  for (int i = arr.length - 1; count < n; i--) {
    sum += arr[i];
    count++;
  }

  System.out.println(sum);
  }
}
