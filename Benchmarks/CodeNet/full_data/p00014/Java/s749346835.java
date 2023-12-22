import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int x = d;
    int sum = 0;
    while(x < 600) {
      sum += x * x * d;
      x += d;
    }
    System.out.println(sum);
  }
}