import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    
    int a = n!;
    int b = m!;
    
    System.out.println(a+b);
  }
}