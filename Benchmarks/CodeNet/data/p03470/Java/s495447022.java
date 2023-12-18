import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new java.util.Scanner(System.in);
    int N =Integer.parseInt(sc.nextLine());
    List<Integer> omochi = new ArrayList<>();
    List<Integer> omochi2 = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      omochi.add(Integer.parseInt(sc.nextLine()));
    }
    Collections.sort(omochi);
    for (int n = 0; n < N; n++) {
      if (n > 0) {
        if (omochi.get(n - 1) != omochi.get(n)) {
          omochi2.add(omochi.get(n));
        }
      } else {
        omochi2.add(omochi.get(n));
      }
    }
    System.out.println(omochi2.size());
  }
}
