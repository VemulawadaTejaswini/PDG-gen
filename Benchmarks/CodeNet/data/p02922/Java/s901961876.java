import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int consent = 1;
    int count = 0;
    while (consent < B) {
      consent += A - 1;
      count++;
    }
    System.out.println(count);
  }
}