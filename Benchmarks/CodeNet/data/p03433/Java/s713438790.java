import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();// 1円硬貨の枚数

    System.out.println((N % 500) <= A ? "Yes" : "No");
  }
}
