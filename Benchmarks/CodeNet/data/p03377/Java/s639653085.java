import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int X = sc.nextInt();
    
    System.out.println(A <= X && A+B >= X ? "YES" : "NO");
  }
}