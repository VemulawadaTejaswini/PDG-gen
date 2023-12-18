import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int max = 0;
    for (int i = 1; i * i <= X; i++) {
      if (i * i <= X) {
        max = i * i;
      }
    }
    System.out.println(max);
  }
}
