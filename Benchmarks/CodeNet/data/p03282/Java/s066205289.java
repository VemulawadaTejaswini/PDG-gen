import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      String S = sc.next();
      Double K = sc.nextDouble();
      if (K == 1.0) {
        System.out.println(S.charAt(0));
      } else {
        int i = 0;
        while(S.charAt(i) == '1') {
          i++;
        }
        if (K < 101 && i == K) {
          System.out.println('1');
        } else {
          System.out.println(S.charAt(i));
        }
      }
    }
  }
}
