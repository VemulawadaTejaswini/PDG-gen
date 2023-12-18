import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[][] ta = new int[n][2];
    int t = 0;
    int a = 0;

    for (int[] x : ta) {
      while(x[0] >= t && x[1] >= a){
        x[0] *= 2;
        x[1] *= 2;
      }
      t = x[0];
      a = x[1];
    }

    System.out.println(t+a);
  }
}
