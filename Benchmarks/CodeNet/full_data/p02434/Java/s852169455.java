// ITP2_1_A Vector

import java.util.Arrays;
import java.util.Scanner;

class Vector {
  int[] A;
  int length = 0;

  Vector() {
    A = new int[20];
  }

  void add(int x) {
    if (length == A.length) {
      A = Arrays.copyOf(A, length * 2);
    }
    A[length] = x;
    length++;
  }

  // pre : length > 0
  void deleteBack() {
    length--;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    if (length > 0) sb.append(A[0]);
    for (int i = 1; i < length; ++i) {
      sb.append(" ");
      sb.append(A[i]);
    }
    return sb.toString();
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), q = sc.nextInt();
    Vector[] v = new Vector[n];
    boolean[] active = new boolean[n];

    for (int i = 0; i < q; ++i) {
      int req = sc.nextInt(), t = sc.nextInt();
      switch (req) {
        case 0:
          if (!active[t]) {
            v[t] = new Vector();
            active[t] = true;
          }
          v[t].add(sc.nextInt());
          break;
        case 1:
          if (active[t]) System.out.println(v[t]);
          else System.out.println();
          break;
        case 2:
          active[t] = false;
          break;
      }
    }
  }
}
