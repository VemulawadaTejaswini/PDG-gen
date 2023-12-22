import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    double s = Math.PI * r * r;
    double l = 2 * Math.PI * r;
    System.out.println(s + " " + l);
  }
}

