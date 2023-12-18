import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int N = sc.nextInt();
      int count = 0;
      int[] list = new int[N];
      for (int i = 0; i < N; i++) {
        list[i] = sc.nextInt();
      }
      int pre = list[0];
      for (int i = 1; i < list.length; i++) {
        if (pre == list[i]) {
          for (int j = 1; j < 10000; j++) {
            if (j != list[i-1] && j != list[(i+1) % list.length]) {
              list[i] = j;
              pre = list[i];
              count += 1;
              break;
            }
          }
        } else {
          pre = list[i];
        }
      }
      System.out.println(count);
      //while(check(list))
    }
  }
}
