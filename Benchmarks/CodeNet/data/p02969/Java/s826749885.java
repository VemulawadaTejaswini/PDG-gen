import java.util.*;

public class Main {
  public static void main(String[] args) {
    int r;
    try(Scanner sc = new Scanner(System.in)) {
      r = sc.nextInt();
    }
    int answer = 3 * r * r;
    System.out.println(answer);
  }
}