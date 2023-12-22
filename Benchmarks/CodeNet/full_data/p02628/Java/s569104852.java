import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer n = sc.nextInt();
    Integer k = sc.nextInt();
    ArrayList<Integer> ps = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      ps.add(sc.nextInt());
    }
    Collections.sort(ps);
    Integer res = 0;
    for (int i=0;i<k;i++){
      res += ps.get(i);
    }

    System.out.println(res);
  }
}
