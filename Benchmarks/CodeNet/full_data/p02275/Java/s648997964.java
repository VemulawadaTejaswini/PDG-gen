import java.util.Scanner;

class Main {
  static int[] array = new int[10001];

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int times = Integer.parseInt(sc.next());
    int last = 0;
    int current = 0;

    for (int i = 0; i < times; i++) {
      current = Integer.parseInt(sc.next());
      array[current]++;
      if (last < current) {
        last = current;
      }
    }

    for (int i = 0; i <= last; i++) {
      for (int j = 0; j < array[i]; j++) {
        if (i == last && j == array[i] - 1) {
          System.out.println(i);
        } else {
          System.out.print(i + " ");
        }
      }
    }
  }
}

