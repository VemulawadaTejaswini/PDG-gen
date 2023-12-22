import java.util.Scanner;
class Main {
  static public void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    while (a < n) {
      a += 1000;
    }
    System.out.println(a - n);
  }
}
