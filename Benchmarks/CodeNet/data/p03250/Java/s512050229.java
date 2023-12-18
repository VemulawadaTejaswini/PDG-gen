import java.util.*;
import java.io.*;

class Main {
  public static long ene(int k, int kyori) {
    return (long)Math.pow(k+1, 2) * (long)kyori;
  }
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      System.out.println(A * 10 + B + C);
    }
  }
}
