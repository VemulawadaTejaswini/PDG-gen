import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  private Scanner sc = new Scanner(System.in);

  private void run() {
    int A = sc.nextInt();
    int B = sc.nextInt();
    int M = sc.nextInt();

    int[] as = new int[A];
    int minA = 99999999;
    for (int i = 0; i < A; i++) {
      as[i] = sc.nextInt();
      minA = Math.min(minA, as[i]);
    }

    int[] bs = new int[B];
    int minB = 99999999;
    for (int i = 0; i < B; i++) {
      bs[i] = sc.nextInt();
      minB = Math.min(minB, bs[i]);
    }

    int minAplusB = minA + minB;
    int minPrice = minA + minB;

    for (int i = 0; i < M; i++) {
      int fridgeIdx = sc.nextInt() - 1;
      int microwaveIdx = sc.nextInt() - 1;
      int discountPrice = sc.nextInt();
      minPrice = Math.min(minPrice, as[fridgeIdx] + bs[microwaveIdx] - discountPrice);
    }

    System.out.println(minPrice);
  }
}
