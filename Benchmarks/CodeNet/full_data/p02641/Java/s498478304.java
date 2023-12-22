import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    List<Integer> listPlus = new ArrayList<>();
    List<Integer> listMinus = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int pi = sc.nextInt();
      int xpi = pi - x;
      if (xpi >= 0) {
        listPlus.add(xpi);
      } else {
        listMinus.add(xpi);
      }
    }
    int plusX = 0;
    for (int i = 0; i < 101; i++) {
      boolean check1 = true;
      for (Integer plus : listPlus) {
        if (i == plus) {
          check1 = false;
        }
      }
      if (check1) {
        plusX = i;
        break;
      }
    }
    int minusX = -101;
    for (int i = -1; i > -101; i--) {
      boolean check1 = true;
      for (Integer minus : listMinus) {
        if (i == minus) {
          check1 = false;
        }
      }
      if (check1) {
        minusX = i;
        break;
      }
    }
    int abs = Math.abs(minusX);
    if (plusX == abs) {
      System.out.println(x + minusX);
    } else if (plusX > abs) {
      System.out.println(x + minusX);
    } else {
      System.out.println(x + plusX);
    }
  }
}
