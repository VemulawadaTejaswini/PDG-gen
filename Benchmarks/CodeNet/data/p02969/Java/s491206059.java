import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0, end = sc.nextInt(); i < end; i++)
      list.add(sc.nextInt());
    List<Integer> sub;
    for (int i = 0; i < list.size(); i++) {
      sub = new ArrayList<Integer>(list);
      sub.remove(i);
      System.out.println(Collections.max(sub));
    }
  }
}