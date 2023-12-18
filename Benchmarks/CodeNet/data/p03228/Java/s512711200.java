import java.util.*;


import java.io.*;

class Main {

  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int A = sc.nextInt();
      int B = sc.nextInt();
      int K = sc.nextInt();
      for (int i = 0; i < K; i++) {
        if (i % 2 == 0) {
          if (A % 2 == 1) {
            A --;
          }
          A /= 2;
          B += A;
        } else {
          if (B % 2 == 1) {
            B--;
          }
          B /= 2;
          A += B;
        }
      }
      System.out.printf("%d %d", A, B);
    }
  }
}
