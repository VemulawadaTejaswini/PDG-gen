// ITP2_1_A Vector

import java.util.Arrays;
import java.util.Scanner;

class Vector {
  int[] A;
  int length = 0;

  Vector(int n) {
    A = new int[n];
  }

  void add(int x) {
    if (length == A.length) {
      A = Arrays.copyOf(A, length * 2);
    }
    A[length] = x;
    length++;
  }

  // pre : i < length
  int get(int i) {
    return A[i];
  }

  // pre : length > 0
  void deleteBack() {
    length--;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
    Vector v = new Vector(20);
    for (int i = 0; i < q; ++i) {
      switch (sc.nextInt()) {
        case 0:
          v.add(sc.nextInt());
          break;
        case 1:
          System.out.println(v.get(sc.nextInt()));
          break;
        case 2:
          v.deleteBack();
          break;
      }
    }
  }
}

