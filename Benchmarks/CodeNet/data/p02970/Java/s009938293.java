import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    if (N % (D * 2 + 1) == 0) {
      System.out.println(N / (D * 2 + 1));
    } else {  
      System.out.println(N / (D * 2 + 1) + 1);
    }
  }
}