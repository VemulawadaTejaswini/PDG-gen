import java.util.Scanner;

class Main {
  static int MAX = 45;
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int[] array = new int[MAX];
    array[0] = 1;
    array[1] = 1;
    int time = sc.nextInt();

    for (int i = 2; i <= time; i++) {
      array[i] = array[i - 1] + array[i - 2];
    }

    System.out.println(array[time]);
  }
}

