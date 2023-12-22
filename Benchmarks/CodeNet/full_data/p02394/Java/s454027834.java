import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created 2017/06/01.
 */
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> ary = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      int input = sc.nextInt();
      ary.add(input);
    }

    int w = ary.get(0);
    int h = ary.get(1);
    int x = ary.get(2);
    int y = ary.get(3);
    int r = ary.get(4);

    //????????¨??????????¨????
    double cs = r * r * 3.14;
    int rs = w * h;
    int x_max = x + r;
    int y_max = y + r;

    //????????¨??????
    if (rs < cs) {
      System.out.println("No");
    } else if (x < 0 || y < 0) {
      System.out.println("No");
    } else if (w < x_max || h < y_max) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}