import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] b = new int[n-1];
    for (int i = 0; i < n-1; i++) {
        b[i] = sc.nextInt();
    }

    int[] a = new int[n];

    a[a.length-1] = b[b.length-1];
    a[0] = b[0];

    for (int i = a.length - 2; i > 0; i--) {
        a[i] = b[i-1] < b[i] ? b[i-1] : b[i];
    }

    System.out.println(IntStream.of(a).sum());
  }
}