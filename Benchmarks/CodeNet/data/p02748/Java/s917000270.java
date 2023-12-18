import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private Scanner sc = new Scanner(System.in);

  private void run() {
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    
    int[] as = new int[A];
    int minA = 99999999;
    for (int i = 0; i < A; i++) {
      as[i] = Integer.parseInt(sc.next());
      minA = Math.min(minA, as[i]);
    }

    int[] bs = new int[B];
    int minB = 99999999;
    for (int i = 0; i < B; i++) {
      bs[i] = Integer.parseInt(sc.next());
      minB = Math.min(minB, bs[i]);
    }

    int minAplusB = minA + minB;
    int minPrice = minA + minB;

    for (int i = 0; i < M; i++) {
      int fridgeIdx = Integer.parseInt(sc.next()) - 1;
      int microwaveIdx = Integer.parseInt(sc.next()) - 1;
      int discountPrice = Integer.parseInt(sc.next());
      minPrice = Math.min(minPrice, as[fridgeIdx] + bs[microwaveIdx] - discountPrice);
    }

    System.out.println(minPrice);
  }
}
