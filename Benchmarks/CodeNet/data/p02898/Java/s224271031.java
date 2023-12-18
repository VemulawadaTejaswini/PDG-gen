import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nk = Stream.of(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
    int n = nk[0];
    int k = nk[1];
    int[] h = Stream.of(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
    sc.close();
    int counter = 0;
    for (int hi: h) {
      if (hi >= k) {
        counter++;
      }
    }
    System.out.println(counter);
  }
}