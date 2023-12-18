import java.util.*;
import java.math.*; 

public class Main {
  static BigDecimal a = new BigDecimal("2");
  static BigDecimal b = new BigDecimal("2");
  static BigDecimal c = new BigDecimal("1000000007");
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N= sc.nextInt();
    int[] A = new int[N];
    int check =0, total =0;
    for (int i =0; i<N; i++) {
      A[i] = sc.nextInt();
      if ((A[i] * N) % 2 != 0) {
        check++;
        break;
      }
      total += A[i];
    }
    if (total != N * N / 2) {
      check++;
    }
    
    if (check != 0) {
      System.out.println(0);
    } else {
      for (int i =2; i<= N/2; i++) {
        a = a.multiply(b);
      }
      a = a.remainder(c);
      System.out.println(a);
    }
  } 
}