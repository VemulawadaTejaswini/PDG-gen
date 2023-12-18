import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] points = new int[5];
    int distance = 0;

    for (int i = 0; i < points.length; i++) {
      points[i] = sc.nextInt();
    }
    int upper = sc.nextInt();

    if ((points[0] - points[4]) > upper) {
      System.out.println(":(");
    } else {
      System.out.println("Yay!");
    }
  }
}