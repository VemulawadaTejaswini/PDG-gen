import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int[] xs = Arrays.stream(sc.nextLine().split(" ")).sorted(Comparator.reverseOrder()).mapToInt(Integer::parseInt)
        .toArray();
    int a = 0;
    int b = 0;
    int index = 0;
    for (int i = n - 1; i >= 0; i--) {
      if (index % 2 == 0)
        a += xs[i];
      else
        b += xs[i];
      index++;
    }

    System.out.println(a - b);
    sc.close();
  }
}
