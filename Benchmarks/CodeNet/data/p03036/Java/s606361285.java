import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int r = sc.nextInt();
    int D = sc.nextInt();
    int X = sc.nextInt();

    sc.close();

    int[] x = new int[11];
    
    x[0] = X; 

    for (int i = 1; i < 11; i++) {
      x[i] = r * x[i-1] - D;
      System.out.println(x[i]);
    }

  }

}