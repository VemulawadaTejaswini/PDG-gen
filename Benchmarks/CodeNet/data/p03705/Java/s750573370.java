import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    
    int count = (N - 2)*(B - A) + 1;
    
    if (N == 1 && A == B) {
      System.out.println(1);
    } else if (N == 1 && A != B) {
      System.out.println(0);
    } else if (N >= 2 && A > B) {
      System.out.println(0);
    } else if (N >= 2 && A <= B) {
      System.out.println(count);
    }
  }
  
}
