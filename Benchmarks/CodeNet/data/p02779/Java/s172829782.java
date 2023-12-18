import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    boolean ans = true;

    for (int i = 0 ; i < n ; i++ ) {
      a[i] = sc.nextInt();
    }

    Arrays.sort(a);

    for (int i = 0 ; i < n-1 ; i++ ) {
      if (a[i] == a[i+1]) {
        ans = false;
        break;
      } else {
        ans = true;
        continue;
      }
    }

    if (ans == false) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}
