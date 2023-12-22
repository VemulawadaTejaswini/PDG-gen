import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    d();
  }



  public static void d() {
    try (Scanner sc = new Scanner(System.in)) {
      int y = Integer.parseInt(sc.next());
      Integer[] a = new Integer[y];
      for (int z = 0; z < y; z++) {
        a[z] = Integer.parseInt(sc.next());
      }
      List<Integer> list = Arrays.asList(a);
      for (int xxx : list) {
        int xx = 0;
        for (int x = 0; x < y; x++) {
          if (xx == x) {
            continue;
          }
          if (xxx % list.get(x) == 0) {
            list.remove(xx);
            break;
          }
        }
        xx++;
      }

      int count = 0;
      Boolean flg = true;
      int aa = 0;
      for (int b : list) {
        int bb = 0;
        for (int c : list) {
          if (aa == bb) {
            bb++;
            continue;
          } else if (b % c == 0) {
            flg = false;
            break;
          }
          bb++;
        }
        if (flg) {
          count++;
        }
        aa++;
        flg = true;
      }
      System.out.println(count);
    } catch (Exception E) {
      System.out.println("エラー");
    }
  }
}