import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] a = new int[n][];
    for(int i = 0; i<n; i++) {
        a[i] = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
    }
    for(int i = 1; i<n; i++) {
        a[i][0]+=Math.max(a[i-1][1], a[i-1][2]);
        a[i][1]+=Math.max(a[i-1][0], a[i-1][2]);
        a[i][2]+=Math.max(a[i-1][0], a[i-1][1]);
    }
    System.out.println(Math.max(a[n-1][0], Math.max(a[n-1][2], a[n-1][1])));
  }
}