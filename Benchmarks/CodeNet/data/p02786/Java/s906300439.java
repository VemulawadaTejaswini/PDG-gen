import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();

    int step = 0;
    for (int n = h; h > 0; h /= 2) {
      step++;
    }

    System.out.println((int)Math.pow(2, step)-1);

    sc.close();
  }

}
