import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long L = sc.nextLong();
    long[] a = new long[n];
    long sum = 0;
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      sum += a[i];
    }
    String anss = "Possible";
    int left = 0;
    int right = n - 1;
    int[] ans = new int[n - 1];
    for(int i = 0; i < n - 1; i++) {
      if(sum >= L) {
        if(a[left] >= a[right]) {
          ans[i] = right;
          sum -= a[right];
          right--;
        } else {
          ans[i] = left + 1;
          sum -= a[left];
          left++;
        }
      } else {
        anss = "Impossible";
        break;
      }
    }
    System.out.println(anss);
    if(anss.equals("Possible")) {
      for(int i = 0; i < n - 1; i++) {
        System.out.println(ans[i]);
      }
    } else {
    }
  }
}