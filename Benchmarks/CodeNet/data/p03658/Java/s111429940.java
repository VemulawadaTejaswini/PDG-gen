import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int total = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < N; i++) {
      list.add(sc.nextInt());
    }
    Collections.sort(list, Collections.reverseOrder());
    for (int i = 0; i < K; i++) {
      total += list.get(i);
    }
    System.out.println(total);
  }
}
