import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      arr[i] = num;
    }

    Arrays.sort(arr);
    int max = arr[arr.length - 1];
    int pair = max / 2;
    int diff = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      int temp = arr[i];
      int min = Math.min(Math.abs(pair - temp), Math.abs(pair - max + temp));
      if (diff > min) {
        pair = temp;
        diff = min;
      }
    }
    System.out.println(max + " " + pair);
  }
}
