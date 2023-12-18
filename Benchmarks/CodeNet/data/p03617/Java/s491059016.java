/**
 * @author Finn Lidbetter
 */
import java.util.*;
import java.io.*;
import java.awt.geom.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String[] s = br.readLine().split(" ");
    long q = Long.parseLong(s[0]);
    long h = Long.parseLong(s[1]);
    long w = Long.parseLong(s[2]);
    long d = Long.parseLong(s[3]);
    long n = Long.parseLong(br.readLine());

    long cost1 = w;
    if (4*q<cost1) {
      cost1 = 4*q;
    }
    if (2*h<cost1) {
      cost1 = 2*h;
    }
    long cost = Long.MAX_VALUE;
    if (n%2==0) {
      cost = Math.min((n/2)*d, n*cost1);
    } else {
      cost = Math.min((n/2)*d + cost1, n*cost1);
    }
    System.out.println(cost);
  }
}
