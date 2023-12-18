import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    Main abc150A = new Main();
    System.out.println(abc150A.solve(A, B));
  }

  public String solve(int k, int x){
    return 500 * k >= x ? "Yes" : "No";
  }
}
