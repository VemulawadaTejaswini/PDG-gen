/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for(int i = 1; i<=N; i++){
      //N = 8
      //0 1 2 3 4 5 6 7
      //1 2 3 4 5 6 7 8
      String s = sc.next();
      if(s.equals("Y")){
        System.out.println("Four");
        System.exit(0);
      }
    }
    System.out.println("Three");
  }
}
