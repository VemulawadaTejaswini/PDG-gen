import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    double num;

    System.err.print("num: ");
    num = sc.nextDouble();

    double temporaryNum = 1;

    while (num >= temporaryNum) {
      for (int i = 1; Math.pow(i, 2) <= num; i++) {
        for (int n = 2; Math.pow(i, n) <= num; n++) {
          if (temporaryNum < Math.pow(i, n)) {
            temporaryNum = Math.pow(i, n);
          }
        }
      }
    }
    System.out.println(temporaryNum);
    return;
  }
}
