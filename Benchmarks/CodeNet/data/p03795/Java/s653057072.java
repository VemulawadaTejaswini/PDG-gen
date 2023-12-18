
import java.util.Scanner;

class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int x = 0;
    int y = 0;

      x = 800 * N;
      y = N / 15 * 200;
      System.out.println(x - y);

  }
}
