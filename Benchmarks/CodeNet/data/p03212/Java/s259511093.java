import java.util.*;

public class Main {

  static int N;
  static int count;

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    sc.close();

    count = 0;

    System.out.println(dfs(0));

  }

  public static int dfs(long x){

    if (100 < x && x <= N) {
      String s = String.valueOf(x);
      if (s.indexOf("3") != -1) {
        if (s.indexOf("5") != -1) {
          if (s.indexOf("7") != -1) {
            count++;
          }
        }
      }
    } else if (N < x){
      return count;
    }

    if (x <= 1000000000) {
      dfs(10 * x + 3);
      dfs(10 * x + 5);
      dfs(10 * x + 7);
    }

    return count;
    
  }

}