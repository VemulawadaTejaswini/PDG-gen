import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());

    int a = N / 1000;
    int b = (N % 1000 ) / 100;
    int c = (N % 100 )  / 10;
    int d = N % 10;

    String msg = "No";
    if (a == b & a == c )
      msg = "Yes";
    else if (d == b & d == c)
      msg = "Yes";

    System.out.println(msg);

  }
}
