import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int N = sc.nextInt();
      int X = sc.nextInt();
      int pre = sc.nextInt();
      int min = Math.abs(X - pre);
      for (int i = 0; i < N-1; i++) {
        int now = sc.nextInt();
        int tmp = Math.abs(X - now);
        if (tmp < min) {
          min = tmp;
        }
        tmp = Math.abs(pre - now);
        if (tmp < min) {
          min = tmp;
        }
        pre = now;
      }
      System.out.println(min);
    }
  }
}
