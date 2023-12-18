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
    
    String[] s= br.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int m = Integer.parseInt(s[1]);
    int[][] mat = new int[n][m];
    for (int i=0; i<n; i++) {
      s = br.readLine().split(" ");
      for (int j=0; j<m; j++) {
        mat[i][j] = Integer.parseInt(s[j])-1;
      }
    }
    int[] ptrs = new int[n];
    HashSet<Integer> removed = new HashSet<Integer>();
    int minMax = m+1;
    while (removed.size()<m) {
      int[] count = new int[m];
      for (int j=0; j<n; j++) {
        int v = mat[j][ptrs[j]];
        while (removed.contains(v)) {
          ptrs[j]++;
          v = mat[j][ptrs[j]];
        }
        count[v]++;
      }
      int max = 0;
      for (int j=0; j<m; j++) {
        if (count[j]>max) {
          max = count[j];
        }
      }
      if (max<minMax)
        minMax = max;
      for (int j=0; j<m; j++) {
        if (count[j]==max)
          removed.add(j);
      }
    }
    System.out.println(minMax);
  }
}
