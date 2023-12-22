import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int price = sc.nextInt();
    int result = 1000 - (price % 1000);
    result = result == 1000 ? 0 : result;
    System.out.println(result);
    sc.close();
  }
}