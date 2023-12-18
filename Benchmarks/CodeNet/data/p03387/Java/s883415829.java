import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    
    int sum = A+B+C;
    int max = Math.max(Math.max(A, B), C);
    int sup = max*3;
    
    if ((sup - sum)%2 == 1) {
      sup += 3;
    }
    System.out.println((sup - sum)/2);
  }
}
