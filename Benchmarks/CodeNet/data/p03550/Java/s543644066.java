import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());
    int z = Integer.parseInt(scanner.next());
    int w = Integer.parseInt(scanner.next());

    int[] a = new int[n];
    for (int i=0; i<n; i++) {
      a[i] = Integer.parseInt(scanner.next());
    }

    ArrayList<String> comb = new ArrayList<>();
    int comb_num = (int)(Math.pow(2, n-1));

    for(int i=0; i<comb_num; i++) {
      char[] comb_one = new char[n];
      Arrays.fill(comb_one, '0');

      String str = Integer.toBinaryString(i);
      int offset = n - str.length();
      int idx = str.indexOf('1');
      while(idx >= 0) {
        comb_one[idx + offset] = '1';
        idx = str.indexOf('1', idx+1);
      }

      comb.add(String.valueOf(comb_one));
    }

    int x_max=0, y_min=(int)(Math.pow(10, 9));
    for (String comb_one : comb) {
      int x_idx = comb_one.lastIndexOf('0');
      int y_idx = comb_one.lastIndexOf('1');

      int x = a[x_idx];
      int y = w;
      if (y_idx >= 0) {
        y = a[y_idx];
      }

      if (Math.abs(x-y) > Math.abs(x_max - y_min)) {
        x_max = x;
        y_min = y;
      }
    }

    System.out.println(x_max + " "+ y_min);

    System.out.println((int)Math.abs(x_max-y_min));
  }

}