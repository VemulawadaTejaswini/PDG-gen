import java.util.*;
import java.io.*;

class Main {
  public static long ene(int k, int kyori) {
    return (long)Math.pow(k+1, 2) * (long)kyori;
  }
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int N = sc.nextInt();
      int X = sc.nextInt();
      int[] arr = new int[N+1];
      for (int i = N-1; i >= 0; i--) {
        arr[i] = sc.nextInt();
      }
      arr[N] = 0;
      int i = 0;
      int k = 0;
      long cost = ene(k, arr[0]) + X;
      k++;
      while(i < N) {
        if (ene(k,arr[i]) + X + ene(0,arr[i+1]) + X + ene(1, arr[i+1]) < ene(k,arr[i] - arr[i+1]) + X + ene(k+1, arr[i+1])) {
          cost += ene(k,arr[i]) + X + ene(0,arr[i+1]) + X;
          k = 1;
        } else {
          cost += ene(k,arr[i] - arr[i+1]) + X;
          k++;
        }
        i++;

      }
      System.out.println(cost);
    }
  }
}
