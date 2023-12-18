import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = N / 100;
    int B = (N / 10) % 10;
    int C = N % 10;
    
    if (A == 7|| B == 7 || C == 7) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}