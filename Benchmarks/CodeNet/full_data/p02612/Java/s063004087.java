import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt() % 1000;
    System.out.println(a == 0 ? a : 1000 - a);
  }
}
