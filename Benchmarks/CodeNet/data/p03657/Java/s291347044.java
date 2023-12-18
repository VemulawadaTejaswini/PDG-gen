
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int[] arr = {A, B, A + B};
    
    for (int num : arr) {
      if (isPass(num)) {
        System.out.println("Possible");
        return;
      }
    }

    System.out.println("Impossible");
  }

  static boolean isPass(int num) {
    return (num >=3 && num % 3 == 0) ;
  }
}
