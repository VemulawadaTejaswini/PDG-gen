import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
    int ten_k = k / 10;
    int count = 0;

    for (int i=0; i <= ten_k; i++) {
      for (int j=2; j <= 10; j++) {
        System.out.println((int)(Math.pow(10, i) * j - 1));;
        count++;

        if (count == k) break;
      }
    }
  }
}
