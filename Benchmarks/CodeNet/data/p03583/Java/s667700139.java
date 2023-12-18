import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Main {

  static final int MOD = 1000000007;

  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int a = 1; a <= 3500; a++) {
      for (int b = 1; b <= 3500; b++) {
        double num = (double) n * a * b / (4* a * b - n * b - n * a);
        // if(num<0)break;
        // System.out.println(a + " " + b + " " + num);
        if (num > 0 && Math.abs(num - Math.round(num)) < 0.00001) {
          System.out.println(a + " " + b + " " + Math.round(num));
          return;
        }
      }
    }
    throw new Exception();
  }
}