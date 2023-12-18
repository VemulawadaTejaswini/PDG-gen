import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    int x = N * 800;
    int y = 200 * (N / 15) ;
    System.out.println(x-y);
  }
}
