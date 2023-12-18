import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int N = sc.nextInt();
    int num = 0;
    if (D == 0) {
      num = 1;
    } else if (D == 1) {
      num = 100;
    } 
    else if (D == 2) {
      num = 10000;
    }
    System.out.println(num * N);
  }
}