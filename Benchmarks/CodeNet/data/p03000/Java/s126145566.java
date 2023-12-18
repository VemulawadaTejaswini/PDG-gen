import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    sc.nextLine();
    int[] l = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int count = 0;
    int d = 0;
    while (d <= x && count <= n) {
      count++;
      d += l[count - 1];
    }
    System.out.println(count);
  }
}