import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int first = 0;
    int second = 0;
    int third = 0;

    while (sc.hasNext()) {
      int m = sc.nextInt();
      if (m > first) {
        third = second;
        second = first;
        first = m;
      } else if (m > second) {
        third = second;
        second = m;
      } else if (m > third) {
        third = m;
      }
    }

    System.out.println(first);
    System.out.println(second);
    System.out.println(third);
  }
}