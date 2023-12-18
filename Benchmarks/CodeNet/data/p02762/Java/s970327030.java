

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
  private static List<Set<Integer>> friend = new ArrayList<>();
  private static List<Set<Integer>> block = new ArrayList<>();
  private static boolean[] isVisited;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int k = scanner.nextInt();
    isVisited = new boolean[n];
    for (int i = 0; i < n; i++) {
      friend.add(new HashSet<>());
      block.add(new HashSet<>());
    }
    for (int i = 0; i < m; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      friend.get(a - 1)
          .add(b-1);
      friend.get(b - 1)
          .add(a-1);
    }
    for (int i = 0; i < k; i++) {
      int c = scanner.nextInt();
      int d = scanner.nextInt();
      block.get(c - 1)
          .add(d-1);
      block.get(d - 1)
          .add(c-1);
    }

    for (int i = 0; i < n; i++) {
      int count = 0;
      for (int j = 0; j < n; j++) {
        if(!friend.get(i).contains(j) && !block.get(i).contains(j)) {
          Arrays.fill(isVisited,false);
          if(isCandidate(i, j)) {
            count++;
          }
        }
      }
      System.out.print(count-1 + " ");
    }
  }

  private static boolean isCandidate(final int p1, final int p2) {
    for (int i : friend.get(p1)) {
      if(!isVisited[i]) {
        isVisited[i] = true;
        if (i == p2 || isCandidate(i, p2)) {
          return true;
        }
      }
    }
    return false;
  }

}


