
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);
    int n = cin.nextInt();
    int[] vertex = new int[n];
    int[] a = new int[n-1];
    int[] b = new int[n-1];
    for (int i = 0; i < (n - 1) * 2; i++) {
      int t = cin.nextInt();
      vertex[t - 1]++;
      if (i%2==0)
        a[i/2] = t;
      else {
        b[(i-1)/2] = t;
      }
    }

    int[] num = new int[n];
    for (int i = 0; i < n; i++) {
      num[i] = cin.nextInt();
    }
    Arrays.sort(num);
//    for (int i:num) {
//      System.out.println(i);
//    }

    int[] res = new int[n];
    List<Point> save = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      Point p = new Point(i + 1, vertex[i]);
      save.add(p);
    }
    save.sort((o1, o2) -> o2.degree - o1.degree);
    int pos = num.length - 1;
    for (Point p: save) {
      //System.out.println("degree: "+p.degree);
      int t = num[pos];
      res[p.vertex-1] = t;
      pos--;
      //System.out.println("vertex: "+p.vertex);
    }

    int resSum = 0;
    for (int i=0;i<n-1;i++) {
      int pos1 = a[i]-1;
      int pos2 = b[i]-1;
      resSum += Math.min(res[pos1], res[pos2]);
    }

    StringBuilder sb = new StringBuilder();
    for (int i:res) {
      sb.append(i);
      sb.append(" ");
    }
    System.out.println(resSum);
    String resS = sb.toString().trim();
    System.out.println(resS);

  }

  static class Point {
    int vertex;
    int degree;

    Point(int a, int b) {
      vertex = a;
      degree = b;
    }
  }

}