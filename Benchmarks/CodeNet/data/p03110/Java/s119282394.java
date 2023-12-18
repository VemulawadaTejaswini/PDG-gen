import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    double sum = 0;
    for (int i = 0; i < N; i++) {
      double x = sc.nextDouble();
      String s = sc.next();
      if (s.equals("JPY")) sum += x;
      else sum += x * 380000.0;
    }
    System.out.println(sum);
  }
}
