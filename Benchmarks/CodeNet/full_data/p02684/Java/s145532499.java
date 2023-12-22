import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    long k = scan.nextLong();

    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = scan.nextInt();
    }

    ArrayList<Integer> route = new ArrayList<Integer>();
    List<Integer> path = new ArrayList<Integer>();
    route.add(0);

    int begin = 0;
    int next = 0;

    while (true) {
      next = a[next] - 1;
      if (route.contains(next)) {
        begin = route.indexOf(next);
        path = route.subList(begin, route.size());
        break;
      }
      route.add(next);
    }

    int r = (int) ((k - begin) % path.size());

    System.out.println(path.get(r) + 1);

  }

}