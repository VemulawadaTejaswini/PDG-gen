import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i = 1;
    for (int j = 1; j <= 5; j++) {
      if (input.nextInt() == 0) i = j;
    }
    System.out.println(i);
  }
}