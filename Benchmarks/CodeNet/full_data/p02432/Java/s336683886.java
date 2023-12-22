// ITP2_1_B Deque
import java.util.Scanner;

class Deque {
  int A[];
  int front = 500000, back = 499999;

  Deque() {
    A = new int[1000000];
  }

  void push(int d, int x) {
    if (d == 0) {
      front--;
      A[front] = x;
    } else {
      back++;
      A[back] = x;
    }
  }

  void pop(int d) {
    if (d == 0) {
      front++;
    } else {
      back--;
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.nextInt();
    Deque d = new Deque();
    while (sc.hasNext()) {
      switch (sc.nextInt()) {
        case 0:
          d.push(sc.nextInt(), sc.nextInt());
          break;
        case 1:
          System.out.println(d.A[d.front + sc.nextInt()]);
          break;
        case 2:
          d.pop(sc.nextInt());
      }
    }
  }
}
