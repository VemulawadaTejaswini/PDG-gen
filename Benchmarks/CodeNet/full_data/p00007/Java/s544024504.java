import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    double debt = 100000;
    for (int i = 1; i <= n; i++) {
      debt = (debt * 1.05) / 1000;
      debt = Math.ceil(debt) * 1000;
    }
    System.out.println((int)debt);
  }
}