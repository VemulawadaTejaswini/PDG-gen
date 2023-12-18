import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[][] red = new int[n][2];
    int[][] blue = new int[n][2];

    for (int i = 0; i < n; ++i) {
      red[i][0] = sc.nextInt();
      red[i][1] = sc.nextInt();
    }

    for (int i = 0; i < n; ++i) {
      blue[i][0] = sc.nextInt();
      blue[i][1] = sc.nextInt();
    }

    ArrayList<int[]> redL = new ArrayList<>();
    Collections.addAll(redL, mergeSort(red));

    ArrayList<int[]> blueL = new ArrayList<>();
    Collections.addAll(blueL, mergeSort(blue));

    /*
    for (int[] i : redL) {
      System.out.print("(" + i[0] + ", " + i[1] + ")  ");
    }
    System.out.println();

    for (int[] i : blueL) {
      System.out.print("(" + i[0] + ", " + i[1] + ")  ");
    }
    System.out.println();
    */

    int res = 0;

    for (int j = redL.size() - 1; j >= 0; --j) {
      int[] rPoint = redL.get(j);
      for (int i = blueL.size() - 1; i >= 0; --i) {
        int[] bPoint = blueL.get(i);
        if (rPoint[0] < bPoint[0] && rPoint[1] < bPoint[1]) {
          ++res;
          blueL.remove(i);
          break;
        }
      }
    }

    blueL = new ArrayList<>();
    Collections.addAll(blueL, mergeSort(blue));

    int res2 = 0;

    for (int j = blueL.size() - 1; j >= 0; --j) {
      int[] bPoint = blueL.get(j);
      for (int i = redL.size() - 1; i >= 0; --i) {
        int[] rPoint = redL.get(i);
        if (rPoint[0] < bPoint[0] && rPoint[1] < bPoint[1]) {
          ++res2;
          redL.remove(i);
          break;
        }
      }
    }


    System.out.println(Math.max(res, res2));
  }

  public static int[][] mergeSort(int[][] a) {
    if (a.length <= 1)
      return a;

    int mid = a.length / 2;
    int[][] left = new int[mid][2];
    int[][] right = new int[a.length - mid][2];

    for (int i = 0; i < mid; ++i)
      left[i] = a[i];

    for (int i = mid; i < a.length; ++i)
      right[i - mid] = a[i];

    return merge(mergeSort(left), mergeSort(right));
  }

  public static int[][] merge (int[][] l, int[][] r) {
    int[][] merged = new int[l.length + r.length][2];

    int i = 0, j = 0, k = 0;
    while (i < l.length && j < r.length) {
      if (l[i][0] < r[j][0] || (l[i][0] == r[j][0] && l[i][1] <= r[i][1]))
      //if (l[i][0] + l[i][1] <= r[i][0] + r[i][1])
        merged[k++] = l[i++];
      else
        merged[k++] = r[j++];
    }

    while (i < l.length)
      merged[k++] = l[i++];
    while (j < r.length)
      merged[k++] = r[j++];

    return merged;
  }
}