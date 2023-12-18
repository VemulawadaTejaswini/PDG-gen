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
    int H = Integer.parseInt(s[0]);
    int W = Integer.parseInt(s[1]);
    int h = Integer.parseInt(s[2]);
    int w = Integer.parseInt(s[3]);

    if (h==1 && w==1) {
      System.out.println("No");
      System.exit(0);
    }
    int neg = -h*w;
    int[][] mat = new int[H][W];
    int sum =0;
    for (int i=0; i<H; i++) {
      for (int j=0; j<W; j++) {
        mat[i][j] = 1;
        if ((i+1)%h==0 && (j+1)%w==0) {
          mat[i][j] = neg;
        }
        sum += mat[i][j];
      }
    }
    if (sum>0) {
      System.out.println("Yes");
      for (int i=0; i<H; i++) {
        for (int j=0; j<W; j++) {
          sb.append(mat[i][j]);
          sb.append(" ");
        }
        sb.delete(sb.length()-1, sb.length());
        sb.append("\n");
      }
      System.out.print(sb);
    } else {
      for (int i=0; i<H; i++) {
        Arrays.fill(mat[i],0);
      }
      sum = 0;
      for (int i=0; i<H; i++) {
        for (int j=0; j<W; j++) {
          if ((i+1)%h==0 && (j+1)%w==0) {
            mat[i][j] = neg-1000;
          } else if (i%h==0 && j%w==0) {
            mat[i][j] = 1001;
          } else {
            mat[i][j] = 1;
          }
          sum += mat[i][j];
        }
      }

      if (sum>0) {
        System.out.println("Yes");
        for (int i=0; i<H; i++) {
          for (int j=0; j<W; j++) {
            sb.append(mat[i][j]);
            sb.append(" ");
          }
          sb.delete(sb.length()-1, sb.length());
          sb.append("\n");
        }
        System.out.print(sb);
      } else {
        System.out.println("No");
      }
    }
  }
}
