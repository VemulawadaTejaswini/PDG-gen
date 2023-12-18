import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    String str = sc.next();
    for(int i = 0; i < 4; ++i) {
      System.out.print(str.charAt(i));
    }
    System.out.print(" ");
    for(int i = 0; i < 8; ++i) {
      System.out.print(str.charAt(i + 4));
    }
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }

}
