import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int r = sc.nextInt();

    // 2×半径×円周率
    double circle = 2 * r * Math.PI;
    System.out.println(circle);

    sc.close();
  }
}
