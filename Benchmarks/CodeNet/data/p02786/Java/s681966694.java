import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long h = Long.valueOf(sc.next());

    int step = 0;
    for (long n = h; h > 0; h /= 2) {
      step++;
    }

    System.out.println((long)Math.pow(2, step)-1);

    sc.close();
  }

}
