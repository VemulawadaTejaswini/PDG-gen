import java.io.*;
import java.util.*;

public class Main {

  public static class City {
    int P;
    int Y;
    int index;

    public City(int P, int Y, int index) {
      this.P = P;
      this.Y = Y;
      this.index = index;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int M = Integer.parseInt(input[1]);
    int[] P = new int[M];
    int[] Y = new int[M];
    long[] ID = new long[M];
    City[] city = new City[M];
    for (int i = 0; i < M; i++) {
      input = br.readLine().split(" ");
      P[i] = Integer.parseInt(input[0]);
      Y[i] = Integer.parseInt(input[1]);
      city[i] = new City(P[i], Y[i], i);
    }
    Arrays.sort(city, (a, b) -> a.P == b.P ? a.Y - b.Y : a.P - b.P);
    int before = city[0].P;
    int order = 1;
    for (int i = 0; i < M; i++) {
      int now = city[i].P;
      if (before != now) {
        before = now;
        order = 1;
      }
      ID[city[i].index] = order;
      order++;
    }
    for (int i = 0; i < M; i++) {
      System.out.println(String.format("%06d", P[i]) + String.format("%06d", ID[i]));
    }
  }
}
