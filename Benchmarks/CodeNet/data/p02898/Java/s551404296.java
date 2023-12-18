import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int h;
    int counter = 0;
    for (int i = 0; i < N; i++) {
      h = sc.nextInt();
      if (h >= K) {
        counter++;
      }
    }
    System.out.println(counter);
  }
}
