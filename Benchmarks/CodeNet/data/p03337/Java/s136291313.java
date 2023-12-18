import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    SortedSet<Integer> set = new TreeSet<>((i1, i2) -> i2 - i1);
    set.add(a + b);
    set.add(a - b);
    set.add(a * b);
    System.out.println(set.first());
  }
}