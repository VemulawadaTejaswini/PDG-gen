import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String squares = sc.next();
    squares = squares.replace("0", "");
    System.out.println(squares.length());
  }
}