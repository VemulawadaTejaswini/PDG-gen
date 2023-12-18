import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 累積和
    int n = sc.nextInt();
    int[] w = new int[n];
    int[] data = new int[n+1];
    int min = 100;

    for (int i = 0; i < n; i++) {
      w[i] = sc.nextInt();
    }

    for (int i = 1; i < n+1; i++) {
      data[i] = data[i-1] + w[i-1];
    }

    // for (int i = 0; i < n+1; i++) {
    //   System.out.println(data[i]);
    // }

    for (int i = 0; i < n+1; i++) {
      int s1 = data[i];
      int s2 = data[n] - data[i];
      // System.out.println(s1+"    "+s2);
      int abs = Math.abs(s1-s2);
      min = Math.min(min,abs);
    }

    System.out.println(min);
  }

}
