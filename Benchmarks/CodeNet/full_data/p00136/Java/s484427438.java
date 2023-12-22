import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] fd = new int[6];
    for (int i = 0; i < n; i++) {
      double d = sc.nextDouble();
      int l;
      if (d < 165) {
        l = 0;
      } else if (d < 170) {
        l = 1;
      } else if (d < 175) {
        l = 2;
      } else if (d < 180) {
        l = 3;
      } else if (d < 185) {
        l = 4;
      } else {
        l = 5;
      }
      fd[l]++;
    }
    for (int z = 0; z < 6; z++) {
      System.out.print(z+1+":");
      for (int i = 0; i < fd[z]; i++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}