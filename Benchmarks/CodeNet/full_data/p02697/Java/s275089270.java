import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); int m = sc.nextInt();
    int middle = n/2;
    for (int i = 0; i < m; i++) {
      System.out.println(middle-i + " " + (middle+i+1));
    }
    sc.close();
  }
}