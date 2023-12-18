import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();

    StringBuilder sb = new StringBuilder();

    if (N == 0) {
      sb.append('0');
    }

    while (N != 0) {
      int i = N % -2;
      sb.append(i == 0 ? '0' : '1');
      if (i != 0) N -= 1;
      N /= -2;
    }

    sb.reverse();
    System.out.println(sb.toString());
  }
}
