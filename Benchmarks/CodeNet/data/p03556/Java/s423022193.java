import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int tmp = (int) Math.sqrt(n);
    System.out.println(tmp * tmp);

  }
}