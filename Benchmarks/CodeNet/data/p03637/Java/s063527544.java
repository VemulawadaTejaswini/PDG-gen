
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int count4 = 0;
    int count2 = 0;
    for (int i = 0; i < n; i++) {
      int num = sc.nextInt();
      if (num % 4 == 0) count4++;
      else if (num % 2 == 0) count2++;
    }
    if ((n / 2) <= count4) System.out.println("Yes");
    else if ((n / 2) - count4 <= (count2 / 2)) System.out.println("Yes");
    else System.out.println("No");
  }
}
