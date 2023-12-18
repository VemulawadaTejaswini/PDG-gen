import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     int n = sc.nextInt();

    int ans = n / 2;
    if (n % 2 == 0)
      ans--;

    System.out.println(ans);
  }
}