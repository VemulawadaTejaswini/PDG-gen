

import java.util.Scanner;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int[] points = new int[n];
    for(int i = 0; i < n; i++){
      points[i] = scan.nextInt();
    }
    Arrays.sort(points);

    for(int i = 0; i < m; i++){
      points[points.length - 1] /= 2;
      Arrays.sort(points);
    }

    long sum = 0;
    for(int i = 0; i < n; i++){
      sum += (long)points[i];
    }
    System.out.println(sum);

  }
}
