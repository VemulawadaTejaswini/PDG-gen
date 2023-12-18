import java.util.*;
 
public class Main {
  private static String solve(int in) {
    while (in > 0) {
      if(in % 10 == 7)
        return "YES";
      in = in / 10;
    }
    return "NO";
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int in = sc.nextInt();
    sc.close();
    System.out.print(solve(in));
  }
}
