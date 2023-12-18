import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int[] a = new int[1000000];
    int n = 1;
    a[n] = s;

    Map<Integer, Integer> map = new HashMap<>();
    map.put(a[n],n);

    while (n > 0) {
      n++;

      if (a[n-1]%2 == 0) {
        a[n] = a[n-1] / 2;
      } else if (a[n-1]%2 != 0) {
        a[n] = 3 * a[n-1] + 1;
      }

      if (map.containsKey(a[n])) {
        System.out.println(n);
        break;
      } else {
        map.put(a[n],n);
      }
    }


  }

}
