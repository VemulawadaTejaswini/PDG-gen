import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int people = 0;
    for (int i = 0; i < number; i++) {
      int first = sc.nextInt();
      int last = sc.nextInt();
      int member = last - first + 1;
      people += member;
    }
    System.out.println(people);
  }
}