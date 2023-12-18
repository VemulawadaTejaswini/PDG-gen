import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    long i = 1;
    while (true) {
      if (i % N == 0 && i % 2 == 0) {
        break;
      }
      i++;
    }

    System.out.println(i);
  }
}