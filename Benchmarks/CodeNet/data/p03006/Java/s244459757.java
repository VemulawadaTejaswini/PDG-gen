import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int[] x = new int[N];
      int[] y = new int[N];

      for (int i = 0; i < x.length; ++i) {
        x[i] = in.nextInt();
        y[i] = in.nextInt();
      }

      int minCost = Integer.MAX_VALUE;
      boolean[] isUsed = new boolean[N];
      
      for (int i = 0; i < x.length; ++i) {
        isUsed[i] = true;
        minCost = Math.min(minCost, sol(minCost, 1, i, 1, isUsed, x, y, x[i], y[i]));
        isUsed[i] = false;
      }
      

      System.out.println(minCost);
    }
  }

  private static int sol (int currMinCost, int currCost, int currPos, int usedNum, boolean[] isUsed, int[] x, int[] y, int p, int q) {
    //System.err.println(currPos + " " + usedNum + " " + currCost);
    if (currCost > currMinCost) { // prune
      return currCost;
    }

    if (usedNum == isUsed.length) {
      return currCost;
    } else {
      for (int i = 0; i < isUsed.length; ++i) {
        if (isUsed[i] == false) {
          isUsed[i] = true;

          int cost = 0;
          if (usedNum == 1) {
            p = x[i] - p;
            q = y[i] - q;
          } else {
            if (x[currPos] != x[i] - p || y[currPos] != y[i] - q) {
              cost = 1;
            }
          }

          currMinCost = Math.min(currMinCost, sol(currMinCost, currCost + cost, i, usedNum + 1, isUsed, x, y, p, q));
          isUsed[i] = false;
        }
      }
      
      return currMinCost;
    }
  }
}