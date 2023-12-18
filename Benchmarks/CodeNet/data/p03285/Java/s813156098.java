import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    for (int c = 0; c <= 25; c++) {
      for (int d = 0; d <= 14; d++) {
        int total = 4*c + d*7;
        if (total == N) System.out.println("Yes");
        else System.out.println("No");
      }
    }
  }
}