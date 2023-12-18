package ABC150;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

  public static void main(String args[]) throws IOException {

    final int F = 500; // 500円

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] sa = br.readLine().split(" ");
    int k = Integer.parseInt(sa[0]); // 枚数
    int x = Integer.parseInt(sa[1]); // 円
    br.close();

    if (F * k >= x) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
